package com.itsource.query;

public class SystemDictionaryItemQuery extends com.itsource.query.BaseQuery {
	//新增字段用于数据字典和数据字典明细的联动查询
	private  Long parentId;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	

}
