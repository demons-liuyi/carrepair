package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Jurisdiction;
import com.accp.domain.Post;
import com.accp.service.jurisdictionService;
import com.accp.service.postService;

@RestController
@RequestMapping("/rolePermissionSettings")
public class rolePermissionSettingsController {

	@Autowired
	postService ps;
	@Autowired
	jurisdictionService js;
	
	@RequestMapping("/selectJurisdictionByPostid")
	public List<Jurisdiction> selectJurisdictionByPostid(){
		return js.findEach();
	}
	
	@RequestMapping("/selectAllPostInfo")
	public List<Post> selectAllPostInfo(){
		List<Post> list=ps.selectAllPost();
		return list;
	}
	
}
