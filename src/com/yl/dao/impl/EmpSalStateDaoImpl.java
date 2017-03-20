package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpSalStateDao;
import com.yl.entity.EmpSalState;
import com.yl.vo.EmpSalStateVo;

public class EmpSalStateDaoImpl extends DbUtil<EmpSalState> implements EmpSalStateDao {

	@Override
	public List<EmpSalState> queryList(Integer currentPage, Integer pageSize,
			EmpSalStateVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpSalState> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpSalState queryById(Object id) {
		String hql = "select e from EmpSalState e where e.salStateId = ?";
		return super.queryById(hql, id);
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
	public int getCount(EmpSalStateVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void save(EmpSalState entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	
	@Override
	public void update(EmpSalState entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from EmpSalState s where s.salStateId in (";
		if (ids != null) {
			for (Object id : ids) {
				hql += id + ",";
			}
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

}
