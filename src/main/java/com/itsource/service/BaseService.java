package com.itsource.service;


import com.itsource.query.BaseQuery;
import com.itsource.util.PageList;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	/**
	 * 保存一个对象
	 * @param t
	 */
	void add(T t);
	/**
	 * 删除
	 * @param id
	 */
	void delete(Serializable id);
	/**
	 * 更新
	 * @param t
	 */
	void update(T t);
	/**
	 * 得到一个
	 * @param id
	 * @return
	 */
	T get(Serializable id);
	/**
	 * 得到所有
	 * @return
	 */
	List<T> getAll();
	
	/**根据分页条件返回查询结果
	 * @param query
	 * @return
	 */
	PageList<T> findByQuery(BaseQuery query);
	
	
	void addPool(T t);
	
	void delPool(Serializable id);
	
	PageList<T> findByQueryPool(BaseQuery query);
	
	
	
}
