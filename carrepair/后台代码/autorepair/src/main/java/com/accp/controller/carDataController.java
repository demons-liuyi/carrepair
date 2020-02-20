package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carinfo;
import com.accp.domain.Client;
import com.accp.domain.Coll;
import com.accp.domain.Maintainregist;
import com.accp.domain.Repair;
import com.accp.service.RepairService;
import com.accp.service.carInfoService;
import com.accp.service.clientService;
import com.accp.service.maintainregistService;

 

@RestController
@RequestMapping("/carData")
public class carDataController {

	@Autowired
	carInfoService cis;
	@Autowired
	clientService cs;
	@Autowired
	RepairService rs;
	@Autowired
	maintainregistService ms;
	
	@RequestMapping("/insertBaoYang")
	public String insertBaoYang(@RequestBody Maintainregist main) {
		int i=ms.insertBaoYang(main);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/updateBaoYang")
	public String updateBaoYang(@RequestBody Maintainregist main) {
		int i=ms.updateBaoYang(main);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/deleteBaoYang")
	public String deleteBaoYang(int id) {
		int i=ms.deleteBaoYang(id);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/selectMaintainregistInfoByCarNumber")
	public List<Maintainregist> selectMaintainregistInfoByCarNumber(String carNumber){
		List<Maintainregist> list=ms.selectMaintainregistInfoByCarNumber(carNumber);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectRepairByCarNumber")
	public List<Repair> selectRepairByCarNumber(String number){
		List<Repair> list=rs.selectRepairByCarNumber(number);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/queryCarInformationByCondition")
	public List<Carinfo> queryCarInformationByCondition(String condition){
		List<Carinfo> list=cis.queryCarInformationByCondition(condition);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectCarInformationByCondition")
	public List<Carinfo> selectCarInformationByCondition(@RequestBody Coll coll){
		checkObjectIsNullUtils checkUtils= new checkObjectIsNullUtils();
		List<Carinfo> list=cis.selectAllCarInfo();
		List<Carinfo> firstlist=new ArrayList<Carinfo>();
		List<Carinfo> qwelist=new ArrayList<Carinfo>();
		List<Carinfo> lastlist=new ArrayList<Carinfo>();
		if(coll==null) {
			lastlist=list;		
		}else {
			boolean flag1=checkUtils.objCheckIsNull(coll.getCarInfo());
			boolean flag2=checkUtils.objCheckIsNull(coll.getClient());
			System.out.println(flag1+"+"+flag2);
			if(flag1==true&&flag2==true) {
				lastlist=list;	
			}else if(flag1==true&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(coll.getClient());
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getClientid().equals(clientList.get(b).getNumber())) {			
							firstlist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=firstlist;
			}else if(flag1==false&&flag2==true) {
				List<Carinfo> carinfolist=cis.selectClientByCondition(coll.getCarInfo());
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(list.get(a).getId().equals(carinfolist.get(b).getId())) {				 							 			 
							firstlist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=firstlist;		
			}else if(flag1==false&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(coll.getClient());
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getClientid().equals(clientList.get(b).getNumber())) {			
							firstlist.add(list.get(a));
							break;
						}				
					}			 
				}
				List<Carinfo> carinfolist=cis.selectClientByCondition(coll.getCarInfo());
				for(int a=0;a<firstlist.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(firstlist.get(a).getId().equals(carinfolist.get(b).getId())) {	
							qwelist.add(firstlist.get(a));
							break;
						}				
					}			 
				}
				lastlist=qwelist;						
			}
		}
		for(int i=0;i<lastlist.size();i++) {
			if(i==0) {
				lastlist.get(i).setCheck(true);
			}else {
				lastlist.get(i).setCheck(false);	
			}
		}
		return lastlist;
	}
	
	@RequestMapping("/selectAllCarInfo")
	public List<Carinfo> selectAllCarInfo(){
		List<Carinfo> list=cis.selectAllCarInfo();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectClientInformationByClientId")
	public List<Client> selectClientInformationByClientId(String clientId){
		List<Client> list=cs.selectClientInformationByClientId(clientId);
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
