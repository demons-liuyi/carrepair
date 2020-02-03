package com.accp.mapper;

import com.accp.domain.Maintenanceitems;
import com.accp.domain.MaintenanceitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceitemsMapper {
    int countByExample(MaintenanceitemsExample example);

    int deleteByExample(MaintenanceitemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Maintenanceitems record);

    int insertSelective(Maintenanceitems record);

    List<Maintenanceitems> selectByExample(MaintenanceitemsExample example);

    Maintenanceitems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Maintenanceitems record, @Param("example") MaintenanceitemsExample example);

    int updateByExample(@Param("record") Maintenanceitems record, @Param("example") MaintenanceitemsExample example);

    int updateByPrimaryKeySelective(Maintenanceitems record);

    int updateByPrimaryKey(Maintenanceitems record);
}