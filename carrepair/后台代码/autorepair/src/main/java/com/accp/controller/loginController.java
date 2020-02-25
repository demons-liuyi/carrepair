package com.accp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Staff;
import com.accp.service.staffService;

@RestController
@RequestMapping("/login")
public class loginController {

	@Autowired
	staffService ss;
	
	@ResponseBody
	@RequestMapping("/selectStaffByAccountAndPassword")	 
	public String selectStaffByAccountAndPassword(String account,String password,HttpSession session) {	 
		Staff staff=ss.selectStaffByAccountAndPassword(account,password);
		System.out.println(staff.getStaffno());	 
		if(staff.getStaffno()==null||staff.getStaffno()==""||staff.getStaffno().equals("")||staff.getStaffno()==" ") {
			return "0";
		}
		session.setAttribute("staff", staff);
	 return staff.getStaffno();
		 
	}
	
}
