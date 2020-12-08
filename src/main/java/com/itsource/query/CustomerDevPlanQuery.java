package com.itsource.query;

/**
 * 客户分页条件
 * 
 * @author Administrator
 *
 */
public class CustomerDevPlanQuery extends com.itsource.query.BaseQuery {

	private String planDetails;

	private Long planTypeId;

	// 创建人 :当前登录人
	private Long inputUserId;

	// 潜在客户 :
	private Long potentialCustomerId;

	// 计划开始时间
	private String planBeginTime;

	// 计划结束时间
	private String planEndTime;

	// 创建_开始时间
	private String createBeginTime;

	// 创建结束时间
	private String createEndTime;
	

	public String getPlanDetails() {
		return planDetails;
	}

	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}

	public Long getPlanTypeId() {
		return planTypeId;
	}

	public void setPlanTypeId(Long planTypeId) {
		this.planTypeId = planTypeId;
	}

	public Long getInputUserId() {
		return inputUserId;
	}

	public void setInputUserId(Long inputUserId) {
		this.inputUserId = inputUserId;
	}

	public Long getPotentialCustomerId() {
		return potentialCustomerId;
	}

	public void setPotentialCustomerId(Long potentialCustomerId) {
		this.potentialCustomerId = potentialCustomerId;
	}

	public String getPlanBeginTime() {
		return planBeginTime;
	}

	public void setPlanBeginTime(String planBeginTime) {
		this.planBeginTime = planBeginTime;
	}

	public String getPlanEndTime() {
		return planEndTime;
	}

	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}

	public String getCreateBeginTime() {
		return createBeginTime;
	}

	public void setCreateBeginTime(String createBeginTime) {
		this.createBeginTime = createBeginTime;
	}

	public String getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
	}

}
