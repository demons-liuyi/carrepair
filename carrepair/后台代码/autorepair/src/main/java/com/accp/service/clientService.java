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
	
	
	
	public Client selectClientInfoByNumber(String number) {
		Client client=cm.selectClientInfoByNumber(number);
		return client;
	}
	
	public int insertClientInfo(Client client) {
		int i=cm.insertSelective(client);
		return i;
	}
	
	public int updateClientInfoByNumber(Client client) {
		int i=cm.updateByPrimaryKeySelective(client);
		return i;
	}
	
	public Client selectMaxNumber() {
		Client client=cm.selectMaxNumber();
		return client;
	}

}
