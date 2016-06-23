package com.finreport.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncStatementList {
	private int comptype;

	private List<IncStatement> list;

	public int getComptype() {
		return comptype;
	}

	public void setComptype(int comptype) {
		this.comptype = comptype;
	}

	public List<IncStatement> getList() {
		return list;
	}

	public void setList(List<IncStatement> list) {
		this.list = list;
	}
}
