package com.accp.mapper;

import com.accp.domain.Minorrepair;
import com.accp.domain.MinorrepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MinorrepairMapper {
    int countByExample(MinorrepairExample example);

    int deleteByExample(MinorrepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Minorrepair record);

    int insertSelective(Minorrepair record);

    List<Minorrepair> selectByExample(MinorrepairExample example);

    Minorrepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Minorrepair record, @Param("example") MinorrepairExample example);

    int updateByExample(@Param("record") Minorrepair record, @Param("example") MinorrepairExample example);

    int updateByPrimaryKeySelective(Minorrepair record);

    int updateByPrimaryKey(Minorrepair record);
}