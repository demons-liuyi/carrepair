package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.NumberUtils;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.domain.CarbrandExample.Criteria;
import com.accp.mapper.CarbrandMapper;

@Service
@Transactional
public class carBrandService {

	@Autowired
	CarbrandMapper cm;
	
	public List<Carbrand> selectAllCarBrand(){
		List<Carbrand> list=cm.selectByExample(null);
		return list;
	}
	
	public List<Carbrand> selectCarBrandByCondition(String condition){
		CarbrandExample example=new CarbrandExample();
	   Criteria cra=example.createCriteria();
	   if(condition==null) {
			return null;
		}
	   cra.andCarbrandnameLike("%"+condition+"%");
	   Criteria cra2=example.createCriteria();
	   
	   try {
		cra2.andIdEqualTo(Integer.valueOf(condition));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		 
	}
	   example.or(cra2);
		List<Carbrand> list=cm.selectByExample(example);
		return list;
	}
	
}
