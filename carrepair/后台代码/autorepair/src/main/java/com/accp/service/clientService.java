package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Client;
import com.accp.mapper.ClientMapper;



@Service
@Transactional
public class clientService {
	
	@Autowired
	ClientMapper cm;
	
	public List<Client> selectClientInfo(){
		List<Client> list=cm.selectClientInfo();
		return list;
	}

}
