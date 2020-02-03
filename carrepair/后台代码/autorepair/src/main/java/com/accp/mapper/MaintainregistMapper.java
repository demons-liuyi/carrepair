package com.accp.mapper;

import com.accp.domain.Maintainregist;
import com.accp.domain.MaintainregistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainregistMapper {
    int countByExample(MaintainregistExample example);

    int deleteByExample(MaintainregistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Maintainregist record);

    int insertSelective(Maintainregist record);

    List<Maintainregist> selectByExample(MaintainregistExample example);

    Maintainregist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Maintainregist record, @Param("example") MaintainregistExample example);

    int updateByExample(@Param("record") Maintainregist record, @Param("example") MaintainregistExample example);

    int updateByPrimaryKeySelective(Maintainregist record);

    int updateByPrimaryKey(Maintainregist record);
}