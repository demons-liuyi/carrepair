package com.accp.mapper;

import com.accp.domain.MaterialrequireGood;
import com.accp.domain.MaterialrequireGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialrequireGoodMapper {
    int countByExample(MaterialrequireGoodExample example);

    int deleteByExample(MaterialrequireGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialrequireGood record);

    int insertSelective(MaterialrequireGood record);

    List<MaterialrequireGood> selectByExample(MaterialrequireGoodExample example);

    MaterialrequireGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialrequireGood record, @Param("example") MaterialrequireGoodExample example);

    int updateByExample(@Param("record") MaterialrequireGood record, @Param("example") MaterialrequireGoodExample example);

    int updateByPrimaryKeySelective(MaterialrequireGood record);

    int updateByPrimaryKey(MaterialrequireGood record);
}