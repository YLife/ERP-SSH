package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.ClientBiz;
import com.yl.dao.ClientDao;
import com.yl.entity.Client;
import com.yl.vo.ClientVo;

public class ClientBizImpl implements ClientBiz {
	private ClientDao dao;
	@Override
	public List<Client> findList(Integer currentPage, Integer pageSize,
			ClientVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Client> findAll() {
		return dao.queryAll();
	}

	@Override
	public Client findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Client entity) {
		dao.saveOrUpdate(entity);

	}

	@Override
	public void save(Client entity) {
		dao.save(entity);
	}

	@Override
	public void update(Client entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(Client entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, ClientVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(ClientDao dao) {
		this.dao = dao;
	}
	
}
