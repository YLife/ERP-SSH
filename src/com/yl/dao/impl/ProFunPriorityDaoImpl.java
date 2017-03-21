package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ProFunPriorityDao;
import com.yl.entity.ProFunPriority;
import com.yl.vo.ProFunPriorityVo;

public class ProFunPriorityDaoImpl extends DbUtil<ProFunPriority> implements
		ProFunPriorityDao {

	@Override
	public List<ProFunPriority> queryList(Integer currentPage,
			Integer pageSize, ProFunPriorityVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProFunPriority> queryAll() {
		String hql = "from ProFunPriority p";
		return super.queryAll(hql);
	}

	@Override
	public ProFunPriority queryById(Object id) {
		String hql = "select p from ProFunPriority p where p.funPriorityId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(ProFunPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(ProFunPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProFunPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(ProFunPriority entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(ProFunPriorityVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
