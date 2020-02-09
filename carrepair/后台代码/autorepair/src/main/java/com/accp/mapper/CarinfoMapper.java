package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Carinfo;
import com.accp.domain.CarinfoExample;
import com.accp.domain.ClientAndCar;

public interface CarinfoMapper {
	List<Carinfo> selectCarInfoByClientNumber(String number);
	
    int countByExample(CarinfoExample example);

    int deleteByExample(CarinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample(CarinfoExample example);

    Carinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByExample(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);
    ClientAndCar selectClientAndCar(String carNumber);
    Carinfo selectCarInfo(String carNumber);
}