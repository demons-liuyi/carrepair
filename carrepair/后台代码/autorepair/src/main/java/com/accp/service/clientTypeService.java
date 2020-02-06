package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Clienttype;
import com.accp.mapper.ClienttypeMapper;

@Service
@Transactional
public class clientTypeService {

	@Autowired
	ClienttypeMapper cm;
	
	public List<Clienttype> selectAllClientType(){
		List<Clienttype> list=cm.selectByExample(null);
		return list;
	}
	
}
