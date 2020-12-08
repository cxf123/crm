package com.itsource.query;

/**分页条件
 * @author Administrator
 *
 */
public class DepartmentQuery extends com.itsource.query.BaseQuery {
	
	//自己的查询条件
	private int state=-2;
	
	//上级部门Id
	private Long parentId;//null表示不做过滤
	//部门经理Id
	private Long managerId;//null表示不做过滤
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "DepartmentQuery [state=" + state + ", parentId=" + parentId + ", managerId=" + managerId + "]";
	}
	
	
	
	
}
 