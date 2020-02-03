package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.mapper.DepartmentMapper;

@Service
@Transactional
public class departmentService {

	@Autowired
	DepartmentMapper dm;
	
	public List<Department> selectAllDepartment(){
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andParentidNotEqualTo(1).andParentidNotEqualTo(0);
		List<Department> list=dm.selectByExample(example);
		return list;
	}
	
	public int queryCountFromDepartment() {
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andParentidNotEqualTo(1).andParentidNotEqualTo(0);
		int i=dm.countByExample(example);
		return i;
	}
}
