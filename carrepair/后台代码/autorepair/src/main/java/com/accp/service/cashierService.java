package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Cashier;
import com.accp.mapper.CashierMapper;

@Service
@Transactional
public class cashierService {

	@Autowired
	CashierMapper cm;
	
	public List<Cashier> selectCashierByClientid(String clientid){
		List<Cashier> list=cm.selectCashierByClientid(clientid);
		return list;
	}
}
