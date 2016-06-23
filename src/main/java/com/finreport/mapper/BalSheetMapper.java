package com.finreport.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.model.BalSheet;

public interface BalSheetMapper {
	
	@Select("select * from balance where stockcode = #{stockcode}")
	BalSheet findByStockcode(@Param("stockcode") String stockcode);
}
