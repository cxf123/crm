package com.itsource.service.impl;

import com.itsource.query.BaseQuery;
import com.itsource.service.BaseService;
import com.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itsource.mapper.BaseMapper;
import java.io.Serializable;
import java.util.List;

/**
 * @Transactional(propagation=Propagation.SUPPORTS,readOnly=true) 
 * 开启事务管理:由于是查询方法比较多,就开启默认不添加事务
 * @author MySQL
 *
 * @param <T>
 */
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BaseServiceImpl<T> implements BaseService<T> {
	@Autowired
	protected BaseMapper<T> mapper;

	@Transactional
	@Override
	public void add(T t) {
		mapper.save(t);
	}

	@Transactional
	@Override
	public void delete(Serializable id) {
		mapper.remove(id);
	}

	@Transactional
	@Override
	public void update(T t) {

		mapper.update(t);
	}

	@Override
	public T get(Serializable id) {
		return mapper.loadById(id);
	}

	@Override
	public List<T> getAll() {
		return mapper.loadAll();
		
	}

	@Override
	public PageList<T> findByQuery(BaseQuery query) {
		//根据分页条件拿到总条数
		int totalCount = mapper.getTotalCount(query);
		//如果数据小于1 返回 ，节约资源
		if (totalCount<1) {
			return new PageList<>();
		}
		//拿到分页后的总数据
		List<T> datas = mapper.getLimitDatas(query);
		return new PageList<>(totalCount, datas);
	}

	@Override
	public void addPool(T t) {

		mapper.savePool(t);
	}

	@Override
	public void delPool(Serializable id) {
		// TODO Auto-generated method stub
		mapper.delPool(id);
	}

	@Override
	public PageList<T> findByQueryPool(BaseQuery query) {
		//根据分页条件拿到总条数
		int totalCount = mapper.getTotalCountPool(query);
		//如果数据小于1 返回 ，节约资源
		if (totalCount<1) {
			return new PageList<>();
		}
		//拿到分页后的总数据
		List<T> datas = mapper.getLimitDatasPool(query);
		return new PageList<>(totalCount, datas);
		
	}


}
