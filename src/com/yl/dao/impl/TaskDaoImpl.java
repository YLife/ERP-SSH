package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.TaskDao;
import com.yl.entity.Task;
import com.yl.vo.TaskVo;

public class TaskDaoImpl extends DbUtil<Task> implements TaskDao {

	@Override
	public List<Task> queryList(Integer currentPage, Integer pageSize, TaskVo vo) {
		String hql = "select t from Task t left join fetch t.emp left join fetch t.pro left join fetch t.mod left join fetch t.fun left join fetch t.priority where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(TaskVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo != null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and t.taskCreateDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and t.taskCreateDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null) {
					hql += " and t.taskCreateDate <= '"+sdf.format(vo.getEnd())+"'"	;
				}
			}
		}
		return hql;
	}

	@Override
	public List<Task> queryAll() {
		String hql = "from Task";
		return super.queryAll(hql);
	}

	@Override
	public Task queryById(Object id) {
		String hql = "select t from Task t left join fetch t.emp left join fetch t.pro left join fetch t.mod left join fetch t.fun left join fetch t.priority where t.taskId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(Task entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(Task entity) {
		super.save(entity);
	}

	@Override
	public void update(Task entity) {
		super.update(entity);
	}

	@Override
	public void del(Object id) {
		String hql = "delete from Task t where t.taskId = ?";
		super.del(hql, id);
	}

	@Override
	public void remove(Task entity) {
		super.remove(entity);
	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from Task t where t.taskId in (";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(TaskVo vo) {
		String hql = "select count(t) from Task t left join t.emp left join t.pro left join t.mod left join t.fun left join t.priority where 1=1";
		hql = this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
