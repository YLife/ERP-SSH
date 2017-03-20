package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.EmpSalTypeDao;
import com.yl.entity.EmpSalType;
import com.yl.vo.EmpSalTypeVo;

public class EmpSalTypeDaoImpl extends DbUtil<EmpSalType> implements EmpSalTypeDao {

	@Override
	public List<EmpSalType> queryList(Integer currentPage, Integer pageSize,
			EmpSalTypeVo vo) {
		String hql = "select t from EmpSalType t where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(EmpSalTypeVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and t.salTypeDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and t.salTypeDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and salTypeDate <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return hql;
	}

	@Override
	public List<EmpSalType> queryAll() {
		String hql = "select t from EmpSalType t";
		return super.queryAll(hql);
	}

	@Override
	public EmpSalType queryById(Object id) {
		String hql = "select t from EmpSalType t where t.salTypeId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(EmpSalType entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(EmpSalType entity) {
		super.save(entity);
	}

	@Override
	public void update(EmpSalType entity) {
		super.update(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from EmpSalType t where t.salTypeId = ?";
		super.del(hql, id);
	}

	@Override
	public void remove(EmpSalType entity) {
		super.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from EmpSalType t where t.salTypeId in(";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(EmpSalTypeVo vo) {
		String hql = "select count(t) from EmpSalType t where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
