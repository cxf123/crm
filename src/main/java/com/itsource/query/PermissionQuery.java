package com.itsource.query;

/**
 * 分页条件
 * 
 * @author Administrator
 *
 */
public class PermissionQuery extends com.itsource.query.BaseQuery {
	// 菜单名称
	private Long menuId;
	// 状态
	private Long state;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

}
