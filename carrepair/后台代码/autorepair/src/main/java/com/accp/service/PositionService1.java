package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Cashier;
import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Post;
import com.accp.domain.PostExample;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.mapper.CashierMapper;
import com.accp.mapper.DepartmentMapper;
import com.accp.mapper.PostMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class PositionService1 {
	@Autowired
	PostMapper post;
	@Autowired 
	DepartmentMapper dep;
	@Autowired
	StaffMapper staffMapper;
	
	@Autowired
	CashierMapper cashierMapper;
	/**
	 * 查询所有的岗位
	 * @return 依据条件的返回结果
	 */
	public List<Post> selectPost(Post po ) {
//		PostExample example = new PostExample();
//		PostExample.Criteria criteria = example.createCriteria();
//条件查询
//		if (po.getId()!=null ) {
//			criteria.andIdEqualTo(po.getId());
//		}
//		if (po.getPostname()!=null) {
//			criteria.andPostnameLike("%"+po.getPostname()+"%");
//		}
//		return post.selectByExample(example);
		return post.selectByExample(null);
	}
	/**
	 * 查询所有的post
	 * @return
	 */
	public List<Post> selectPostAll(){
		return post.selectByExample(null);
	}
	/**
	 * 查询人事的部门表
	 * @return  所有的分支
	 */
	public List<Department> queryDepTable() {
		return dep.selectByExample(null);
	}

	/**
	 * 按照条件查询员工信息
	 * @param str 通过ajax发送的查询条件
	 * @return 返回符合条件的员工信息
	 */
	public List<Staff> selectStaffTable(String str) {
		return staffMapper.selectStaffAndPostName(str);
	}
	/**
	 * 查询单表 的staff信息
	 * @param str
	 * @return
	 */
	public List<Staff> SelectStaffTableAll(String str) {
		
		System.out.println("str="+str);
			StaffExample ex = new StaffExample();
			StaffExample.Criteria criteria= ex.createCriteria();
			StaffExample.Criteria criteria1= ex.createCriteria();
			StaffExample.Criteria criteria2= ex.createCriteria();
			criteria.andStaffnoLike("%"+str+"%");
			criteria1.andPhoneLike("%"+str+"%");
			criteria2.andNameLike("%"+str+"%");
			ex.or(criteria1);
			ex.or(criteria2);
			return staffMapper.selectByExample(ex);
	}
	
	/**
	 * 新增post
	 * @param po
	 * @return integer
	 */
	public Integer addPost(Post po) {
		return post.insert(po);
	}
	
	/**
	 * 修改post
	 * @param po
	 * @return integer
	 */
	public Integer updatePost(Post po) {
		return post.updateByPrimaryKey(po);
	}
	
	/**
	 * 查询一个post是否存在
	 * @param po
	 * @return  0 不存在或1存在
	 */
	public Integer selectPostById(Post po) {
		if ( post.selectByPrimaryKey(po.getId())==null) {
			System.out.println("[sevice] 查询单条Post记录返回："+ post.selectByPrimaryKey(po.getId()));
			return 0;
		}
		return 1;
	}
	
	/**
	 * 删除一条数据
	 * @param po
	 * @return
	 */
	public Integer deletePost(Post po) {
		return post.deleteByPrimaryKey(po.getId());
	}
	
	
	/**
	 * 新增一條staff信息
	 * @param sta
	 * @return
	 */
	public Integer addStaff(Staff sta) {
		return  staffMapper.insert(sta);
	}
	
	public Integer updateStaff(Staff sta) {
		return staffMapper.updateByPrimaryKey(sta);
	}
	
	public Integer delStaff(String staffno) {
		return staffMapper.deleteByPrimaryKey(staffno);
	}
	public Integer selectStaffById(String staffno) {
		if (staffMapper.selectByPrimaryKey(staffno)!=null) {
			return 1;
		}
		return 0;
	}
	public Staff selecLastStaff() {
		//最后的的no
		
		return staffMapper.selectStaffByNoLast();
	}
	public Staff selecStaffByNo(String staffno) {
		return staffMapper.selectByPrimaryKey(staffno);
	}
	
	/**
	 * 验证密码
	 * @param staffno
	 * @param pwd
	 * @return 
	 */
	public Integer selectStaffByNoAndPass(String no,String pwd) {
		StaffExample example = new StaffExample();
		StaffExample.Criteria criteria = example.createCriteria();
		criteria.andStaffnoEqualTo(no);
		criteria.andPasswordEqualTo(pwd);
		if (staffMapper.selectByExample(example)!=null) {
			return 1;
		}
		return 0;
	}
	/***
	 * 修改staff空值部分不修改
	 * @param sta
	 * @return
	 */
	public Integer updatePasswrod(Staff sta) {
		StaffExample example = new StaffExample();
		StaffExample.Criteria criteria = example.createCriteria();
		criteria.andStaffnoEqualTo(sta.getStaffno());
		return staffMapper.updateByExampleSelective(sta, example);
	}
	/**
	 * 按部门查询staff
	 * @param depid
	 * @return list
	 */
	public List<Staff> selectStaffByDepId(Integer depid) {
		if (depid==0) {
			return staffMapper.selectByExample(null);
		}
		StaffExample example = new StaffExample();
		StaffExample.Criteria criteria = example.createCriteria();
		criteria.andDepartmentidEqualTo(depid);
		return staffMapper.selectByExample(example);
	}
	
	/**
	 * 新增一条结账数据
	 * @return
	 */
	public Integer addCashier(Cashier record){
		return cashierMapper.insert(record);
	}
	
	/**
	 * 根据模态框里的条件查询staff 
	 * @param staff
	 * @return
	 */
	public List<Staff> selectStaffByMany(Staff staff) {
		StaffExample ex = new StaffExample();
			StaffExample.Criteria criteria= ex.createCriteria();
			if (staff.getStaffno()!=null&&!"".equals(staff.getStaffno())) {
				criteria.andStaffnoLike("%"+staff.getStaffno()+"%");
			}
			if (staff.getName()!=null&& !"".equals(staff.getName())) {
				criteria.andNameLike("%"+staff.getName()+"%" );
			}
			if (staff.getSex()!=null&&!"".equals(staff.getSex())) {
				criteria.andSexLike("%"+staff.getSex()+"%");
			}
			if (staff.getDepartmentid()!=null&&!"".equals(staff.getDepartmentid())) {
				criteria.andDepartmentidEqualTo(staff.getDepartmentid());
			}
			if (staff.getPostid()!=null&&!"".equals(staff.getPostid())) {
				criteria.andPostidEqualTo(staff.getPostid());
			}
			if (staff.getPhysicalcondition()!=null&&!"".equals(staff.getPhysicalcondition())) {
				criteria.andPhysicalconditionEqualTo(staff.getPhysicalcondition());
			}
			if (staff.getHeight()!=null&&!"".equals(staff.getHeight())) {
				criteria.andHeightGreaterThanOrEqualTo(staff.getHeight());
			}
			if (staff.getNativeplace()!=null&&!"".equals(staff.getNativeplace())) {
				criteria.andNativeplaceLike("%"+staff.getNativeplace()+"%");
			}
			if (staff.getNation()!=null&&!"".equals(staff.getNation())) {
				criteria.andNationEqualTo(staff.getNation());
			}
			if (staff.getMaritalstatus()!=null&&!"".equals(staff.getMaritalstatus())) {
				criteria.andMaritalstatusEqualTo(staff.getMaritalstatus());
			}
			if (staff.getEducationbackground()!=null&&!"".equals(staff.getEducationbackground())) {
				criteria.andEducationbackgroundLike("%"+staff.getEducationbackground()+"%");
			}
			if (staff.getSchool()!=null&&!"".equals(staff.getSchool())) {
				criteria.andSchoolLike("%"+staff.getSchool()+"%");
			}
			if (staff.getMajor()!=null&&!"".equals(staff.getMajor())) {
				criteria.andMajorLike("%"+staff.getMajor()+"%");
			}
			if (staff.getAuthorizedstrength()!=null&&!"".equals(staff.getAuthorizedstrength())) {
				criteria.andAuthorizedstrengthLike("%"+staff.getAuthorizedstrength()+"%");
			}
			if (staff.getContractstart()!=null&&!"".equals(staff.getContractstart())) {
				criteria.andContractstartLessThanOrEqualTo(staff.getContractstart());
			}
			if (staff.getAgreementends()!=null&&!"".equals(staff.getAgreementends())) {
				criteria.andAgreementendsLessThanOrEqualTo(staff.getAgreementends());
			}
			
		return staffMapper.selectByExample(ex);
	}
}
