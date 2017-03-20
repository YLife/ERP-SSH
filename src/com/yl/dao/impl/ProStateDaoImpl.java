package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ProStateDao;
import com.yl.entity.ProState;
import com.yl.vo.ProStateVo;

public class ProStateDaoImpl extends DbUtil<ProState> implements ProStateDao {

	@Override
	public List<ProState> queryList(Integer currentPage, Integer pageSize,
			ProStateVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProState> queryAll() {
		String hql = "select t from ProState t";
		return super.queryAll(hql);
	}

	@Override
	public ProState queryById(Object id) {
		String hql = "select t from ProState t where t.proStateId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(ProState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(ProState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(ProState entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(ProStateVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
