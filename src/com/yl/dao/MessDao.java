package com.yl.dao;

import java.util.List;

import com.yl.entity.Mess;
import com.yl.vo.MessVo;

public interface MessDao {
	
	/**
	 * 根据员工姓名查询信息
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @param vo 条件信息
	 * @return 信息对象集合
	 */
	List<Mess> queryByName(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * 查询发件箱
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @param vo 条件信息
	 * @param name 员工姓名
	 * @return 发件信息对象集合
	 */
	List<Mess> querySendMess(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * 查询收件箱
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @param vo 条件信息
	 * @param name 员工姓名
	 * @return 收件信息对象集合
	 */
	List<Mess> queryGetMess(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * 查询总记录条数
	 * @param vo 条件信息
	 * @param name 姓名
	 * @return 总条数集合
	 */
	int getCountByName(MessVo vo , String name);
	
	/**
	 * 查询发件箱总记录条数
	 * @param vo 条件信息
	 * @param name 姓名
	 * @return 发件箱总条数集合
	 */
	int getCountBySendName(MessVo vo , String name);
	
	/**
	 * 查询收件箱总记录条数
	 * @param vo 条件信息
	 * @param name 姓名
	 * @return 收件箱总条数集合
	 */
	int getCountByGetName(MessVo vo , String name);
	
	/**
	 * 通过id查询记录
	 * @param id 编号
	 * @return 信息实体对象
	 */
	Mess queryById(Integer id);
	
	/**
	 * 添加信息
	 * @param mess 信息实体对象
	 */
	void save(Mess mess);
	
	/**
	 * 删除指定编号的信息记录
	 * @param ids 编号
	 */
	void delMany(Integer[] ids);
	
	
}
