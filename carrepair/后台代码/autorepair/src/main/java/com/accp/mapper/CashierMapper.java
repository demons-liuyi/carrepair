package com.accp.mapper;

import com.accp.domain.Cashier;
import com.accp.domain.CashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashierMapper {
    int countByExample(CashierExample example);

    int deleteByExample(CashierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cashier record);

    int insertSelective(Cashier record);

    List<Cashier> selectByExample(CashierExample example);

    Cashier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByPrimaryKeySelective(Cashier record);

    int updateByPrimaryKey(Cashier record);
}