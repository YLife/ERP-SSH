package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProFunPriorityBiz;
import com.yl.dao.ProFunPriorityDao;
import com.yl.entity.ProFunPriority;
import com.yl.vo.ProFunPriorityVo;

public class ProFunPriorityBizImpl implements ProFunPriorityBiz {
	private ProFunPriorityDao dao;
	@Override
	public List<ProFunPriority> findList(Integer currentPage, Integer pageSize,
			ProFunPriorityVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<ProFunPriority> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProFunPriority findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(ProFunPriority entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(ProFunPriority entity) {
		dao.save(entity);
	}

	@Override
	public void update(ProFunPriority entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(ProFunPriority entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ProFunPriorityVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ProFunPriorityDao dao) {
		this.dao = dao;
	}

}
