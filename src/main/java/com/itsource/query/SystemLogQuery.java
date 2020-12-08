package com.itsource.query;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SystemLogQuery extends com.itsource.query.BaseQuery {
	
	private String opUser;
	private String params;
	
	private String functionNane;
	
	
	
	private  String beginDate ;
	private  String endDate ;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
	
	public String getOpUser() {
		return opUser;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setOpUser(String opUser) {
		this.opUser = opUser;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getFunctionNane() {
		return functionNane;
	}
	public void setFunctionNane(String functionNane) {
		this.functionNane = functionNane;
	}
	
	
	
}
