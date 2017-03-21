package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.ProModDao;
import com.yl.entity.ProMod;
import com.yl.vo.ProModVo;

public class ProModDaoImpl extends DbUtil<ProMod> implements ProModDao {

	@Override
	public List<ProMod> queryList(Integer currentPage, Integer pageSize,
			ProModVo vo) {
		String hql = "select m from ProMod m left join fetch m.emp left join fetch m.pro left join fetch m.modPriority where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(ProModVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and m.modCreateDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and m.modCreateDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and m.modCreateDate <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return hql;
	}

	@Override
	public List<ProMod> queryAll() {
		String hql = "select m from ProMod m";
		return super.queryAll(hql);
	}

	@Override
	public ProMod queryById(Object id) {
		String hql = "select m from ProMod m left join fetch m.emp left join fetch m.pro left join fetch m.modPriority where m.modId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(ProMod entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(ProMod entity) {
		super.save(entity);
	}

	@Override
	public void update(ProMod entity) {
		super.update(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from ProMod m where m.modId = ?";
		super.del(hql, id);
	}

	@Override
	public void remove(ProMod entity) {
		super.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from ProMod m where m.modId in(";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		System.out.println(hql+"................");
		super.delMany(hql);
	}

	@Override
	public int getCount(ProModVo vo) {
		String hql = "select count(m) from ProMod m left join m.emp left join m.pro left join m.modPriority where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
