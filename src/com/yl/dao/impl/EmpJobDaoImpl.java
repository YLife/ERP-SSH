package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.EmpJobDao;
import com.yl.entity.EmpJob;
import com.yl.vo.EmpJobVo;

public class EmpJobDaoImpl extends DbUtil<EmpJob> implements EmpJobDao {
	
	@Override
	public List<EmpJob> queryList(Integer currentPage, Integer pageSize,
			EmpJobVo vo) {
		String hql = "select j from EmpJob j where 1=1";
		if (vo != null) {
			hql += "";
		}
		return super.queryList(hql, currentPage, pageSize);
	}

	@Override
	public List<EmpJob> queryAll() {
		String hql = "from EmpJob j";
		return super.queryAll(hql);
	}

	@Override
	public EmpJob queryById(Object id) {
		String hql = "select j from EmpJob j where j.jobId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(EmpJob entity) {
		super.saveOrUpdate(entity);

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount(EmpJobVo vo) {
		String hql = "select count(j) from EmpJob j where 1=1";
		if (vo != null) {
			hql += "";
		}
		return super.getCount(hql);
	}
	
	@Override
	public void remove(EmpJob entity) {
		super.remove(entity);
	}
	
	@Override
	public void save(EmpJob entity) {
		super.save(entity);
	}
	
	@Override
	public void update(EmpJob entity) {
		super.update(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from EmpJob j where j.jobId in (";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0 , hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

}
