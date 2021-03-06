package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
	Staff selectStaffByAccountAndPassword(@Param("account") String account,@Param("password") String password);
	
	Staff selectStaffByNoLast();
	
	Staff selectStaffByStaffNo(String staffno);
	
	List<Staff> selectStaffByCondition(String departmentname);
	
	List<Staff> selectStaffPhone();
	
	List<Staff> selectStaffAndPostName(String str);
	
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String staffno);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String staffno);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}