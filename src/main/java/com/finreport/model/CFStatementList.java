package com.finreport.model;

import java.util.List;

public class CFStatementList {
	private int comptype;

	private List<CFStatement> list;

	public int getComptype() {
		return comptype;
	}

	public void setComptype(int comptype) {
		this.comptype = comptype;
	}

	public List<CFStatement> getList() {
		return list;
	}

	public void setList(List<CFStatement> list) {
		this.list = list;
	}
	
	
}
