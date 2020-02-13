package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Post;
import com.accp.domain.PostExample;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
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
		System.out.println(str);
		if (str.equals("")) {
			str=null;
			System.out.println("为空/"+str+"/");
		}
		return staffMapper.selectStaffAndPostName(str);
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
		StaffExample ex = new StaffExample();
		StaffExample.Criteria criteria = ex.createCriteria();
		
		return null;
	}
}
