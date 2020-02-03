package com.accp.mapper;

import com.accp.domain.Artisanclass;
import com.accp.domain.ArtisanclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisanclassMapper {
    int countByExample(ArtisanclassExample example);

    int deleteByExample(ArtisanclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Artisanclass record);

    int insertSelective(Artisanclass record);

    List<Artisanclass> selectByExample(ArtisanclassExample example);

    Artisanclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Artisanclass record, @Param("example") ArtisanclassExample example);

    int updateByExample(@Param("record") Artisanclass record, @Param("example") ArtisanclassExample example);

    int updateByPrimaryKeySelective(Artisanclass record);

    int updateByPrimaryKey(Artisanclass record);
}