package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProModPriorityBiz;
import com.yl.dao.ProModPriorityDao;
import com.yl.entity.ProModPriority;
import com.yl.vo.ProModPriorityVo;

public class ProModPriorityBizImpl implements ProModPriorityBiz {
	private ProModPriorityDao dao;
	@Override
	public List<ProModPriority> findList(Integer currentPage, Integer pageSize,
			ProModPriorityVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<ProModPriority> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProModPriority findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(ProModPriority entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(ProModPriority entity) {
		dao.save(entity);
	}

	@Override
	public void update(ProModPriority entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(ProModPriority entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ProModPriorityVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ProModPriorityDao dao) {
		this.dao = dao;
	}
	
}
