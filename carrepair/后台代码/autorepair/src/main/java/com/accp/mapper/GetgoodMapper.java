package com.accp.mapper;

import com.accp.domain.Getgood;
import com.accp.domain.GetgoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GetgoodMapper {
    int countByExample(GetgoodExample example);

    int deleteByExample(GetgoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Getgood record);

    int insertSelective(Getgood record);

    List<Getgood> selectByExample(GetgoodExample example);

    Getgood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Getgood record, @Param("example") GetgoodExample example);

    int updateByExample(@Param("record") Getgood record, @Param("example") GetgoodExample example);

    int updateByPrimaryKeySelective(Getgood record);

    int updateByPrimaryKey(Getgood record);
}