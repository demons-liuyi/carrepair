package com.accp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Car;
import com.accp.domain.Carbrand;
import com.accp.domain.Carinfo;
import com.accp.domain.Cashier;
import com.accp.domain.Client;
import com.accp.domain.Clienttype;
import com.accp.domain.Coll;
import com.accp.domain.Dimission;
import com.accp.domain.Enginebrand;
import com.accp.domain.Staff;
import com.accp.service.carBrandService;
import com.accp.service.carInfoService;
import com.accp.service.carService;
import com.accp.service.cashierService;
import com.accp.service.clientService;
import com.accp.service.clientTypeService;
import com.accp.service.engineBrandService;



@RestController
@RequestMapping("/customerData")
public class customerDataController {
		
	@Autowired
	clientService cs;
	@Autowired
	carInfoService cis;
	@Autowired
	clientTypeService cts;
	@Autowired
	engineBrandService ebs;
	@Autowired
	carBrandService cbs;
	@Autowired
	carService cars;
	@Autowired
	cashierService css;
	
	@RequestMapping("/selectCashierByClientid")
	public List<Cashier> selectCashierByClientid(String clientid){
		List<Cashier> list=css.selectCashierByClientid(clientid);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/insertClientAndCarInfo")
	public String insertClientAndCarInfo(@RequestBody Coll coll) {
		int i=cs.insertClientAndCarinfo(coll);
		if(i>=2) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/deleteCarInfoByCarNumber")
	public String deleteCarInfoByCarNumber(String number) {
		int i=cis.deleteCarInfoByCarNumber(number);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/insertCarInfo")
	public String insertCarInfo(@RequestBody Carinfo carinfo) {
		int i=cis.insertCarInfo(carinfo);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/updateCarInfo")
	public String updateCarInfo(@RequestBody Carinfo carinfo) {
		int i=cis.updateCarInfo(carinfo);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/insertClientType")
	public String insertClientType(@RequestBody Clienttype clienttype) {
		int i=cts.insertClientType(clienttype);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/updateClientType")
	public String updateClientType(@RequestBody Clienttype clienttype) {
		int i=cts.updateClientType(clienttype);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/deleteClientType")
	public String deleteClientType(int id) {
		int i=cts.deleteClientType(id);
		if(i>0) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/selectCarByCarBrandId")
	public List<Car> selectCarByCarBrandId(int carbrandid){
		List<Car> list=cars.selectCarByCarBrandId(carbrandid);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectCarInfoByCarNumber")
	public String selectCarInfoByCarNumber(String number) {	
		Carinfo ci=cis.selectCarInfoByCarNumber(number); 
		if(ci!=null) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("/queryCarInfoByCarNumber")
	public Carinfo queryCarInfoByCarNumber(String number) {	
		Carinfo ci=cis.queryCarInfoByCarNumber(number); 
		return ci;
	}
	
	@RequestMapping("/selectCarBrandByCondition")
	public List<Carbrand> selectCarBrandByCondition(String condition){
		List<Carbrand> list=cbs.selectCarBrandByCondition(condition);
		 
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectCarByCondition")
	public List<Car> selectCarByCondition(String condition,int carbrandid){
		List<Car> list=cars.selectCarByCondition(condition, carbrandid);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectAllCarBrand")
	public List<Carbrand> selectAllCarBrand(){
		List<Carbrand> list=cbs.selectAllCarBrand();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/queryClientInfoByCondition")
	public List<Client> queryClientInfoByCondition(String condition){
		List<Client> list=cs.queryClientInfoByCondition(condition);
		List<Client> qwelist=cs.selectClientInfo();
		List<Client> lastlist=new ArrayList<Client>();
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<qwelist.size();j++) {
				if(list.get(i).getNumber().equals(qwelist.get(j).getNumber())) {
					lastlist.add(qwelist.get(j));
				}
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
	
	
	
	
	@RequestMapping("/selectClientInfoByCondition")
	public List<Client> selectClientInfoByCondition(@RequestBody Coll coll){
		checkObjectIsNullUtils checkUtils= new checkObjectIsNullUtils();
		List<Client> list=cs.selectClientInfo();
		List<Client> firstlist=new ArrayList<Client>();
		List<Client> qwelist=new ArrayList<Client>();
		List<Client> lastlist=new ArrayList<Client>();
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
						if(list.get(a).getNumber().equals(clientList.get(b).getNumber())) {			
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
						if(list.get(a).getNumber().equals(carinfolist.get(b).getClientid())) {	
							int d=0;
							for(int c=0;c<firstlist.size();c++) {
								if(firstlist.get(c).getNumber().equals(list.get(a).getNumber())) {
									d=1;
									break;
								}
							}
							if(d==1) {
								break;
							}
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
						if(list.get(a).getNumber().equals(clientList.get(b).getNumber())) {			
							firstlist.add(list.get(a));
							break;
						}				
					}			 
				}
				List<Carinfo> carinfolist=cis.selectClientByCondition(coll.getCarInfo());
				for(int a=0;a<firstlist.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(firstlist.get(a).getNumber().equals(carinfolist.get(b).getClientid())) {	
							int d=0;
							for(int c=0;c<qwelist.size();c++) {
								if(qwelist.get(c).getNumber().equals(firstlist.get(a).getNumber())) {
									d=1;
									break;
								}
							}
							if(d==1) {
								break;
							}
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
	
	@RequestMapping("/selectAllClientType")
	public List<Clienttype> selectAllClientType(){
		List<Clienttype> list=cts.selectAllClientType();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectAllEngineBrand")
	public List<Enginebrand> selectAllEngineBrand(){
		List<Enginebrand> list=ebs.selectAllEngineBrand();
		return list;
	}
	
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

