package com.accp.mapper;

import com.accp.domain.Jurisdiction;
import com.accp.domain.JurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JurisdictionMapper {
	List<Jurisdiction> findByParentid(Integer parentid);

	List<Jurisdiction> findByUid(Integer uid);

	List<Jurisdiction> selectJurisdictionByPostid(@Param("postid") Integer postid);

	int countByExample(JurisdictionExample example);

	int deleteByExample(JurisdictionExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Jurisdiction record);

	int insertSelective(Jurisdiction record);

	List<Jurisdiction> selectByExample(JurisdictionExample example);

	Jurisdiction selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Jurisdiction record, @Param("example") JurisdictionExample example);

	int updateByExample(@Param("record") Jurisdiction record, @Param("example") JurisdictionExample example);

	int updateByPrimaryKeySelective(Jurisdiction record);

	int updateByPrimaryKey(Jurisdiction record);
}