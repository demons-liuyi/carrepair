package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Commodity;
import com.accp.domain.Completed;
import com.accp.domain.CompletedExample;
import com.accp.domain.Ewitem;
import com.accp.domain.EwitemExample;
import com.accp.domain.Getgood;
import com.accp.domain.GetgoodExample;
import com.accp.domain.ItemRepair;
import com.accp.domain.ItemRepairExample;
import com.accp.domain.MaintainHistary;
import com.accp.domain.QueryGetGoods;
import com.accp.domain.QueryItemRepair;
import com.accp.domain.Repair;
import com.accp.domain.Rescue;
import com.accp.mapper.CommodityMapper;
import com.accp.mapper.CompletedMapper;
import com.accp.mapper.EwitemMapper;
import com.accp.mapper.GetgoodMapper;
import com.accp.mapper.ItemRepairMapper;
import com.accp.mapper.RepairMapper;
import com.accp.mapper.RescueMapper;

@Service
@Transactional
public class RepairService {
			@Autowired
			RepairMapper repairMapper;
			@Autowired
			CommodityMapper ComMapper;;
			@Autowired
			GetgoodMapper getgoodMapper;
			@Autowired
			ItemRepairMapper itemRepairMapper;
			@Autowired
			EwitemMapper ewitemMapper;
			@Autowired
			RescueMapper rescueMapper;
			@Autowired
			CompletedMapper comMapper;
			public List<Repair> selectSettleAccounts(){ 
				List<Repair> list=repairMapper.selectSettleAccounts(); 
				return list; 
				} 
				 public List<Repair> selectRepairByCarNumber(String number){ 
				List<Repair> list=repairMapper.selectRepairByCarNumber(number); 
				return list; 
				}
		public List<Repair> selectRepairAndRescue(String type,String content,String cpc){
			return repairMapper.selectRepairAndRescue(type,content,cpc);
		}
		public List<MaintainHistary> selectHistary(String type,String content){
			return repairMapper.selectHistray(type, content);
		}
		public List<MaintainHistary> selectRepairItem(String type,String content){
			return repairMapper.selectRepairItem(type, content);
		}
		public List<MaintainHistary> selectwl(String type,String content){
			return repairMapper.selectwl(type, content);
		}
		public Commodity selectGoodByid(String id) {
			return ComMapper.selectByPrimaryKey(id);
		}
		public int addRescue(Rescue rescue) {
			return rescueMapper.insert(rescue);
		}
		public int addRepair(Repair repair) {
			return repairMapper.insert(repair);
		}

		public int addGetgood(List<Getgood> list) {
			for (int i = 0; i < list.size(); i++) {
				 getgoodMapper.insert(list.get(i));
			}
			return 1;
		}
		public int addItemRepair(List<ItemRepair> list) {
			for (int i = 0; i < list.size(); i++) {
				itemRepairMapper.insert(list.get(i));
			}
			return 1;
		}
		public int addEwitem(List<Ewitem> list) {
			for (int i = 0; i < list.size(); i++) {
				ewitemMapper.insert(list.get(i));
			}
			return 1;
		}
		public List<QueryGetGoods> queryGetGoods(String tab,String number){
			return repairMapper.queryGetGoods(tab,number);
		}
		public List<QueryItemRepair> queryItemRepair(String tab,String number){
			return repairMapper.queryItemRepair(tab,number);
		}
		public Repair queryRepair(String number) {
			return repairMapper.selectByPrimaryKey(number);
		}
		public Rescue queryRescue(String number) {
			return rescueMapper.selectByPrimaryKey(number);
		}
		public List<Ewitem> queryEwitem(String number) {
			EwitemExample example1=new EwitemExample();
	
			example1.createCriteria().andRepairidEqualTo(number);
		
			return ewitemMapper.selectByExample(example1);
		}
		public List<Ewitem> queryRescueEwitem(String number) {
			EwitemExample example=new EwitemExample();
			example.createCriteria().andRescueidEqualTo(number);
			return ewitemMapper.selectByExample(example);
		}
		public int rollBackRepair(String number) {
			Repair repair=new Repair();
			repair.setStatus("进行中");
			repair.setNumber(number);
			return repairMapper.updateByPrimaryKeySelective(repair);
		}
		public int rollBackRescue(String number) {
			Rescue repair=new Rescue();
			repair.setStatus("进行中");
			repair.setNumber(number);
			return rescueMapper.updateByPrimaryKeySelective(repair);
		}
		public int updateRepair(Repair repair) {
			return repairMapper.updateByPrimaryKey(repair);
		}
		public int updateRescue(Rescue rescue) {
			return rescueMapper.updateByPrimaryKey(rescue);
		}

		public int updateGetgood(List<Getgood> list) {
			GetgoodExample example=new GetgoodExample();
			if(list.get(0).getCount()==-1) {
			example.createCriteria().andWjidEqualTo(list.get(0).getWjid());
			getgoodMapper.deleteByExample(example);
			return 0;
			}else {
				example.createCriteria().andWjidEqualTo(list.get(0).getWjid());
				getgoodMapper.deleteByExample(example);				
			}
			for (int i = 0; i < list.size(); i++) {
				 getgoodMapper.insert(list.get(i));
			}
			return 1;
		}
		public int updateItemRepair(List<ItemRepair> list) {
			ItemRepairExample example=new ItemRepairExample();
			if(list.get(0).getCount()==-1) {
			example.createCriteria().andWjidEqualTo(list.get(0).getWjid());
			itemRepairMapper.deleteByExample(example);
			return 0;
			}else {
				example.createCriteria().andWjidEqualTo(list.get(0).getWjid());
				itemRepairMapper.deleteByExample(example);				
			}
			for (int i = 0; i < list.size(); i++) {
				itemRepairMapper.insert(list.get(i));
			}
			return 1;
		}
		public int updateEwitem(List<Ewitem> list) {
			EwitemExample example=new EwitemExample();
			if(list.get(0).getRemark()=="**") {
			if(list.get(0).getRepairid()!="") {
			example.createCriteria().andRepairidEqualTo(list.get(0).getRepairid());
			}else {
				example.createCriteria().andRescueidEqualTo(list.get(0).getRescueid());
			}
			ewitemMapper.deleteByExample(example);
			return 0;
			}else {
				System.out.println(list.get(0).getRepairid()+"维修"+list.get(0).getRescueid());
				if(list.get(0).getRepairid()!=null) {
					example.createCriteria().andRepairidEqualTo(list.get(0).getRepairid());
					}else {
						example.createCriteria().andRescueidEqualTo(list.get(0).getRescueid());
					}
					ewitemMapper.deleteByExample(example);
			}
			for (int i = 0; i < list.size(); i++) {
				ewitemMapper.insert(list.get(i));
			}
			return 1;
		}
		public int queryCom(String number) {
			CompletedExample example=new CompletedExample();
			example.createCriteria().andWjidEqualTo(number);
			List<Completed> list=comMapper.selectByExample(example);
			if(list.size()==0) {
				return 0;
			}else {
			return list.get(0).getCount();
			}
			
		}
		public int addCom(Completed com) {
			Repair repair=new Repair();
			if(com.getYesorno()==1) {
				
				String date1=com.getNowtime().toString();
				String date2=com.getPredicttime().toString();
				int dd=date1.compareTo(date2);
				System.out.println("时间比较"+dd);
				if(dd>0) {
					repair.setStatus("超时完工");
					repair.setNumber(com.getWjid());
					repair.setNowworkdate(com.getNowtime());
					 repairMapper.updateByPrimaryKeySelective(repair);
				}else {
					repair.setStatus("完工");
					repair.setNumber(com.getWjid());
					repair.setNowworkdate(com.getNowtime());
					 repairMapper.updateByPrimaryKeySelective(repair);
				}
				CompletedExample example =new CompletedExample();
				example.createCriteria().andWjidEqualTo(com.getWjid());
				comMapper.deleteByExample(example);
				comMapper.insert(com);
			}else {
				CompletedExample example =new CompletedExample();
				example.createCriteria().andWjidEqualTo(com.getWjid());
				comMapper.deleteByExample(example);
				comMapper.insert(com);
			}
			return 0;
		}
		public int addRescueCom(Completed com) {
			Rescue repair=new Rescue();
			if(com.getYesorno()==1) {
				
				String date1=com.getNowtime().toString();
				String date2=com.getPredicttime().toString();
				int dd=date1.compareTo(date2);
				System.out.println("时间比较"+dd);
				if(dd>0) {
					repair.setStatus("超时完工");
					repair.setNumber(com.getWjid());
					repair.setNowdate(com.getNowtime());
					 rescueMapper.updateByPrimaryKeySelective(repair);
				}else {
					repair.setStatus("完工");
					repair.setNumber(com.getWjid());
					repair.setNowdate(com.getNowtime());
					rescueMapper.updateByPrimaryKeySelective(repair);
				}
				CompletedExample example =new CompletedExample();
				example.createCriteria().andWjidEqualTo(com.getWjid());
				comMapper.deleteByExample(example);
				comMapper.insert(com);
			}else {
				CompletedExample example =new CompletedExample();
				example.createCriteria().andWjidEqualTo(com.getWjid());
				comMapper.deleteByExample(example);
				comMapper.insert(com);
			}
			return 0;
		}
}
