package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpJobBiz;
import com.yl.dao.EmpJobDao;
import com.yl.entity.EmpJob;
import com.yl.vo.EmpJobVo;

public class EmpJobBizImpl implements EmpJobBiz {
	private EmpJobDao dao;
	@Override
	public List<EmpJob> findList(Integer currentPage, Integer pageSize,
			EmpJobVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<EmpJob> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpJob findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(EmpJob entity) {
		dao.saveOrUpdate(entity);

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalPage(Integer pageSize, EmpJobVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	@Override
	public void remove(EmpJob entity) {
		dao.remove(entity);
	}

	@Override
	public void save(EmpJob entity) {
		dao.save(entity);
	}

	@Override
	public void update(EmpJob entity) {
		dao.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	public void setDao(EmpJobDao dao) {
		this.dao = dao;
	}
	
}
