package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.domain.Carinfo;
import com.accp.domain.CarinfoExample;
import com.accp.domain.Coll;
import com.accp.domain.CarinfoExample.Criteria;
import com.accp.mapper.CarinfoMapper;

@Service
@Transactional
public class carInfoService {

	@Autowired
	CarinfoMapper cm;
	
	public Carinfo selectCarInfoByCarNumber(String number) {
		Carinfo ci=cm.selectCarInfoByCarNumber(number);
		return ci;
	}
	
	public int deleteCarInfoByCarNumber(String number) {
		CarinfoExample example=new CarinfoExample();
		example.createCriteria().andCarnumberEqualTo(number);
		int i=cm.deleteByExample(example);
		return i;	
	}
	
	public Carinfo 	queryCarInfoByCarNumber(String number) {
		Carinfo ci=cm.queryCarInfoByCarNumber(number);
		return ci;
	}
	
	public int insertCarInfo(Carinfo carinfo) {
		int i=cm.insertSelective(carinfo);
		return i;	
	}
	
	public int updateCarInfo(Carinfo carinfo) {
		CarinfoExample example=new CarinfoExample();
		example.createCriteria().andCarnumberEqualTo(carinfo.getCarnumber());
		int i=cm.updateByExample(carinfo, example);
		return i;	
	}
	
	public List<Carinfo> selectClientByCondition(Carinfo carinfo){
		CarinfoExample example=new CarinfoExample();
		Criteria cra=example.createCriteria();
		if(carinfo.getCarnumber()!=null&&carinfo.getCarnumber().length()>0) {
			cra.andCarnumber1EqualTo(carinfo.getCarnumber());
		}
		if(carinfo.getCarbrandid()!=null&&carinfo.getCarbrandid()>0) {
			cra.andCarbrandidEqualTo(carinfo.getCarbrandid());
		}
		if(carinfo.getCarid()!=null&&carinfo.getCarid()>0) {
			cra.andCaridEqualTo(carinfo.getCarid());
		}
		if(carinfo.getCarnumber1()!=null&&carinfo.getCarnumber1().length()>0) {
			cra.andCarnumber1EqualTo(carinfo.getCarnumber1());
		}
		if(carinfo.getEnginenumber()!=null&&carinfo.getEnginenumber().length()>0) {
			cra.andEnginenumberEqualTo(carinfo.getEnginenumber());
		}
		if(carinfo.getJqinsurance()!=null&&carinfo.getJqinsurance().length()>0) {
			cra.andJqinsuranceEqualTo(carinfo.getJqinsurance());
		}
		if(carinfo.getEngineid()!=null&&carinfo.getEngineid()>0) {
			cra.andEngineidEqualTo(carinfo.getEngineid());
		}
		if(carinfo.getCarer()!=null&&carinfo.getCarer().length()>0) {
			cra.andCarerEqualTo(carinfo.getCarer());
		}
		if(carinfo.getCarerphone()!=null&&carinfo.getCarerphone().length()>0) {
			cra.andCarerphoneEqualTo(carinfo.getCarerphone());
		}
		if(carinfo.getBorndate()!=null) {
			cra.andBorndateEqualTo(carinfo.getBorndate());
		}
		List<Carinfo> list=cm.selectByExample(example);
		return list;
	}
	
	public List<Carinfo> selectCarInfoByClientNumber(String number){
		List<Carinfo> list=cm.selectCarInfoByClientNumber(number);
		return list;
	}
	
}
