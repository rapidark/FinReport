package com.finreport.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.BalSheet;

public interface BalSheetMapper {
	int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);

	int insert(BalSheet record);

	int insertSelective(BalSheet record);

	BalSheet selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);

	@Select("SELECT COUNT(*) from balance where stockcode = #{stockcode} and reportdate=#{reportdate}")
	int countByPrimaryKey(@Param("stockcode") String stockcode,@Param("reportdate") Integer reportdate);
}
