package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Jurisdiction;
import com.accp.domain.RoleJurisdiction;
import com.accp.domain.Staff;
import com.accp.service.PermissionsService;
import com.accp.service.jurisdictionService;
import com.accp.service.staffService;

@RestController
@RequestMapping("/perms")
public class PermsController {

	 @Autowired
	  PermissionsService permService;
	 @Autowired
	 staffService ss;
	 @Autowired
	 jurisdictionService js;
	 
	  
	 @GetMapping("/findJurisdictionByStaffno")
	 public List<Jurisdiction> findJurisdictionByStaffno(String staffno){
		 Staff staff=ss.selectByStaffNo(staffno);
		 List<Jurisdiction> list=js.findJurisdictionByStaffno(staff.getPostid());
		 return list;
	 }
	 
	  @GetMapping("/find") 
	  public List<Jurisdiction> findPermssions(String staffno){ 
		  Staff staff=ss.selectByStaffNo(staffno);
		  return permService.findEachByUid(staff.getPostid()); 
		  
		  }
	  
	  @GetMapping("/finds") 
	  public List<Jurisdiction> findPid(HttpSession sessions,Integer parentid)
	  { 
		  int parentids=1;
		  if(parentid!=null) {
			  parentids=parentid; 
			  } 
		  return permService.findEachByParentid(parentids);
		  }
	  
	  @GetMapping("/findById")
	  public Jurisdiction findById(Integer pid) {
		  return permService.findById(pid);
		  }
	
}
