package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpSalTypeBiz;
import com.yl.dao.EmpSalTypeDao;
import com.yl.entity.EmpSalType;
import com.yl.vo.EmpSalTypeVo;

public class EmpSalTypeBizImpl implements EmpSalTypeBiz {
	private EmpSalTypeDao dao ;
	@Override
	public List<EmpSalType> findList(Integer currentPage, Integer pageSize,
			EmpSalTypeVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<EmpSalType> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpSalType findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(EmpSalType entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(EmpSalType entity) {
		dao.save(entity);
	}

	@Override
	public void update(EmpSalType entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(EmpSalType entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, EmpSalTypeVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(EmpSalTypeDao dao) {
		this.dao = dao;
	}

}
