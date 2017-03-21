package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.ProDao;
import com.yl.entity.Pro;
import com.yl.vo.ProVo;

public class ProDaoImpl extends DbUtil<Pro> implements ProDao {

	@Override
	public List<Pro> queryList(Integer currentPage, Integer pageSize, ProVo vo) {
		String hql = "select p from Pro p left join fetch p.emp left join fetch p.client left join fetch p.proPriority left join fetch p.proState where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(ProVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and p.createDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and p.createDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and p.createDate <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return hql;
	}

	@Override
	public List<Pro> queryAll() {
		String hql = "select p from Pro p";
		return super.queryAll(hql);
	}

	@Override
	public Pro queryById(Object id) {
		String hql = "select p from Pro p left join fetch p.client left join fetch p.emp left join fetch p.proPriority left join fetch p.proState where p.proId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(Pro entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(Pro entity) {
		super.save(entity);
	}

	@Override
	public void update(Pro entity) {
		super.update(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from Pro p where p.proId = ?";
		super.del(hql, id);
	}

	@Override
	public void remove(Pro entity) {
		super.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from Pro p where p.proId in(";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(ProVo vo) {
		String hql = "select count(p) from Pro p left join p.client left join p.emp left join p.proPriority left join p.proState where 1=1";
		this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
