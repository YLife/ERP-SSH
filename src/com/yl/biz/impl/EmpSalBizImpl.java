package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpSalBiz;
import com.yl.dao.EmpSalDao;
import com.yl.entity.EmpSal;
import com.yl.vo.EmpSalVo;

public class EmpSalBizImpl implements EmpSalBiz {
	private EmpSalDao dao;
	@Override
	public List<EmpSal> findList(Integer currentPage, Integer pageSize,
			EmpSalVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<EmpSal> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpSal findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(EmpSal entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public int getTotalPage(Integer pageSize, EmpSalVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	@Override
	public void remove(EmpSal entity) {
		dao.remove(entity);
	}

	@Override
	public void save(EmpSal entity) {
		dao.save(entity);
	}

	@Override
	public void update(EmpSal entity) {
		dao.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	public void setDao(EmpSalDao dao) {
		this.dao = dao;
	}
	
}
