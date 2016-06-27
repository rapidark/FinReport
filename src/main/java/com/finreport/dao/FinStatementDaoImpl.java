package com.finreport.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.finreport.mapper.BalSheetMapper;
import com.finreport.mapper.CFStatementMapper;
import com.finreport.mapper.FinMainIndexMapper;
import com.finreport.mapper.IncStatementMapper;
import com.finreport.mapper.StockMapper;
import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.Stock;

@Component
@Transactional
public class FinStatementDaoImpl implements FinStatementDao {
	@Autowired
	private BalSheetMapper balSheetMapper;
	
	@Autowired 
	private CFStatementMapper cfStatementMapper;
	
	@Autowired
	private FinMainIndexMapper finMainIndexMapper;
	
	@Autowired
	private IncStatementMapper incStatementMapper;
	
	@Autowired
	private StockMapper stockMapper;
	
	@Autowired 
	SqlSessionTemplate sqlBatchSessionTemplate;
	
	public BalSheet getBalanceByStockCode(String stockcode) {
		return balSheetMapper.selectByPrimaryKey(stockcode);
	}
	
	public Boolean addBalanceStatement(BalSheet balSheet) {
		int result = balSheetMapper.insertSelective(balSheet);
		return result > 0;
	}
	
	public Boolean addCFStatement(CFStatement cfStatement) {
		int result = cfStatementMapper.insertSelective(cfStatement);
		return result > 0;
	}
	
	public Boolean addFinMainIndex(FinMainIndex finMainIndex) {
		int result = finMainIndexMapper.insertSelective(finMainIndex);
		return result > 0;
	}
	
	public Boolean addIncStatement(IncStatement incStatement) {
		int result = incStatementMapper.insertSelective(incStatement);
		return result > 0;
	}
	
	public Boolean addStock(Stock stock) {
		int result = stockMapper.insertSelective(stock);
		return result > 0;
	}
	
	public Boolean isStockExist(String symbol) {
		return stockMapper.countBySymbol(symbol) > 0;
	}
	
	public void batchAddBalStatement(List<BalSheet> balSheets) {
		SqlSession sqlSession = sqlBatchSessionTemplate.getSqlSessionFactory().openSession();
		BalSheetMapper balSheetMapper = sqlSession.getMapper(BalSheetMapper.class);
		for (BalSheet balSheet : balSheets) {
			balSheetMapper.insertSelective(balSheet);
		}
		
		sqlSession.commit();
	}
	
	public void batchAddIncStatement(List<IncStatement> incStatements) {
		SqlSession sqlSession = sqlBatchSessionTemplate.getSqlSessionFactory().openSession();
		
		IncStatementMapper incStatementMapper = sqlSession.getMapper(IncStatementMapper.class);
		for (IncStatement incStatement : incStatements) {
			incStatementMapper.insertSelective(incStatement);
		}
		
		sqlSession.commit();
	}
	
	public void batchAddCFStatement(List<CFStatement> cfStatements) {
		SqlSession sqlSession = sqlBatchSessionTemplate.getSqlSessionFactory().openSession();
		
		CFStatementMapper cfStatementMapper = sqlSession.getMapper(CFStatementMapper.class);
		for (CFStatement cfStatement : cfStatements) {
			cfStatementMapper.insertSelective(cfStatement);
		}
		
		sqlSession.commit();
	}
	
	public void batchAddFinMainIndex(List<FinMainIndex> finIndexs) {
		SqlSession sqlSession = sqlBatchSessionTemplate.getSqlSessionFactory().openSession();
		
		FinMainIndexMapper finMainIndexMapper = sqlSession.getMapper(FinMainIndexMapper.class);
		for (FinMainIndex item : finIndexs) {
			finMainIndexMapper.insertSelective(item);
		}
		
		sqlSession.commit();
	}
}
