package com.finreport.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.IncStatement;

public interface IncStatementMapper {
	int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);

	int insert(IncStatement record);

	int insertSelective(IncStatement record);

	IncStatement selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);
	
	@Select("SELECT COUNT(*) from income where stockcode = #{stockcode} and enddate=#{enddate}")
    int countByPrimaryKey(String stockcode, Integer enddate);
}
