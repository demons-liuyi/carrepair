package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Post;
import com.accp.mapper.PostMapper;

@Service
@Transactional
public class postService {
	
	@Autowired
	PostMapper pm;
	
	public List<Post> selectAllPost(){
		List<Post> list=pm.selectByExample(null);
		return list;
	}
	
}
