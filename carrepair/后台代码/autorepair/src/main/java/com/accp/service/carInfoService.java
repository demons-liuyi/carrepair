package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carinfo;
import com.accp.mapper.CarinfoMapper;

@Service
@Transactional
public class carInfoService {

	@Autowired
	CarinfoMapper cm;
	
	public List<Carinfo> selectCarInfoByClientNumber(String number){
		List<Carinfo> list=cm.selectCarInfoByClientNumber(number);
		return list;
	}
	
}
