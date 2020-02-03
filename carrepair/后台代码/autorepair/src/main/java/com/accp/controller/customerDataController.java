package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Client;
import com.accp.service.clientService;


//客户资料Controller
@RestController
@RequestMapping("/customerData")
public class customerDataController {
		
	@Autowired
	clientService cs;
	
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
}

