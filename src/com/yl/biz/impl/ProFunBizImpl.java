package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProFunBiz;
import com.yl.dao.ProFunDao;
import com.yl.entity.ProFun;
import com.yl.vo.ProFunVo;

public class ProFunBizImpl implements ProFunBiz {
	private ProFunDao dao;
	@Override
	public List<ProFun> findList(Integer currentPage, Integer pageSize,
			ProFunVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<ProFun> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProFun findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(ProFun entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(ProFun entity) {
		dao.save(entity);
	}

	@Override
	public void update(ProFun entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(ProFun entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ProFunVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ProFunDao dao) {
		this.dao = dao;
	}

}
