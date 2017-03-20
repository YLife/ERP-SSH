package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpSalDao;
import com.yl.entity.EmpSal;
import com.yl.vo.EmpSalVo;

public class EmpSalDaoImpl extends DbUtil<EmpSal> implements EmpSalDao {

	@Override
	public List<EmpSal> queryList(Integer currentPage, Integer pageSize,
			EmpSalVo vo) {
		String hql = "select s from EmpSal s left join fetch s.emp left join fetch s.salState ss where 1=1";
		if ( vo != null) {
			hql += "";
		}
		return super.queryList(hql, currentPage, pageSize);
	}

	@Override
	public List<EmpSal> queryAll() {
		String hql = "select s from EmpSal s left join fetch s.emp e left join fetch s.salState";
		return super.queryAll(hql);
	}

	@Override
	public EmpSal queryById(Object id) {
		String hql = "select s from EmpSal s left join fetch s.emp e left join fetch s.salState where s.salId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(EmpSal entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from EmpSal s where s.emp = ?";
		super.del(hql, id);
	}

	@Override
	public int getCount(EmpSalVo vo) {
		String hql = "select count(s) from EmpSal s left join s.emp left join s.salState where 1=1";
		if (vo != null) {
			hql += "";
		}
		return super.getCount(hql);
	}
	
	@Override
	public void remove(EmpSal entity) {
		super.remove(entity);
	}
	
	@Override
	public void save(EmpSal entity) {
		super.save(entity);
	}
	
	@Override
	public void update(EmpSal entity) {
		super.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from EmpSal s where s.emp in (";
		if (ids != null) {
			for (Object id : ids) {
				hql += id + ",";
			}
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		System.out.println(hql + "============");
		super.delMany(hql);
	}

}
