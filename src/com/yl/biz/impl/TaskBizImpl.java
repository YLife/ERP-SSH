package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.TaskBiz;
import com.yl.dao.TaskDao;
import com.yl.entity.Task;
import com.yl.vo.TaskVo;

public class TaskBizImpl implements TaskBiz {
	private TaskDao dao; 
	@Override
	public List<Task> findList(Integer currentPage, Integer pageSize, TaskVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<Task> findAll() {
		return dao.queryAll();
	}

	@Override
	public Task findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(Task entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void save(Task entity) {
		dao.save(entity);
	}

	@Override
	public void update(Task entity) {
		dao.update(entity);
	}

	@Override
	public void del(Object id) {
		dao.del(id);
	}

	@Override
	public void remove(Task entity) {
		dao.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, TaskVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(TaskDao dao) {
		this.dao = dao;
	}
	
}
