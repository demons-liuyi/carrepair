package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Post;
import com.accp.domain.PostExample;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.mapper.DepartmentMapper;
import com.accp.mapper.PostMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class PositionService1 {
	@Autowired
	PostMapper post;
	@Autowired 
	DepartmentMapper dep;
	@Autowired
	StaffMapper staffMapper;
	
	/**
	 * 查询所有的岗位
	 * @return 依据条件的返回结果
	 */
	public List<Post> selectPost(Post po ) {
		System.out.println(po.getPostname()+po.getId());
		PostExample example = new PostExample();
		PostExample.Criteria criteria = example.createCriteria();
		if (po.getId()!=null ) {
			criteria.andIdEqualTo(po.getId());
		}
		if (po.getPostname()!=null) {
			criteria.andPostnameLike("%"+po.getPostname()+"%");
		}
		return post.selectByExample(example);
	}
	/**
	 * 查询人事的部门表
	 * @return  所有的分支
	 */
	public List<Department> queryDepTable() {
		return dep.selectByExample(null);
	}
	
	/**
	 * 按照条件查询员工信息
	 * @param str 通过ajax发送的查询条件
	 * @return 返回符合条件的员工信息
	 */
	public List<Staff> selectStaffTable(String str) {
		System.out.println("*str["+str+"]");
		
		return staffMapper.selectStaffAndPostName(str);
	}
}
