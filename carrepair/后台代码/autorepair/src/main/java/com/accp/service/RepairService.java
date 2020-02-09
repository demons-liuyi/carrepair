package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.MaintainHistary;
import com.accp.domain.Repair;
import com.accp.mapper.RepairMapper;

@Service
@Transactional
public class RepairService {
			@Autowired
			RepairMapper repairMapper;
		public List<Repair> selectRepairAndRescue(String type,String content,String cpc){
			return repairMapper.selectRepairAndRescue(type,content,cpc);
		}
		public List<MaintainHistary> selectHistary(String type,String content){
			return repairMapper.selectHistray(type, content);
		}
		public List<MaintainHistary> selectRepairItem(String type,String content){
			return repairMapper.selectRepairItem(type, content);
		}
}
