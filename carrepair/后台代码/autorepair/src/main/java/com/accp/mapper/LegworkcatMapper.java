package com.accp.mapper;

import com.accp.domain.Legworkcat;
import com.accp.domain.LegworkcatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LegworkcatMapper {
    int countByExample(LegworkcatExample example);

    int deleteByExample(LegworkcatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Legworkcat record);

    int insertSelective(Legworkcat record);

    List<Legworkcat> selectByExample(LegworkcatExample example);

    Legworkcat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Legworkcat record, @Param("example") LegworkcatExample example);

    int updateByExample(@Param("record") Legworkcat record, @Param("example") LegworkcatExample example);

    int updateByPrimaryKeySelective(Legworkcat record);

    int updateByPrimaryKey(Legworkcat record);
}