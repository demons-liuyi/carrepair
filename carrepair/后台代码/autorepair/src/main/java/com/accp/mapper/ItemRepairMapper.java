package com.accp.mapper;

import com.accp.domain.ItemRepair;
import com.accp.domain.ItemRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemRepairMapper {
    int countByExample(ItemRepairExample example);

    int deleteByExample(ItemRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemRepair record);

    int insertSelective(ItemRepair record);

    List<ItemRepair> selectByExample(ItemRepairExample example);

    ItemRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemRepair record, @Param("example") ItemRepairExample example);

    int updateByExample(@Param("record") ItemRepair record, @Param("example") ItemRepairExample example);

    int updateByPrimaryKeySelective(ItemRepair record);

    int updateByPrimaryKey(ItemRepair record);
}