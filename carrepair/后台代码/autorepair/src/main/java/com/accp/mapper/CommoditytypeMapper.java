package com.accp.mapper;

import com.accp.domain.Commoditytype;
import com.accp.domain.CommoditytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditytypeMapper {
    int countByExample(CommoditytypeExample example);

    int deleteByExample(CommoditytypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    List<Commoditytype> selectByExample(CommoditytypeExample example);

    Commoditytype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commoditytype record, @Param("example") CommoditytypeExample example);

    int updateByExample(@Param("record") Commoditytype record, @Param("example") CommoditytypeExample example);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}