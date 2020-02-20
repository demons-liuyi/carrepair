package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cashier;
import com.accp.domain.Repair;
import com.accp.service.RepairService;
import com.accp.service.cashierService;

@RestController
@RequestMapping("/settlementCenter")
public class settlementCenterController {
	
	@Autowired
	RepairService rs;
	@Autowired
	cashierService cs;
	
	@RequestMapping("/selectSettleAccounts")
	public List<Repair> selectSettleAccounts(){
		List<Repair> list=rs.selectSettleAccounts();
		return list;
	}
	
	@RequestMapping("/selectFinished")
	public List<Repair> selectFinished(){
		List<Cashier> clist=cs.selectAllInfo();
		List<Repair> rlist=rs.selectSettleAccounts();
		List<Repair> lastlist=new ArrayList<Repair>();
		for(int i=0;i<rlist.size();i++) {
			for(int j=0;j<clist.size();j++) {
				if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
					lastlist.add(rlist.get(i));
					break;
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
	
	@RequestMapping("/selectUnfinished")
	public List<Repair> selectUnfinished(){
		List<Cashier> clist=cs.selectAllInfo();
		List<Repair> rlist=rs.selectSettleAccounts();
		List<Repair> lastlist=new ArrayList<Repair>();
		for(int i=0;i<rlist.size();i++) {
			for(int j=0;j<clist.size();j++) {
				if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
					break;
				}
				if(j==clist.size()-1) {
					lastlist.add(rlist.get(i));
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
}
