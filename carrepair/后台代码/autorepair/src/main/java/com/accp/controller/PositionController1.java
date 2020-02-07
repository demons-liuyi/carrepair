package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Post;
import com.accp.service.PositionService1;

@RestController
public class PositionController1 {
	
	@Autowired
	PositionService1 ps;
	
	@PostMapping("/positionSelect")
	@ResponseBody
	public List<Post> selectPosition(@RequestBody Post po) {
		System.out.println("进入查询");
		return ps.selectPost(po);
	}
	
}
