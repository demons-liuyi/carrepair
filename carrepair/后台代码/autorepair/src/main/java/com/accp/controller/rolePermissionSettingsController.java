package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Jurisdiction;
import com.accp.domain.Post;
import com.accp.service.jurisdictionService;
import com.accp.service.postJurisdictionService;
import com.accp.service.postService;
import com.accp.vo.JurisdictionInfo;

@RestController
@RequestMapping("/rolePermissionSettings")
public class rolePermissionSettingsController {

	@Autowired
	postService ps;
	@Autowired
	jurisdictionService js;
	@Autowired
	postJurisdictionService pjs;
	
	@RequestMapping("/updatePost")
	public String updatePost(Integer postId,String postName) {
		int i=ps.updatePost(postId, postName);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/insertPost")
	public String insertPost(Integer postId,String postName) {
		int i=ps.insertPost(postId, postName);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/deletePost")
	public String deletePost(Integer postId) {
		int i=ps.deletePost(postId);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/addJurisdictionInfo")
	public String addJurisdictionInfo(@RequestBody List<JurisdictionInfo> list) {
		int j=0;
		for(int i=0;i<list.size();i++) {
			 j=pjs.insertJurisdictionInfo(list.get(i).getId(), list.get(i).getPostid(), list.get(i).getJudge());
		}
		if(j>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/insertJurisdictionInfo")
	public String insertJurisdictionInfo(Integer id,Integer postid,String judge) {
		int i=pjs.insertJurisdictionInfo(id, postid, judge);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/deleteAllJurisdictionByPostId")
	public String deleteAllJurisdictionByPostId(Integer postid) {
		int i=pjs.deleteAllJurisdictionByPostId(postid);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/selectJurisdictionByPostid")
	public List<Jurisdiction> selectJurisdictionByPostid(Integer postid){
		return js.findEach(postid);
	}
	
	@RequestMapping("/selectAllPostInfo")
	public List<Post> selectAllPostInfo(){
		List<Post> list=ps.selectAllPost();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
}
