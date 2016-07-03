package com.finreport.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;

public interface IncStatementMapper {
	int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);

	int insert(IncStatement record);

	int insertSelective(IncStatement record);

	IncStatement selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);
	
    int countByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);
    
    List<IncStatement> selectByStockcodeAndQuater(@Param("stockcode") String[] stockcode, @Param("enddate") Integer enddate, @Param("quarter") String quarter);
    
    HashMap<String, List<String>> selectSpecificColumnByStockcodeAndQuater(@Param("columns")List<String> columns, @Param("stockcode") String[] stockcode, @Param("enddate") Integer enddate, @Param("quarter") String quarter);
}
