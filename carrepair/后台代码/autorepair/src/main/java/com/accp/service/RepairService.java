package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Repair;
import com.accp.mapper.RepairMapper;

@Service
@Transactional
public class RepairService {
			@Autowired
			RepairMapper repairMapper;
		public List<Repair> selectRepairAndRescue(String type,String content){
			return repairMapper.selectRepairAndRescue(type,content);
		}
}
