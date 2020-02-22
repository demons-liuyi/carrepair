package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.RoleJurisdiction;
import com.accp.domain.RoleJurisdictionExample;
import com.accp.mapper.RoleJurisdictionMapper;

@Service
@Transactional
public class postJurisdictionService {

	
	@Autowired
	RoleJurisdictionMapper rm;
	
	public int insertJurisdictionInfo(Integer id,Integer postid,String judge) {
		RoleJurisdiction record=new RoleJurisdiction();
		record.setJurisdictionid(id);
		record.setOtherone(judge);
		record.setRoleid(postid);
		int i=rm.insertSelective(record);
		return i;
	}
	
	public int deleteAllJurisdictionByPostId(Integer postid) {
		RoleJurisdictionExample example=new RoleJurisdictionExample();
		example.createCriteria().andRoleidEqualTo(postid);
		int i=rm.deleteByExample(example);
		return i;
	}
	
}
