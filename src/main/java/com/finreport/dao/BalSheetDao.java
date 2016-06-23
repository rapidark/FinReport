package com.finreport.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finreport.model.BalSheet;

@Component
public class BalSheetDao {
	@Autowired
	private SqlSession sqlSession;
	
	public BalSheet getBalanceByStockCode(String stockcode) {
		return this.sqlSession.selectOne("findByStockcode", stockcode);

	}
}
