package com.accp.mapper;

import com.accp.domain.Artisan;
import com.accp.domain.ArtisanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisanMapper {
    int countByExample(ArtisanExample example);

    int deleteByExample(ArtisanExample example);

    int deleteByPrimaryKey(String artisanno);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    List<Artisan> selectByExample(ArtisanExample example);

    Artisan selectByPrimaryKey(String artisanno);

    int updateByExampleSelective(@Param("record") Artisan record, @Param("example") ArtisanExample example);

    int updateByExample(@Param("record") Artisan record, @Param("example") ArtisanExample example);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}