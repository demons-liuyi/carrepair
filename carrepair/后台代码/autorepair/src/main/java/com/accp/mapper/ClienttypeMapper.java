package com.accp.mapper;

import com.accp.domain.Clienttype;
import com.accp.domain.ClienttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClienttypeMapper {
    int countByExample(ClienttypeExample example);

    int deleteByExample(ClienttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clienttype record);

    int insertSelective(Clienttype record);

    List<Clienttype> selectByExample(ClienttypeExample example);

    Clienttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clienttype record, @Param("example") ClienttypeExample example);

    int updateByExample(@Param("record") Clienttype record, @Param("example") ClienttypeExample example);

    int updateByPrimaryKeySelective(Clienttype record);

    int updateByPrimaryKey(Clienttype record);
}