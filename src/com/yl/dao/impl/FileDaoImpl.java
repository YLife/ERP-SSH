package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.FileDao;
import com.yl.entity.File;
import com.yl.vo.FileVo;

public class FileDaoImpl extends DbUtil<File> implements FileDao {

	@Override
	public List<File> queryList(Integer currentPage, Integer pageSize, FileVo vo) {
		String hql = "select f from File f left join fetch f.emp left join fetch f.pro where 1=1";
		hql = setCondition(vo, hql);
		return super.queryList(hql, currentPage, pageSize);
	}

	private String setCondition(FileVo vo, String hql) {
		if (vo != null) {
			hql += " and f.fileName like '%"+vo.getFileName()+"%'";
		}
		return hql;
	}

	@Override
	public List<File> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File queryById(Object id) {
		String hql = "select f from File f left join fetch f.emp left join fetch f.pro where f.fileId = ?";
		return super.queryById(hql, id);
	}

	@Override
	public void saveOrUpdate(File entity) {
		super.saveOrUpdate(entity);
	}

	@Override
	public void save(File entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(File entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(File entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMany(Object[] ids) {
		String hql = "delete from File f where f.fileId in (";
		for (int i = 0; i < ids.length; i++) {
			hql += ids[i] + ",";
		}
		hql = hql.substring(0, hql.lastIndexOf(","));
		hql += ")";
		super.delMany(hql);
	}

	@Override
	public int getCount(FileVo vo) {
		String hql = "select count(f) from File f left join f.emp left join f.pro where 1=1";
		this.setCondition(vo, hql);
		return super.getCount(hql);
	}

}
