package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ProPriorityDao;
import com.yl.entity.ProPriority;
import com.yl.vo.ProPriorityVo;

public class ProPriorityDaoImpl extends DbUtil<ProPriority> implements ProPriorityDao {

	@Override
	public List<ProPriority> queryList(Integer currentPage, Integer pageSize,
			ProPriorityVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProPriority> queryAll() {
		String hql = "select p from ProPriority p";
		return super.queryAll(hql);
	}

	@Override
	public ProPriority queryById(Object id) {
		String hql = "select p from ProPriority p where p.priorityId = ?";
		return super.queryById(hql, id);
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
	public int getCount(ProPriorityVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
