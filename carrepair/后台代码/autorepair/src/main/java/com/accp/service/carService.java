package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Car;
import com.accp.domain.CarExample;
import com.accp.domain.CarExample.Criteria;
import com.accp.mapper.CarMapper;

@Service
@Transactional
public class carService {

	@Autowired
	CarMapper cm;
	
	public List<Car> selectCarByCarBrandId(int carbrandid){
		CarExample example=new CarExample();
		example.createCriteria().andCarbrandidEqualTo(carbrandid);
		List<Car> list=cm.selectByExample(example);
		return list;
	}
	
	public List<Car> selectCarByCondition(String condition,int carbrandid){
		CarExample example=new CarExample();
		  Criteria cra=example.createCriteria();
		  if(condition==null) {
				return null;
			}
		  cra.andCarbrandidEqualTo(carbrandid).andCartypenameLike("%"+condition+"%");
		  Criteria cra2=example.createCriteria();
		  cra2.andCarbrandidEqualTo(carbrandid).andIdEqualTo(condition);
		  example.or(cra2);
		List<Car> list=cm.selectByExample(example);
		return list;
	}
	
	
	
}
