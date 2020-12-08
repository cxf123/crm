package com.itsource.query;

/**
 * 客户分页条件
 * 
 * @author Administrator
 *
 */
public class PotentialCustomerQuery extends com.itsource.query.BaseQuery {

	private int status = -2;

	private Integer successRate;

	// 开始时间
	private String beginTime;

	// 结束时间
	private String endTime;

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

	// 创建人
	private Long inputUserId; // null表示不做过滤

	// 客户来源
	private Long customerSourceId;// null表示不做过滤

	public Integer getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(Integer successRate) {
		this.successRate = successRate;
	}

	public Long getInputUserId() {
		return inputUserId;
	}

	public void setInputUserId(Long inputUserId) {
		this.inputUserId = inputUserId;
	}

	public Long getCustomerSourceId() {
		return customerSourceId;
	}

	public void setCustomerSourceId(Long customerSourceId) {
		this.customerSourceId = customerSourceId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
