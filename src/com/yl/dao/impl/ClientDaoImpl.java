package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.ClientDao;
import com.yl.entity.Client;
import com.yl.vo.ClientVo;

public class ClientDaoImpl extends DbUtil<Client> implements ClientDao {

	@Override
	public List<Client> queryList(Integer currentPage, Integer pageSize,
			ClientVo vo) {
		String hql = "select c from Client c where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(ClientVo vo, String hql) {
		if (vo != null) {
			hql += " and c.clientComp like '%"+vo.getClientComp()+"%'";
		}
		return hql;
	}

	@Override
	public List<Client> queryAll() {
		String hql = "from Client c";
		return super.queryAll(hql);
	}

	@Override
	public Client queryById(Object id) {
		String hql = "select c from Client c where c.clientId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(Client entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(Client entity) {

	}

	@Override
	public void update(Client entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Client entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from Client c where c.clientId in (";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(ClientVo vo) {
		String hql = "select count(c) from Client c where 1=1";
		this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
