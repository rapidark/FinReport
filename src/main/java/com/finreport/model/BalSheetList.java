package com.finreport.model;

import java.util.List;

public class BalSheetList {
	private int comptype;

	private List<BalSheet> list;

	public int getComptype() {
		return comptype;
	}

	public void setComptype(int comptype) {
		this.comptype = comptype;
	}

	public List<BalSheet> getList() {
		return list;
	}

	public void setList(List<BalSheet> list) {
		this.list = list;
	}
}
