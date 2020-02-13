package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Enginebrand;
import com.accp.mapper.EnginebrandMapper;

@Service
@Transactional
public class engineBrandService {

	@Autowired
	EnginebrandMapper em;
	
	public List<Enginebrand> selectAllEngineBrand(){
		List<Enginebrand> list=em.selectByExample(null);
		return list;
	}
	
}
