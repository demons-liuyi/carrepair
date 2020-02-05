package com.accp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carinfo;
import com.accp.domain.Client;
import com.accp.service.carInfoService;
import com.accp.service.clientService;


//客户资料Controller
@RestController
@RequestMapping("/customerData")
public class customerDataController {
		
	@Autowired
	clientService cs;
	@Autowired
	carInfoService cis;
	
	@RequestMapping("/selectClientInfo")
	public List<Client> selectClientInfo(){
		List<Client> list=cs.selectClientInfo();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectMaxNumber")
	public Client selectMaxNumber() {
		Client client=cs.selectMaxNumber();
		return client;
	}
	
	@RequestMapping("/insertClientInfo")
	public String insertClientInfo(@RequestBody Client client) {
		Date date=new Date();
		client.setDate(date);
		 int i=cs.insertClientInfo(client);
		 if(i>0) {
			 return "1";
		 }else {
			 return "0";
		 }
	}
	
	@RequestMapping("/updateClientInfoByNumber")
	public String updateClientInfoByNumber(@RequestBody Client client) {
		 int i=cs.updateClientInfoByNumber(client);
		 if(i>0) {
			 return "1";
		 }else {
			 return "0";
		 }
	}
	
	@RequestMapping("/queryClientByNumber")
	public String queryClientByNumber(String number) {
		Client client=cs.selectClientInfoByNumber(number);
		if(client==null) {
			return "0";
		}else {
			return "1";
		}
		 
	}
	
	@RequestMapping("/selectClientInfoByNumber")
	public Client selectClientInfoByNumber(String number) {
		Client client=cs.selectClientInfoByNumber(number);
		return client;
	}
	
	@RequestMapping("/selectCarInfoByClientNumber")
	public List<Carinfo> selectCarInfoByClientNumber(String number){
		List<Carinfo> list=cis.selectCarInfoByClientNumber(number);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
}

