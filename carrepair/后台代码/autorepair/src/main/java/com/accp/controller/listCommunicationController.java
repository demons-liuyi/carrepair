package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Dimission;
import com.accp.domain.Staff;
import com.accp.service.staffService;

//离职登记Controller
@RestController
@RequestMapping("/listCommunication")
public class listCommunicationController {
	
	@Autowired
	staffService ss;
	
	@RequestMapping("/selectStaffPhone")
	public List<Staff> selectStaffPhone(){
		List<Staff> list=ss.selectStaffPhone();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectStaffPhoneByCondition")
	public List<Staff> selectStaffPhoneByCondition(@RequestBody Staff staff){
		List<Staff> list=ss.selectStaffPhone();
		List<Staff> newlist=new ArrayList<Staff>();
		if(staff!=null) {
			List<Staff> stafflist=ss.selectStaffByCondition(staff);
			for(int a=0;a<list.size();a++) {	 
				for(int b=0;b<stafflist.size();b++) {
					if(list.get(a).getStaffno().equals(stafflist.get(b).getStaffno())) {			
						newlist.add(list.get(a));
						break;
					}				
				}			 
			}
		}else {
			newlist=list;
		}
		for(int i=0;i<newlist.size();i++) {
			if(i==0) {
				newlist.get(i).setCheck(true);
			}else {
				newlist.get(i).setCheck(false);	
			}
		}
		return newlist;
	}
	
	@RequestMapping("/selectStaffPhoneByStaffNoOrName")
	public List<Staff> selectStaffPhoneByStaffNoOrName(String condition){
		List<Staff> list=ss.selectStaffPhone();
		List<Staff> newlist=new ArrayList<Staff>();
		if(condition!=null&&condition.length()>0) {
			List<Staff> stafflist=ss.selectStaffByStaffNoOrName(condition);
			for(int a=0;a<list.size();a++) {	 
				for(int b=0;b<stafflist.size();b++) {
					if(list.get(a).getStaffno().equals(stafflist.get(b).getStaffno())) {			
						newlist.add(list.get(a));
						break;
					}				
				}			 
			}
		}else {
			newlist=list;
		}
		for(int i=0;i<newlist.size();i++) {
			if(i==0) {
				newlist.get(i).setCheck(true);
			}else {
				newlist.get(i).setCheck(false);	
			}
		}
		return newlist;
	}

}
