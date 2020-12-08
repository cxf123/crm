package com.itsource.query;

//员工查询对象
public class EmployeeQuery extends com.itsource.query.BaseQuery {

	private int state = -2;
	// 部门id
	private Long deptId;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

}
