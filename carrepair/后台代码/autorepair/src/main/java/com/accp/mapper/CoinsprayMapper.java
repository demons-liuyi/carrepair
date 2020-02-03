package com.accp.mapper;

import com.accp.domain.Coinspray;
import com.accp.domain.CoinsprayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinsprayMapper {
    int countByExample(CoinsprayExample example);

    int deleteByExample(CoinsprayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coinspray record);

    int insertSelective(Coinspray record);

    List<Coinspray> selectByExample(CoinsprayExample example);

    Coinspray selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coinspray record, @Param("example") CoinsprayExample example);

    int updateByExample(@Param("record") Coinspray record, @Param("example") CoinsprayExample example);

    int updateByPrimaryKeySelective(Coinspray record);

    int updateByPrimaryKey(Coinspray record);
}