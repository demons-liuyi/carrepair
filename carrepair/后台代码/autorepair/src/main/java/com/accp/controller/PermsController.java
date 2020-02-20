package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Jurisdiction;
import com.accp.service.PermissionsService;

@RestController
@RequestMapping("/perms")
public class PermsController {

	 @Autowired
	  PermissionsService permService;
	  
	  @GetMapping("/find") 
	  public List<Jurisdiction> findPermssions(HttpSession sessions){ 
		  return permService.findEachByUid(1); 
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
