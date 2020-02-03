package com.accp.mapper;

import com.accp.domain.Enginebrand;
import com.accp.domain.EnginebrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnginebrandMapper {
    int countByExample(EnginebrandExample example);

    int deleteByExample(EnginebrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Enginebrand record);

    int insertSelective(Enginebrand record);

    List<Enginebrand> selectByExample(EnginebrandExample example);

    Enginebrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Enginebrand record, @Param("example") EnginebrandExample example);

    int updateByExample(@Param("record") Enginebrand record, @Param("example") EnginebrandExample example);

    int updateByPrimaryKeySelective(Enginebrand record);

    int updateByPrimaryKey(Enginebrand record);
}