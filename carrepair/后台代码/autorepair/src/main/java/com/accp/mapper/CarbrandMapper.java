package com.accp.mapper;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarbrandMapper {
    int countByExample(CarbrandExample example);

    int deleteByExample(CarbrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carbrand record);

    int insertSelective(Carbrand record);

    List<Carbrand> selectByExample(CarbrandExample example);

    Carbrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int updateByExample(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int updateByPrimaryKeySelective(Carbrand record);

    int updateByPrimaryKey(Carbrand record);
}