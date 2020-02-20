package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.ItemRepair;
import com.accp.domain.Maintenanceitems;
import com.accp.mapper.ItemRepairMapper;
import com.accp.mapper.MaintenanceitemsMapper;

@Service
@Transactional
public class ItemRepairService {
		@Autowired
		ItemRepairMapper itemRepairMapper;
		@Autowired
		MaintenanceitemsMapper mm;
		public int add(ItemRepair itemRepair) {
			return itemRepairMapper.insert(itemRepair);
		}
		public Maintenanceitems selectById(Integer id) {
			return mm.selectByPrimaryKey(id);
		}
		
}
