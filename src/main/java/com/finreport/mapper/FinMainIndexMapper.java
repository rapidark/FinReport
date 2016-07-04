package com.finreport.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.FinMainIndex;

public interface FinMainIndexMapper {
	int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);

	int insert(FinMainIndex record);

	int insertSelective(FinMainIndex record);

	FinMainIndex selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);

	@Select("SELECT COUNT(*) from finindex where stockcode = #{stockcode} and reportdate=#{reportdate}")
	int countByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);
	
	List<FinMainIndex> selectByStockcodeAndQuater(@Param("stockcode") String[] stockcode, @Param("reportdate") Integer reportdate, @Param("quarter") String quarter);
	
	List<Map<String, Object>> selectSpecificColumnByStockcodeAndQuater(@Param("columns")List<String> columns, @Param("stockcode") String[] stockcode, @Param("reportdate") Integer reportdate, @Param("quarter") String quarter);
}
