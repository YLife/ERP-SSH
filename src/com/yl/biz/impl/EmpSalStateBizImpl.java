package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpSalStateBiz;
import com.yl.dao.EmpSalStateDao;
import com.yl.entity.EmpSalState;
import com.yl.vo.EmpSalStateVo;

public class EmpSalStateBizImpl implements EmpSalStateBiz {
	private EmpSalStateDao dao;
	@Override
	public List<EmpSalState> findList(Integer currentPage, Integer pageSize,
			EmpSalStateVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpSalState> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpSalState findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(EmpSalState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(EmpSalState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalPage(Integer pageSize, EmpSalStateVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void save(EmpSalState entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EmpSalState entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	public void setDao(EmpSalStateDao dao) {
		this.dao = dao;
	}
	
}
