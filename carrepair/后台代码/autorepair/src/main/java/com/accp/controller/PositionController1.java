package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.Post;
import com.accp.domain.Staff;
import com.accp.service.PositionService1;

@RestController
public class PositionController1 {
	
	@Autowired
	PositionService1 ps;
	//按条件查询岗位
	@PostMapping("/positionSelect")
	@ResponseBody
	public List<Post> selectPosition(@RequestBody Post po) {
		System.out.println("进入查询");
		return ps.selectPost(po);
	}
	
	//查询部门
	@ResponseBody
	@PostMapping("/selectDep")
	public List<Department> selectDep() {
		return ps.queryDepTable();
	}
	
	//按条件查询员工信息
	@PostMapping("/selectStaff")
	@ResponseBody
	public List<Staff> selectStaffByNameByidByPhone(@RequestBody String str){
		System.out.println(str);
		return ps.selectStaffTable(str);
	}
	
}
