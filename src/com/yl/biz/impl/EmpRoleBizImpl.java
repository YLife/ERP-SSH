package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.EmpRoleBiz;
import com.yl.dao.EmpRoleDao;
import com.yl.entity.EmpRole;
import com.yl.vo.EmpRoleVo;

public class EmpRoleBizImpl implements EmpRoleBiz {
	private EmpRoleDao dao;
	@Override
	public List<EmpRole> findList(Integer currentPage, Integer pageSize,
			EmpRoleVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpRole> findAll() {
		return dao.queryAll();
	}

	@Override
	public EmpRole findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(EmpRole entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalPage(Integer pageSize, EmpRoleVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(EmpRole entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(EmpRole entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EmpRole entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	public void setDao(EmpRoleDao dao) {
		this.dao = dao;
	}
	
}
