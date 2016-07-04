package com.finreport.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;

public interface CFStatementMapper {
	int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);

	int insert(CFStatement record);

	int insertSelective(CFStatement record);

	CFStatement selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);

	@Select("SELECT COUNT(*) from cash where stockcode = #{stockcode} and enddate=#{enddate}")
	int countByPrimaryKey(@Param("stockcode") String stockcode,@Param("enddate") Integer enddate);
	
	List<CFStatement> selectByStockcodeAndQuater(@Param("stockcode") String[] stockcode, @Param("enddate") Integer enddate, @Param("quarter") String quarter);
	
	List<Map<String, Object>> selectSpecificColumnByStockcodeAndQuater(@Param("columns")List<String> columns, @Param("stockcode") String[] stockcode, @Param("enddate") Integer enddate, @Param("quarter") String quarter);
}
