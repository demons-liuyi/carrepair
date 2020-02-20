package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Completed;
import com.accp.domain.CompletedExample;
import com.accp.domain.JunGong;

public interface CompletedMapper {
    int countByExample(CompletedExample example);

    int deleteByExample(CompletedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Completed record);

    int insertSelective(Completed record);

    List<Completed> selectByExample(CompletedExample example);

    Completed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Completed record, @Param("example") CompletedExample example);

    int updateByExample(@Param("record") Completed record, @Param("example") CompletedExample example);

    int updateByPrimaryKeySelective(Completed record);

    int updateByPrimaryKey(Completed record);
    List<JunGong> selectJunGong(@Param("tj") String tj,@Param("date1") String date1,@Param("date2") String date2,@Param("number") String number,@Param("carnumber") String carnumber,@Param("carnumber1") String carnumber1);
}