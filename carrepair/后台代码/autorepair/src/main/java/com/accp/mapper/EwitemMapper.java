package com.accp.mapper;

import com.accp.domain.Ewitem;
import com.accp.domain.EwitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EwitemMapper {
    int countByExample(EwitemExample example);

    int deleteByExample(EwitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ewitem record);

    int insertSelective(Ewitem record);

    List<Ewitem> selectByExample(EwitemExample example);

    Ewitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ewitem record, @Param("example") EwitemExample example);

    int updateByExample(@Param("record") Ewitem record, @Param("example") EwitemExample example);

    int updateByPrimaryKeySelective(Ewitem record);

    int updateByPrimaryKey(Ewitem record);
}