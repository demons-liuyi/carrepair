package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Client;
import com.accp.domain.ClientExample;
import com.accp.domain.ClientExample.Criteria;
import com.accp.domain.Coll;
import com.accp.mapper.CarinfoMapper;
import com.accp.mapper.ClientMapper;



@Service
@Transactional
public class clientService {
	
	@Autowired
	ClientMapper cm;
	@Autowired
	CarinfoMapper cim;
	
	
	
	
	public int insertClientAndCarinfo(Coll coll) {
		Date date=new Date();
		coll.getClient().setDate(date);
		int i=cm.insertSelective(coll.getClient());
		if(i>0) {
			coll.getCarInfo().setOtherone(coll.getClient().getNumber());
			int j=cim.insertSelective(coll.getCarInfo());
			i+=j;
		}
		return i;
	}
	
	public List<Client> selectClientInfo(){
		List<Client> list=cm.selectClientInfo();
		return list;
	}
	
	public List<Client> queryClientInfoByCondition(String condition){
		ClientExample example=new ClientExample();
		Criteria cra=example.createCriteria();
		 if(condition==null) {
				return null;
			}
		 cra.andNameLike("%"+condition+"%");
		 Criteria cra2=example.createCriteria();
		 cra2.andPhoneLike("%"+condition+"%");	 
		  example.or(cra2);
		  List<Client> list=cm.selectByExample(example);
		  return list;
	}
	
	public List<Client> selectClientByCondition(Client client){
		ClientExample example=new ClientExample();
		Criteria cra=example.createCriteria();
		if(client.getNumber()!=null&&client.getNumber().length()>0) {
			cra.andNumberEqualTo(client.getNumber());
		}
		if(client.getName()!=null&&client.getName().length()>0) {
			cra.andNameLike("%"+client.getName()+"%");
		}
		if(client.getTypeid()!=null&&client.getTypeid()>0) {
			cra.andTypeidEqualTo(client.getTypeid());
		}
		if(client.getLinkman()!=null&&client.getLinkman().length()>0) {
			cra.andLinkmanLike("%"+client.getLinkman()+"%");
		}
		if(client.getPhone()!=null&&client.getPhone().length()>0) {
			cra.andPhoneEqualTo(client.getPhone());
		}
		if(client.getAddress()!=null&&client.getAddress().length()>0) {
			cra.andAddressEqualTo(client.getAddress());
		}
		if(client.getRemark()!=null&&client.getRemark().length()>0) {
			cra.andRemarkEqualTo(client.getRemark());
		}
		if(client.getBorndate()!=null) {
			cra.andBorndateEqualTo(client.getBorndate());
		}
		if(client.getStaffno()!=null&&client.getStaffno().length()>0) {
			cra.andStaffnoEqualTo(client.getStaffno());
		}
		if(client.getCounselorname()!=null&&client.getCounselorname().length()>0) {
			cra.andCounselornameEqualTo(client.getCounselorname());
		}
		if(client.getSheng()!=null&&client.getSheng().length()>0) {
			cra.andShengEqualTo(client.getSheng());
		}
		if(client.getShi()!=null&&client.getShi().length()>0) {
			cra.andShiEqualTo(client.getShi());
		}
		if(client.getQv()!=null&&client.getQv().length()>0) {
			cra.andQvEqualTo(client.getQv());
		}
		List<Client> list=cm.selectByExample(example);
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
