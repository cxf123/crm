package com.itsource.util;

import java.util.ArrayList;
import java.util.List;

/** 封装分页后的对象
 * @author Administrator
 *
 * @param <T>
 */
public class PageList<T> {
	//总条数
	private int total = 0;
	//每页的数据
	private List<T> rows = new ArrayList<>();

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}


	public PageList(int total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}

	public PageList() {
	}

	@Override
	public String toString() {
		return "PageList{" +
				"total=" + total +
				", rows=" + rows +
				'}';
	}
}
