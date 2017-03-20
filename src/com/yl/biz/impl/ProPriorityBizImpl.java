package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ProPriorityBiz;
import com.yl.dao.ProPriorityDao;
import com.yl.entity.ProPriority;
import com.yl.vo.ProPriorityVo;

public class ProPriorityBizImpl implements ProPriorityBiz {
	private ProPriorityDao dao;
	@Override
	public List<ProPriority> findList(Integer currentPage, Integer pageSize,
			ProPriorityVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProPriority> findAll() {
		return dao.queryAll();
	}

	@Override
	public ProPriority findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(ProPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(ProPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(ProPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalPage(Integer pageSize, ProPriorityVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDao(ProPriorityDao dao) {
		this.dao = dao;
	}
	
}
