package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.FileBiz;
import com.yl.dao.FileDao;
import com.yl.entity.File;
import com.yl.vo.FileVo;

public class FileBizImpl implements FileBiz {
	private FileDao dao;
	@Override
	public List<File> findList(Integer currentPage, Integer pageSize, FileVo vo) {
		return dao.queryList(currentPage, pageSize, vo);
	}

	@Override
	public List<File> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File findById(Object id) {
		return dao.queryById(id);
	}

	@Override
	public void saveOrUpdate(File entity) {
		dao.saveOrUpdate(entity);
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
		dao.delMany(ids);
	}

	@Override
	public int getTotalPage(Integer pageSize, FileVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

	public void setDao(FileDao dao) {
		this.dao = dao;
	}
	
}
