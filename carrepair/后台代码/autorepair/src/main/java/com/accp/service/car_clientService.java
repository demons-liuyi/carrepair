package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.CarClient;
import com.accp.domain.CarClientExample;
import com.accp.mapper.CarClientMapper;

@Service
@Transactional
public class car_clientService {

	@Autowired
	CarClientMapper ccm;
	
	public List<CarClient> selectCarClientByCarId(List<String> carnumber){
		CarClientExample example=new CarClientExample();
		example.createCriteria().andCaridIn(carnumber);
		List<CarClient> list=ccm.selectByExample(example);
		return list;
	}
	
}
