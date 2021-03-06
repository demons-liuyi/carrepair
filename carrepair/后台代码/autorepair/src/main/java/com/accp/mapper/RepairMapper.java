package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.MaintainHistary;
import com.accp.domain.QueryGetGoods;
import com.accp.domain.QueryItemRepair;
import com.accp.domain.Repair;
import com.accp.domain.RepairExample;

public interface RepairMapper {
	List<Repair> selectSettleAccounts();
	
	List<Repair> selectRepairByCarNumber(String number);
	
    int countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(String number);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
    List<Repair> selectRepairAndRescue(@Param("type") String type,@Param("content")String content,@Param("cpc")String cpc);
    List<MaintainHistary> selectHistray(@Param("type") String type,@Param("content")String content);
    List<MaintainHistary> selectRepairItem(@Param("type") String type,@Param("content")String content);
    List<MaintainHistary> selectwl(@Param("type") String type,@Param("content")String content);
    List<QueryGetGoods> queryGetGoods(@Param("tab") String tab, @Param("number")String number);
    List<QueryItemRepair> queryItemRepair(@Param("tab") String tab, @Param("number")String number);
    
}