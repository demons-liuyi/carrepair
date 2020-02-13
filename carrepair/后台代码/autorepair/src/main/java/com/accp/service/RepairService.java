package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Commodity;
import com.accp.domain.Ewitem;
import com.accp.domain.Getgood;
import com.accp.domain.ItemRepair;
import com.accp.domain.MaintainHistary;
import com.accp.domain.Repair;
import com.accp.mapper.CommodityMapper;
import com.accp.mapper.EwitemMapper;
import com.accp.mapper.GetgoodMapper;
import com.accp.mapper.ItemRepairMapper;
import com.accp.mapper.RepairMapper;

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
}
