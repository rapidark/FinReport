package com.finreport.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.finreport.mapper.BalSheetMapper;
import com.finreport.mapper.CFStatementMapper;
import com.finreport.mapper.FinMainIndexMapper;
import com.finreport.mapper.IncStatementMapper;
import com.finreport.mapper.StockMapper;
import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.ReducedFinStat;
import com.finreport.model.Stock;

@Component
@Transactional
public class FinStatementServiceImpl implements FinStatementService {
	
	public static final Integer beginYear = Integer.parseInt((Calendar.getInstance().get(Calendar.YEAR) + "0101"));
	
	public static final String cash = "cash";
	public static final String balance = "balance";
	public static final String income = "income";
	public static final String finindex = "finindex";
	
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
	
//	public BalSheet getBalanceByStockCode(String stockcode) {
//		return balSheetMapper.selectByPrimaryKey(stockcode);
//	}
	
	public Boolean addBalanceStatement(BalSheet balSheet) {
		int result = balSheetMapper.insertSelective(balSheet);
		return result > 0;
	}
	
	public boolean isBalanceStatementExist(String stockcode, Integer reportDate){
		return balSheetMapper.countByPrimaryKey(stockcode, reportDate) > 0;
	}
	
	public Boolean addCFStatement(CFStatement cfStatement) {
		int result = cfStatementMapper.insertSelective(cfStatement);
		return result > 0;
	}
	
	public boolean isCFStatementExist(String stockcode, Integer reportDate){
		return cfStatementMapper.countByPrimaryKey(stockcode, reportDate) > 0;
	}
	
	public Boolean addFinMainIndex(FinMainIndex finMainIndex) {
		int result = finMainIndexMapper.insertSelective(finMainIndex);
		return result > 0;
	}
	
	public boolean isFinMainIndexExist(String stockcode, Integer reportDate){
		return finMainIndexMapper.countByPrimaryKey(stockcode, reportDate) > 0;
	}
	
	public Boolean addIncStatement(IncStatement incStatement) {
		int result = incStatementMapper.insertSelective(incStatement);
		return result > 0;
	}
	
	public boolean isIncStatementExist(String stockcode, Integer reportDate){
		return incStatementMapper.countByPrimaryKey(stockcode, reportDate) > 0;
	}
	
	public Boolean addStock(Stock stock) {
		int result = stockMapper.insertSelective(stock);
		return result > 0;
	}
	
	public Boolean updateStock(Stock stock) {
		int result = stockMapper.updateByPrimaryKeySelective(stock);
		return result > 0;
	}
	
	@Override
	public void deleteStock(String code) {
		stockMapper.deleteByPrimaryKey(code);
	}

	public Boolean isStockExist(String code) {
		return stockMapper.countByCode(code) > 0;
	}
	
	public void batchAddFinancialReport(List<BalSheet> balSheets, List<IncStatement> incStatements, List<CFStatement> cfStatements, List<FinMainIndex> finIndexs) {
		SqlSession sqlSession = sqlBatchSessionTemplate.getSqlSessionFactory().openSession();
		
		BalSheetMapper balSheetMapper = sqlSession.getMapper(BalSheetMapper.class);
		if (balSheets != null) {
			for (BalSheet balSheet : balSheets) {
				balSheetMapper.insertSelective(balSheet);
			}
		}
		
		IncStatementMapper incStatementMapper = sqlSession.getMapper(IncStatementMapper.class);
		if(incStatements != null) {
			for (IncStatement incStatement : incStatements) {
				incStatementMapper.insertSelective(incStatement);
			}
		}
		
		CFStatementMapper cfStatementMapper = sqlSession.getMapper(CFStatementMapper.class);
		if (cfStatements != null) {
			for (CFStatement cfStatement : cfStatements) {
				cfStatementMapper.insertSelective(cfStatement);
			}
		}
		
		
		FinMainIndexMapper finMainIndexMapper = sqlSession.getMapper(FinMainIndexMapper.class);
		if(finIndexs != null) {
			for (FinMainIndex item : finIndexs) {
				finMainIndexMapper.insertSelective(item);
			}
		}
		
		
		sqlSession.commit();
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

	@Override
	public List<String> getNonfinancialReport() {
		return stockMapper.getNonFinancialStock();
	}

	@Override
	public List<BalSheet> getBalSheetByStockCodeAndQuarter(String[] stockcode, String quarter) {
		return balSheetMapper.selectByStockcodeAndQuater(stockcode, beginYear, quarter);
	}

	@Override
	public List<CFStatement> getCFStatementByStockCodeAndQuarter(String[] stockcode, String quarter) {
		return cfStatementMapper.selectByStockcodeAndQuater(stockcode, beginYear, quarter);
	}

	@Override
	public List<FinMainIndex> getFinMainIndexByStockCodeAndQuarter(String[] stockcode, String quarter) {
		return finMainIndexMapper.selectByStockcodeAndQuater(stockcode, beginYear, quarter);
	}

	@Override
	public List<IncStatement> getIncStatementByStockCodeAndQuarter(String[] stockcode, String quarter) {
		return incStatementMapper.selectByStockcodeAndQuater(stockcode, beginYear, quarter);
	}
	
	@Override
	public List<ReducedFinStat> getSpecificFinStatement(String[] codes, List<ReducedFinStat> reducedFinStats, String quarter) {
		for (ReducedFinStat reducedFinStat : reducedFinStats) {
			if(reducedFinStat.getTable().equals(cash)) {
				cfStatementMapper.selectSpecificColumnByStockcodeAndQuater(reducedFinStat.getColumns(), codes, beginYear, quarter);
			} else if (reducedFinStat.getTable().equals(balance)) {
				balSheetMapper.selectSpecificColumnByStockcodeAndQuater(reducedFinStat.getColumns(), codes, beginYear, quarter);
			} else if (reducedFinStat.getTable().equals(income)) {
				incStatementMapper.selectSpecificColumnByStockcodeAndQuater(reducedFinStat.getColumns(), codes, beginYear, quarter);
			} else if(reducedFinStat.getTable().equals(finindex)) {
				finMainIndexMapper.selectSpecificColumnByStockcodeAndQuater(reducedFinStat.getColumns(), codes, beginYear, quarter);
			} else {
				// to do nothing.
			}
		}
		
		return null;
	}
}
