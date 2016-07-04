package com.finreport.model;

import java.util.List;
import java.util.Map;

public class ReducedFinStat {
	private String table;
	private List<String> columns;
	private List<Map<String, Object>> data;
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public List<String> getColumns() {
		return columns;
	}
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
	
	public List<Map<String, Object>> getData() {
		return data;
	}
	public void setData(List<Map<String, Object>> data) {
		this.data = data;
	}
}
