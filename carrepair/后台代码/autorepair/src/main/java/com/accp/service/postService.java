package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Post;
import com.accp.domain.RoleJurisdiction;
import com.accp.domain.RoleJurisdictionExample;
import com.accp.mapper.PostMapper;
import com.accp.mapper.RoleJurisdictionMapper;

@Service
@Transactional
public class postService {
	@Autowired
	PostMapper pm;
	@Autowired
	RoleJurisdictionMapper rm;
	
	public int deletePost(Integer postId) {
		RoleJurisdictionExample example=new RoleJurisdictionExample();
		example.createCriteria().andRoleidEqualTo(postId);
		int i=rm.deleteByExample(example);
		if(i>0) {
			int j=pm.deleteByPrimaryKey(postId);
			return j;
		}
		return 0;
	}
	
	public int insertPost(Integer postId,String postName) {
		int a=0;
		for(int i=0;i<25;i++) {
			RoleJurisdiction rj=new RoleJurisdiction();
			rj.setJurisdictionid(i+1);
			rj.setRoleid(postId);
			rj.setOtherone("2");
			int j=rm.insertSelective(rj);
			a+=j;
		}
		if(a>0) {
			Post post=new Post();
			post.setPostname(postName);
			post.setId(postId);		 
			int b=pm.insertSelective(post);
			return b;
		}
		return 0;
	}
	
	public int updatePost(Integer postId,String postName) {
		Post post=new Post();
		post.setId(postId);
		post.setPostname(postName);
		int i=pm.updateByPrimaryKeySelective(post);
		return i;
	}
	
	public List<Post> selectAllPost(){
		List<Post> list=pm.selectByExample(null);
		return list;
	}
	
}
