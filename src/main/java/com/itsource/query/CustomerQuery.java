package com.itsource.query;

/**
 * 客户分页条件
 * 
 * @author Administrator
 *
 */
public class CustomerQuery extends com.itsource.query.BaseQuery {

	private int state = -2;
	
	private Long login;

	public Long getLogin() {
		return login;
	}

	public void setLogin(Long login) {
		this.login = login;
	}

	private Integer age;

	private Integer gender=-2;

	// 开始时间
	private String beginTime;

	// 结束时间
	private String endTime;

	// 创建人
	private Long inputUserId; // null表示不做过滤
	
	private Long sellerId; // null表示不做过滤

	// 客户来源
	private Long customerSourceId;// null表示不做过滤
	
	private Long jobId;// null表示不做过滤
	
	private Long salaryLeveId;// null表示不做过滤
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
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

	public Long getInputUserId() {
		return inputUserId;
	}

	public void setInputUserId(Long inputUserId) {
		this.inputUserId = inputUserId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getCustomerSourceId() {
		return customerSourceId;
	}

	public void setCustomerSourceId(Long customerSourceId) {
		this.customerSourceId = customerSourceId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getSalaryLeveId() {
		return salaryLeveId;
	}

	public void setSalaryLeveId(Long salaryLeveId) {
		this.salaryLeveId = salaryLeveId;
	}

	public void setState(int state) {
		this.state = state;
	}

	

	public int getState() {
		return state;
	}

	public void setStatus(int state) {
		this.state = state;
	}



}
