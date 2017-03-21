package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ProFunDao;
import com.yl.entity.ProFun;
import com.yl.vo.ProFunVo;

public class ProFunDaoImpl extends DbUtil<ProFun> implements ProFunDao {

	@Override
	public List<ProFun> queryList(Integer currentPage, Integer pageSize,
			ProFunVo vo) {
		String hql = "select f from ProFun f left join fetch f.emp left join fetch f.mod left join fetch f.funPriority where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(ProFunVo vo, String hql) {
		if (vo !=null) {
			hql += " and f.funName like '%"+vo.getName()+"%'";
		}
		return hql;
	}

	@Override
	public List<ProFun> queryAll() {
		String hql = "from ProFun";
		return super.queryAll(hql);
	}

	@Override
	public ProFun queryById(Object id) {
		String hql = "select f from ProFun f left join fetch f.emp left join fetch f.mod left join fetch f.funPriority where f.funId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(ProFun entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(ProFun entity) {
		super.save(entity);
	}

	@Override
	public void update(ProFun entity) {
		super.update(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from ProFun f where f.funId = ?";
		super.del(hql, id);
	}

	@Override
	public void remove(ProFun entity) {
		super.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from ProFun f where f.funId in(";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(ProFunVo vo) {
		String hql = "select count(f) from ProFun f left join f.emp left join f.mod left join f.funPriority where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
