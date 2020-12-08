package com.itsource.query;

/**
 * 客户分页条件
 * @author Administrator
 *
 */
public class CustomerTransferQuery extends com.itsource.query.BaseQuery {
	
	private String transReason;
	
	// 开始时间
	private String beginTime;

		// 结束时间
	private String endTime;
	
	private Long  oldSellerId;
	
	private Long  newSellerId;
	
	private Long  transUserId;
	
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTransReason() {
		return transReason;
	}

	public void setTransReason(String transReason) {
		this.transReason = transReason;
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

	public Long getOldSellerId() {
		return oldSellerId;
	}

	public void setOldSellerId(Long oldSellerId) {
		this.oldSellerId = oldSellerId;
	}

	public Long getNewSellerId() {
		return newSellerId;
	}

	public void setNewSellerId(Long newSellerId) {
		this.newSellerId = newSellerId;
	}

	public Long getTransUserId() {
		return transUserId;
	}

	public void setTransUserId(Long transUserId) {
		this.transUserId = transUserId;
	}

	
}

 