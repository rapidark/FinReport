package com.finreport.generator.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.generator.model.FinMainIndex;

public interface FinMainIndexMapper {
    int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);

    int insert(FinMainIndex record);

    int insertSelective(FinMainIndex record);

    FinMainIndex selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("reportdate") Integer reportdate);
    
    @Select("SELECT COUNT(*) from finindex where stockcode = #{stockcode} and enddate=#{enddate}")
    int countByPrimaryKey();
}
