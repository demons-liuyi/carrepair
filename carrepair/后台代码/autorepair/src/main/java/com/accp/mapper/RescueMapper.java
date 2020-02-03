package com.accp.mapper;

import com.accp.domain.Rescue;
import com.accp.domain.RescueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RescueMapper {
    int countByExample(RescueExample example);

    int deleteByExample(RescueExample example);

    int deleteByPrimaryKey(String number);

    int insert(Rescue record);

    int insertSelective(Rescue record);

    List<Rescue> selectByExample(RescueExample example);

    Rescue selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") Rescue record, @Param("example") RescueExample example);

    int updateByExample(@Param("record") Rescue record, @Param("example") RescueExample example);

    int updateByPrimaryKeySelective(Rescue record);

    int updateByPrimaryKey(Rescue record);
}