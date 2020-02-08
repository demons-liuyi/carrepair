package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public int insertClientType(Clienttype clienttype) {
		int i=cm.insertSelective(clienttype);
		return i;
	}
	
	public int updateClientType(Clienttype clienttype) {
		int i=cm.updateByPrimaryKeySelective(clienttype);
		return i;
	}
	
	public int deleteClientType(int id) {
		int i=cm.deleteByPrimaryKey(id);
		return i;
	}
}
