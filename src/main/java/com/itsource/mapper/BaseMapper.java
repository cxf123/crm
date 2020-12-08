package com.itsource.mapper;


import com.itsource.query.BaseQuery;

import java.io.Serializable;
import java.util.List;

/**
 * 父mapper接口
 * @author MySQL
 *
 * @param <T>
 */
public interface BaseMapper<T> {
	/**
	 * 保存一个对象
	 * @param t
	 */
	void save(T t);
	/**
	 * 移除一个对象
	 * @param id
	 */
	void remove(Serializable id);
	/**
	 * 更新一个对象
	 * @param t
	 */
	void update(T t);
	/**
	 * 加载一个对象
	 * @param id
	 * @return
	 */
	T loadById(Serializable id);
	/**
	 * 加载所有对象
	 * @return
	 */
	List<T> loadAll();
	
	/**根据分页条件查询总条数
	 * @param query
	 * @return
	 */
	int getTotalCount(BaseQuery query);
	
	/**根据分页条件得到查询结果
	 * @param query
	 * @return
	 */
	List<T> getLimitDatas(BaseQuery query);
	
	/**
	 * 资源池
	 */
	
	void savePool(T t);
	
	/**
	 * 删除资源池
	 * @param id
	 */
	void delPool(Serializable id);
	
	
	int getTotalCountPool(BaseQuery query);
	List<T> getLimitDatasPool(BaseQuery query);
}
