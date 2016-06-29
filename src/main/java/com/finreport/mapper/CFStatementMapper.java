package com.finreport.generator.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.finreport.generator.model.CFStatement;

public interface CFStatementMapper {
    int deleteByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);

    int insert(CFStatement record);

    int insertSelective(CFStatement record);

    CFStatement selectByPrimaryKey(@Param("stockcode") String stockcode, @Param("enddate") Integer enddate);
    
    @Select("SELECT COUNT(*) from cash where stockcode = #{stockcode} and enddate=#{enddate}")
    int countByPrimaryKey();
}
