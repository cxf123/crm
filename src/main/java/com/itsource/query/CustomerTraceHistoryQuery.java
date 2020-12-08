package com.itsource.query;

/**
 * 客户分页条件
 * 
 * @author Administrator
 *
 */

public class CustomerTraceHistoryQuery extends com.itsource.query.BaseQuery {

	private String remark;

	private Long traceUserId;

	private Long traceTypeId;

	private Long customerId;

	// 开始时间
	private String beginTime;

	// 结束时间
	private String endTime;

	private int traceResult = -2;

	public void setTraceResult(int traceResult) {
		this.traceResult = traceResult;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getTraceUserId() {
		return traceUserId;
	}

	public void setTraceUserId(Long traceUserId) {
		this.traceUserId = traceUserId;
	}

	public Long getTraceTypeId() {
		return traceTypeId;
	}

	public void setTraceTypeId(Long traceTypeId) {
		this.traceTypeId = traceTypeId;
	}


	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getTraceResult() {
		return traceResult;
	}

	public void setTraceResult(Integer traceResult) {
		this.traceResult = traceResult;
	}

}
