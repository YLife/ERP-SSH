package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ProModPriorityDao;
import com.yl.entity.ProModPriority;
import com.yl.vo.ProModPriorityVo;

public class ProModPriorityDaoImpl extends DbUtil<ProModPriority> implements
		ProModPriorityDao {

	@Override
	public List<ProModPriority> queryList(Integer currentPage,
			Integer pageSize, ProModPriorityVo vo) {
		return null;
	}

	@Override
	public List<ProModPriority> queryAll() {
		String hql = "select p from ProModPriority p";
		return super.queryAll(hql);
	}

	@Override
	public ProModPriority queryById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ProModPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(ProModPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProModPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(ProModPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(ProModPriorityVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
