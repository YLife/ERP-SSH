package com.yl.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.yl.dao.MessDao;
import com.yl.entity.Mess;
import com.yl.vo.MessVo;

public class MessDaoImpl extends DbUtil<Mess> implements MessDao {

	@Override
	public List<Mess> queryByName(Integer currentPage, Integer pageSize,
			MessVo vo , String name) {
		String hql = "select m from Mess m where 1=1";
		hql = setCondition(vo, hql);
		hql += " and m.sendName = '"+name+"' or m.getName = '"+name+"'";
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(MessVo vo, String hql) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (vo !=null) {
			if (vo.getBegin() != null) {
				if (vo.getEnd() != null) {
					hql += " and m.sendDate between '"+sdf.format(vo.getBegin())+"' and '"+sdf.format(vo.getEnd())+"'";
				}else {
					hql += " and m.sendDate >= '"+sdf.format(vo.getBegin())+"'";
				}
			}else {
				if (vo.getEnd() != null ) {
					hql += " and m.sendDate <= '"+sdf.format(vo.getEnd())+"'";
				}
			}
		}
		return hql;
	}

	@Override
	public List<Mess> querySendMess(Integer currentPage, Integer pageSize,
			MessVo vo, String name) {
		String hql = "select m from Mess m where 1=1";
		this.setCondition(vo, hql);
		hql += " and m.sendName = '"+name+"'";
		return super.queryList(hql, currentPage, pageSize);
	}

	@Override
	public List<Mess> queryGetMess(Integer currentPage, Integer pageSize,
			MessVo vo, String name) {
		String hql = "select m from Mess m where 1=1";
		this.setCondition(vo, hql);
		hql += " and m.getName = '"+name+"'";
		return super.queryList(hql, currentPage, pageSize);
	}

	@Override
	public int getCountByName(MessVo vo, String name) {
		String hql = "select count(m) from Mess m where 1=1";
		this.setCondition(vo, hql);
		hql += " and m.getName = '"+name+"' or m.sendName = '"+name+"'";
		return super.getCount(hql);
	}

	@Override
	public int getCountBySendName(MessVo vo, String name) {
		String hql = "select count(m) from Mess m where 1=1";
		this.setCondition(vo, hql);
		hql += " and m.sendName = '"+name+"'";
		return 0;
	}

	@Override
	public int getCountByGetName(MessVo vo, String name) {
		String hql = "select count(m) from Mess m where 1=1";
		this.setCondition(vo, hql);
		hql += " and m.getName = '"+name+"'";
		return 0;
	}

	@Override
	public Mess queryById(Integer id) {
		String hql = "select m from Mess m where m.messId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void delMany(Integer[] ids) {
		String hql = "delete from Mess m where m.messId in (";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

}
