package com.yl.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 对数据资源进行抓取、释放
 * @author Mr.Yang
 *
 * @param <E>
 */
public class DbUtil<E> extends HibernateDaoSupport {
	
	/**
	 * 分页查询
	 * @param hql 查询语句
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @return 实体对象集合
	 */
	@SuppressWarnings("unchecked")
	public List<E> queryList(final String hql , final Integer currentPage , final Integer pageSize){
		return this.getHibernateTemplate().executeFind(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery(hql);
				query.setFirstResult((currentPage - 1) * pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
	
	/**
	 * 查询所有记录
	 * @param hql 查询语句
	 * @return 实体对象集合
	 */
	@SuppressWarnings("unchecked")
	public List<E> queryAll(final String hql){
		return this.getHibernateTemplate().executeFind(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				return query.list();
			}
		});
	}
	
	/**
	 * 通过编号查询记录
	 * @param hql 查询语句
	 * @param id 编号
	 * @return 实体对象
	 */
	@SuppressWarnings("unchecked")
	public E queryById(final String hql , final Object id){
		return (E) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setParameter(0, id);
				return query.uniqueResult();
			}
		});
	}
	
	/**
	 * 查询记录总条数
	 * @param hql 查询语句
	 * @return
	 */
	public int getCount(final String hql){
		return this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				return ((Long) query.uniqueResult()).intValue();
			}
		});
	}
	
	/**
	 * 更新记录
	 * @param entity
	 */
	public void saveOrUpdate(E entity){
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().saveOrUpdate(entity);
	}
	
	/**
	 * 添加记录
	 * @param entity
	 */
	public void save(E entity){
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().save(entity);
	}
	
	/**
	 * 更新记录
	 * @param entity
	 */
	public void update(E entity){
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().update(entity);
	}
	
	/**
	 * 删除指定实体对象
	 * @param entity 实体对象
	 */
	public void remove(E entity){
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().delete(entity);
	}
	
	/**
	 * 根据编号删除记录
	 * @param hql 查询语句
	 * @param id 编号
	 */
	public void del(final String hql , final Object id){
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setParameter(0, id);
				return query.executeUpdate();
			}
		});
	}
	
	/**
	 * 删除指定的编号的记录
	 * @param hql 查询语句
	 */
	public void delMany(final String hql){
		/*Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateUtil.close();*/
		this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				return query.executeUpdate();
			}
		});
	}
}
