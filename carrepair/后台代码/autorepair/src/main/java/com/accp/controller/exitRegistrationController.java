package com.accp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Dimission;
import com.accp.domain.Post;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.service.departmentService;
import com.accp.service.dimissionService;
import com.accp.service.postService;
import com.accp.service.staffService;

//离职登记Controller
@RestController
@RequestMapping("/exitRegistration")
public class exitRegistrationController {

	@Autowired
	dimissionService ds;
	@Autowired
	departmentService dms;
	@Autowired
	staffService ss;
	@Autowired
	postService ps;
	
	@RequestMapping("/selectAllPost")
	public List<Post> selectAllPost(){
		List<Post> list=ps.selectAllPost();
		return list;
	}
	
	@RequestMapping("/queryDimissionInfo")
	public List<Dimission> queryDimissionInfo(){
		List<Dimission> list=ds.queryDimissionInfo();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/queryDimissionInfoByCondition")
	public List<Dimission> queryDimissionInfoByCondition(@RequestBody Staff staff){
		List<Dimission> list=ds.queryDimissionInfo();
		List<Dimission> dimissionlist=new ArrayList<Dimission>();
		if(staff!=null) {		
			List<Staff> stafflist=ss.selectStaffByCondition(staff);
			for(int a=0;a<list.size();a++) {	 
				for(int b=0;b<stafflist.size();b++) {
					if(list.get(a).getStaffid().equals(stafflist.get(b).getStaffno())) {			
						dimissionlist.add(list.get(a));
						break;
					}				
				}			 
			}
		}else {
			dimissionlist=list;
		}		
		for(int i=0;i<dimissionlist.size();i++) {
			if(i==0) {
				dimissionlist.get(i).setCheck(true);
			}else {
				dimissionlist.get(i).setCheck(false);	
			}
		}
		return dimissionlist;
	}
	
	@RequestMapping("/selectDimissionInfoByStaffNoOrName")
	public List<Dimission> selectDimissionInfoByStaffNoOrName(String condition){
		List<Dimission> list=ds.queryDimissionInfo();
		List<Dimission> dimissionlist=new ArrayList<Dimission>();
		if(condition!=null&&condition.length()>0) {
			List<Staff> stafflist=ss.selectStaffByStaffNoOrName(condition);
			for(int a=0;a<list.size();a++) {	 
				for(int b=0;b<stafflist.size();b++) {
					if(list.get(a).getStaffid().equals(stafflist.get(b).getStaffno())) {			
						dimissionlist.add(list.get(a));
						break;
					}				
				}			 
			}
		}else {
			dimissionlist=list;
		}		
		for(int i=0;i<dimissionlist.size();i++) {
			if(i==0) {
				dimissionlist.get(i).setCheck(true);
			}else {
				dimissionlist.get(i).setCheck(false);	
			}
		}
		return dimissionlist;
	}
	
	@RequestMapping("/addDimission")
	public int addDimission(String staffname,String dimissiondate,String dimissioncause) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			 date=sdf.parse(dimissiondate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String [] group=staffname.split(" ");
		String staffno=group[0];
		byte [] qwe=dimissioncause.getBytes();
		int i=ds.addDimission(staffno,date, qwe);	 
		int j=ss.updateStaff(staffno,1);
		if(i>0&&j>0) {
			return i;
		}else {
			return 0;	 
		}	
	}
	
	@RequestMapping("/selectAllDepartment")
	public List<Department> selectAllDepartment(){
		List<Department> list=dms.selectAllDepartment();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectStaffByCondition")
	public List<Staff> selectStaffByCondition(String departmentname){
		List<Staff> list=ss.selectStaffByCondition(departmentname);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectByStaffNo")
	public Staff selectByStaffNo(String staffno) {
		Staff staff=ss.selectByStaffNo(staffno);
		return staff;
	}
	
	@RequestMapping("/staffRollback")
	public int staffRollback(String staffno) {
		int i=ss.updateStaff(staffno, 0);
		int j=ds.deleteDimission(staffno);
		if(i>0&&j>0) {
			return i;
		}else {
			return 0;	 
		}	
	}
}
