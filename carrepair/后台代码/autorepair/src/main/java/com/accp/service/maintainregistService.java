package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Maintainregist;
import com.accp.domain.MaintainregistExample;
import com.accp.mapper.MaintainregistMapper;

@Service
@Transactional
public class maintainregistService {

	@Autowired
	MaintainregistMapper mm;
	
	public List<Maintainregist> selectMaintainregistInfoByCarNumber(String carNumber){
		MaintainregistExample example=new MaintainregistExample();
		example.createCriteria().andOtheroneEqualTo(carNumber);
		List<Maintainregist> list=mm.selectByExample(example);
		return list;
	}
	
}
