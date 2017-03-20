package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProBiz;
import com.yl.dao.ProDao;
import com.yl.entity.Pro;
import com.yl.vo.ProVo;

public class ProBizImpl implements ProBiz {
	private ProDao dao;
	@Override
	public List<Pro> findList(Integer currentPage, Integer pageSize, ProVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Pro> findAll() {
		return dao.queryAll();
	}

	@Override
	public Pro findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Pro entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(Pro entity) {
		dao.save(entity);
	}

	@Override
	public void update(Pro entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(Pro entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ProVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ProDao dao) {
		this.dao = dao;
	}

}
