package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.MessBiz;
import com.yl.dao.MessDao;
import com.yl.entity.Mess;
import com.yl.vo.MessVo;

public class MessBizImpl implements MessBiz {
	private MessDao dao;
	@Override
	public List<Mess> queryByName(Integer currentPage, Integer pageSize,
			MessVo vo, String name) {
		return dao.queryByName(currentPage, pageSize, vo, name);
	}

	@Override
	public List<Mess> querySendMess(Integer currentPage, Integer pageSize,
			MessVo vo, String name) {
		return dao.querySendMess(currentPage, pageSize, vo, name);
	}

	@Override
	public List<Mess> queryGetMess(Integer currentPage, Integer pageSize,
			MessVo vo, String name) {
		return dao.queryGetMess(currentPage, pageSize, vo, name);
	}

	@Override
	public int getCountByName(MessVo vo, String name, Integer pageSize) {
		return (dao.getCountByName(vo, name) - 1 ) / pageSize + 1;
	}

	@Override
	public int getCountBySendName(MessVo vo, String name, Integer pageSize) {
		return (dao.getCountBySendName(vo, name) - 1) / pageSize + 1;
	}

	@Override
	public int getCountByGetName(MessVo vo, String name, Integer pageSize) {
		return (dao.getCountByGetName(vo, name) - 1) / pageSize + 1;
	}

	@Override
	public Mess queryById(Integer id) {
		return dao.queryById(id);
	}

	@Override
	public void save(Mess mess) {
		dao.save(mess);
	}

	@Override
	public void delMany(Integer[] ids) {
		dao.delMany(ids);
	}

	public void setDao(MessDao dao) {
		this.dao = dao;
	}

}
