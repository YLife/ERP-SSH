package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProModBiz;
import com.yl.dao.ProModDao;
import com.yl.entity.ProMod;
import com.yl.vo.ProModVo;

public class ProModBizImpl implements ProModBiz {
	private ProModDao dao;
	@Override
	public List<ProMod> findList(Integer currentPage, Integer pageSize,
			ProModVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<ProMod> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProMod findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(ProMod entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(ProMod entity) {
		dao.save(entity);
	}

	@Override
	public void update(ProMod entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(ProMod entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ProModVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ProModDao dao) {
		this.dao = dao;
	}

}
