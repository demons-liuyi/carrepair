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
	
	public Staff selectStaffByAccountAndPassword(String account,String password) {
		System.out.println(account);
		System.out.println(password);
		Staff staff=sm.selectStaffByAccountAndPassword(account, password);
		System.out.println(staff.getStaffno());
		return staff;
	}
	
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
		//鍒ゆ柇韬綋鐘跺喌
		if(staff.getPhysicalcondition()!=null&&staff.getPhysicalcondition().length()>0) {
			cra.andPhysicalconditionEqualTo(staff.getPhysicalcondition());
		}
		//鍒ゆ柇韬珮
		if(staff.getHeight()!=null&&staff.getHeight().length()>0) {
			cra.andHeightEqualTo(staff.getHeight());
		}
		//鍒ゆ柇绫嶈疮
		if(staff.getNativeplace()!=null&&staff.getNativeplace().length()>0) {
			cra.andNativeplaceEqualTo(staff.getNativeplace());
		}
		//鍒ゆ柇姘戞棌
		if(staff.getNation()!=null&&staff.getNation().length()>0) {
			cra.andNationEqualTo(staff.getNation());
		}
		//鍒ゆ柇濠氬Щ鐘跺喌
		if(staff.getMaritalstatus()!=null&&staff.getMaritalstatus().length()>0) {
			cra.andMaritalstatusEqualTo(staff.getMaritalstatus());
		}
		//鍒ゆ柇瀛﹀巻
		if(staff.getEducationbackground()!=null&&staff.getEducationbackground().length()>0) {
			cra.andEducationbackgroundEqualTo(staff.getEducationbackground());
		}
		//鍒ゆ柇姣曚笟瀛︽牎
		if(staff.getSchool()!=null&&staff.getSchool().length()>0) {
			cra.andSchoolEqualTo(staff.getSchool());
		}
		//鍒ゆ柇涓撲笟
		if(staff.getMajor()!=null&&staff.getMajor().length()>0) {
			cra.andMajorEqualTo(staff.getMajor());
		}
		//鍒ゆ柇涓撲笟璧勬牸
		if(staff.getProfessionalqualification()!=null&&staff.getProfessionalqualification().length()>0) {
			cra.andProfessionalqualificationEqualTo(staff.getProfessionalqualification());
		}
		//鍒ゆ柇鐢熸棩
		if(staff.getBirthdaydate()!=null) {
			cra.andBirthdaydateEqualTo(staff.getBirthdaydate());
		}
		//鍒ゆ柇瀛︿綅
		if(staff.getDegree()!=null&&staff.getDegree().length()>0) {
			cra.andDegreeEqualTo(staff.getDegree());
		}
		//鍒ゆ柇缂栧埗
		if(staff.getAuthorizedstrength()!=null&&staff.getAuthorizedstrength().length()>0) {
			cra.andAuthorizedstrengthEqualTo(staff.getAuthorizedstrength());
		}
		//鍒ゆ柇灞炴��
		if(staff.getProperty()!=null&&staff.getProperty().length()>0) {
			cra.andPropertyEqualTo(staff.getProperty());
		}
		//鍒ゆ柇韬唤璇佸彿
		if(staff.getIdcardno()!=null&&staff.getIdcardno().length()>0) {
			cra.andIdcardnoEqualTo(staff.getIdcardno());
		}
		//鍒ゆ柇鍏ヨ亴鏃ユ湡
		if(staff.getDateofentryone()!=null&&staff.getDateofentrytwo()!=null) {
			cra.andDateonboardBetween(staff.getDateofentryone(), staff.getDateofentrytwo());
		}
		//鍒ゆ柇璇曠敤鏃ユ湡
		if(staff.getThetrialdateone()!=null&&staff.getThetrialdatetwo()!=null) {
			cra.andThetrialdueBetween(staff.getThetrialdateone(), staff.getThetrialdatetwo());
		}
		//鍒ゆ柇鍚堝悓寮�濮�
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
		return i;
	}
	public List<Staff> selectAllStaff(){
		return sm.selectByExample(null);
	}
}
