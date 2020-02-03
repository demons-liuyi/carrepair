package com.accp.mapper;

import com.accp.domain.Completed;
import com.accp.domain.CompletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}