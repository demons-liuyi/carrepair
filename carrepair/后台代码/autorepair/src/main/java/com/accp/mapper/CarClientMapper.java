package com.accp.mapper;

import com.accp.domain.CarClient;
import com.accp.domain.CarClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarClientMapper {
    int countByExample(CarClientExample example);

    int deleteByExample(CarClientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarClient record);

    int insertSelective(CarClient record);

    List<CarClient> selectByExample(CarClientExample example);

    CarClient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarClient record, @Param("example") CarClientExample example);

    int updateByExample(@Param("record") CarClient record, @Param("example") CarClientExample example);

    int updateByPrimaryKeySelective(CarClient record);

    int updateByPrimaryKey(CarClient record);
}