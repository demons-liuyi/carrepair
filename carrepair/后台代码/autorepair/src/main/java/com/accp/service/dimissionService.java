package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Dimission;
import com.accp.domain.DimissionExample;
import com.accp.domain.Staff;
import com.accp.mapper.DimissionMapper;
import com.accp.mapper.StaffMapper;


@Service
@Transactional
public class dimissionService {

	@Autowired
	DimissionMapper dm;
	@Autowired
	StaffMapper sm;
	
	public List<Dimission> queryDimissionInfo(){
		List<Dimission> list=dm.selectDimissionInfo();
		return list;
	}
	
	public int addDimission(String staffno,Date dimissiondate,byte [] dimissioncause) {
		Dimission di=new Dimission();
		di.setStaffid(staffno);
		di.setDimissiondate(dimissiondate);
		di.setDimissioncause(dimissioncause);
		int i=dm.insertSelective(di);
		return i;
	}
	
	public int deleteDimission(String staffno) {
		DimissionExample example=new DimissionExample();
		example.createCriteria().andStaffidEqualTo(staffno);
		int i=dm.deleteByExample(example);
		return i;
	}
	
	public int queryCountFromDimission() {
		int i=dm.countByExample(null);
		return i;
	}
}
