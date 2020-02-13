package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Repair;
import com.accp.mapper.RepairMapper;

@Service
@Transactional
public class repairService {

	@Autowired
	RepairMapper rm;
	
	public List<Repair> selectRepairByCarNumber(String number){
		List<Repair> list=rm.selectRepairByCarNumber(number);
		return list;
	}
	
}
