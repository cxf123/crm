package com.itsource.query;

/**分页条件
 * @author Administrator
 *
 */
public class RepairQuery extends com.itsource.query.BaseQuery {
	private Long customerId;
	private Long constractId;
	private  Integer state;//状态0：正常， -1：请选择， 1：作废

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getConstractId() {
		return constractId;
	}

	public void setConstractId(Long constractId) {
		this.constractId = constractId;
	}
}
 