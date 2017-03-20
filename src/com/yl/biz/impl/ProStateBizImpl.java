package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProStateBiz;
import com.yl.dao.ProStateDao;
import com.yl.entity.ProState;
import com.yl.vo.ProStateVo;

public class ProStateBizImpl implements ProStateBiz {
	private ProStateDao dao;
	@Override
	public List<ProState> findList(Integer currentPage, Integer pageSize,
			ProStateVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProState> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProState findById(Object id) {
		return dao.queryById(id);
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
	public int getTotalPage(Integer pageSize, ProStateVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDao(ProStateDao dao) {
		this.dao = dao;
	}
	
}
