package com.accp.mapper;

import com.accp.domain.Artisanlevel;
import com.accp.domain.ArtisanlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisanlevelMapper {
    int countByExample(ArtisanlevelExample example);

    int deleteByExample(ArtisanlevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Artisanlevel record);

    int insertSelective(Artisanlevel record);

    List<Artisanlevel> selectByExample(ArtisanlevelExample example);

    Artisanlevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Artisanlevel record, @Param("example") ArtisanlevelExample example);

    int updateByExample(@Param("record") Artisanlevel record, @Param("example") ArtisanlevelExample example);

    int updateByPrimaryKeySelective(Artisanlevel record);

    int updateByPrimaryKey(Artisanlevel record);
}