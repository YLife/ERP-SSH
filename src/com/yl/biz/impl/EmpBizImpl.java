package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpBizImpl implements EmpBiz {
	private EmpDao dao;
	@Override
	public List<Emp> findList(Integer currentPage, Integer pageSize, EmpVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Emp> findAll() {
		return dao.queryAll();
	}

	@Override
	public Emp findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Emp entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public int getTotalPage(Integer pageSize, EmpVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	@Override
	public void remove(Emp entity) {
		dao.remove(entity);
	}

	@Override
	public void save(Emp entity) {
		dao.save(entity);
	}

	@Override
	public void update(Emp entity) {
		dao.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

}
