package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.JunGong;
import com.accp.mapper.CompletedMapper;

@Service
@Transactional
public class JunGongService {
			@Autowired
			CompletedMapper comMapper;
			public List<JunGong> selectJunGong(String tj,String date1,String date2,String number,String carnumber,String carnumber1){
				return comMapper.selectJunGong(tj, date1, date2, number, carnumber, carnumber1);
			}
}
