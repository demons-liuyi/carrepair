package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.domain.StaffExample.Criteria;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class staffService {

	@Autowired
	StaffMapper sm;
	
	public List<Staff> selectStaffPhone(){
		List<Staff> list=sm.selectStaffPhone();
		return list;
	}
	
	public List<Staff> selectStaffByCondition(String departmentname){
		List<Staff> list=sm.selectStaffByCondition(departmentname);
		return list;
	}
	
	public List<Staff> selectStaffByStaffNoOrName(String condition){
		StaffExample example=new StaffExample();
		Criteria cra=example.createCriteria();
		if(condition==null||condition.length()<=0) {
			return null;
		}
		cra.andNameLike("%"+condition+"%");
		Criteria cra2=example.createCriteria();
		cra2.andStaffnoLike("%"+condition+"%");
		example.or(cra2);
		List<Staff> list=sm.selectByExample(example);
		return list;
	}
	
	public List<Staff> selectStaffByCondition(Staff staff){
		StaffExample example=new StaffExample();	
		 Criteria cra= example.createCriteria();
		if(staff.getStaffno()!=null&&staff.getStaffno().length()>0) {
			cra.andStaffnoEqualTo(staff.getStaffno());
		}
		if(staff.getName()!=null&&staff.getName().length()>0) {
			cra.andNameLike("%"+staff.getName()+"%");
		}
		if(staff.getSex()!=null&&staff.getSex().length()>0) {
			cra.andSexEqualTo(staff.getSex());
		}
		if(staff.getSex()!=null&&staff.getSex().length()>0) {
			cra.andSexEqualTo(staff.getSex());
		}
		if(staff.getPostid()!=null&&staff.getPostid()>0) {
			 cra.andPostidEqualTo(staff.getPostid());
		}
		if(staff.getDepartmentid()!=null&&staff.getDepartmentid()>0) {
			cra.andDepartmentidEqualTo(staff.getDepartmentid());
		}
		//判断身体状况
		if(staff.getPhysicalcondition()!=null&&staff.getPhysicalcondition().length()>0) {
			cra.andPhysicalconditionEqualTo(staff.getPhysicalcondition());
		}
		//判断身高
		if(staff.getHeight()!=null&&staff.getHeight().length()>0) {
			cra.andHeightEqualTo(staff.getHeight());
		}
		//判断籍贯
		if(staff.getNativeplace()!=null&&staff.getNativeplace().length()>0) {
			cra.andNativeplaceEqualTo(staff.getNativeplace());
		}
		//判断民族
		if(staff.getNation()!=null&&staff.getNation().length()>0) {
			cra.andNationEqualTo(staff.getNation());
		}
		//判断婚姻状况
		if(staff.getMaritalstatus()!=null&&staff.getMaritalstatus().length()>0) {
			cra.andMaritalstatusEqualTo(staff.getMaritalstatus());
		}
		//判断学历
		if(staff.getEducationbackground()!=null&&staff.getEducationbackground().length()>0) {
			cra.andEducationbackgroundEqualTo(staff.getEducationbackground());
		}
		//判断毕业学校
		if(staff.getSchool()!=null&&staff.getSchool().length()>0) {
			cra.andSchoolEqualTo(staff.getSchool());
		}
		//判断专业
		if(staff.getMajor()!=null&&staff.getMajor().length()>0) {
			cra.andMajorEqualTo(staff.getMajor());
		}
		//判断专业资格
		if(staff.getProfessionalqualification()!=null&&staff.getProfessionalqualification().length()>0) {
			cra.andProfessionalqualificationEqualTo(staff.getProfessionalqualification());
		}
		//判断生日
		if(staff.getBirthdaydate()!=null) {
			cra.andBirthdaydateEqualTo(staff.getBirthdaydate());
		}
		//判断学位
		if(staff.getDegree()!=null&&staff.getDegree().length()>0) {
			cra.andDegreeEqualTo(staff.getDegree());
		}
		//判断编制
		if(staff.getAuthorizedstrength()!=null&&staff.getAuthorizedstrength().length()>0) {
			cra.andAuthorizedstrengthEqualTo(staff.getAuthorizedstrength());
		}
		//判断属性
		if(staff.getProperty()!=null&&staff.getProperty().length()>0) {
			cra.andPropertyEqualTo(staff.getProperty());
		}
		//判断身份证号
		if(staff.getIdcardno()!=null&&staff.getIdcardno().length()>0) {
			cra.andIdcardnoEqualTo(staff.getIdcardno());
		}
		//判断入职日期
		if(staff.getDateofentryone()!=null&&staff.getDateofentrytwo()!=null) {
			cra.andDateonboardBetween(staff.getDateofentryone(), staff.getDateofentrytwo());
		}
		//判断试用日期
		if(staff.getThetrialdateone()!=null&&staff.getThetrialdatetwo()!=null) {
			cra.andThetrialdueBetween(staff.getThetrialdateone(), staff.getThetrialdatetwo());
		}
		//判断合同开始
		if(staff.getContractstartdateone()!=null&&staff.getContractstartdatetwo()!=null) {
			cra.andContractstartBetween(staff.getContractstartdateone(), staff.getContractstartdatetwo());
		}
		List<Staff> list=sm.selectByExample(example);
		return list;
	}
	
	public Staff selectByStaffNo(String staffno) {
		Staff staff=sm.selectStaffByStaffNo(staffno);
		return staff;
	}
	
	public int deleteStaff(String staffno) {
		int i=sm.deleteByPrimaryKey(staffno);
		return i;
	}
	
	public int updateStaff(String staffno,int isdimission) {
		 Staff record=new Staff();
		 record.setIsdimission(isdimission);	
		 record.setStaffno(staffno);
		int i=sm.updateByPrimaryKeySelective(record);
		System.out.println(i);
		return i;
	}
}
