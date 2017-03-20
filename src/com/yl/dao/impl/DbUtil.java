package com.yl.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * ��������Դ����ץȡ���ͷ�
 * @author Mr.Yang
 *
 * @param <E>
 */
public class DbUtil<E> extends HibernateDaoSupport {
	
	/**
	 * ��ҳ��ѯ
	 * @param hql ��ѯ���
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @return ʵ����󼯺�
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
	 * ��ѯ���м�¼
	 * @param hql ��ѯ���
	 * @return ʵ����󼯺�
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
	 * ͨ����Ų�ѯ��¼
	 * @param hql ��ѯ���
	 * @param id ���
	 * @return ʵ�����
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
	 * ��ѯ��¼������
	 * @param hql ��ѯ���
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
	 * ���¼�¼
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
	 * ��Ӽ�¼
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
	 * ���¼�¼
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
	 * ɾ��ָ��ʵ�����
	 * @param entity ʵ�����
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
	 * ���ݱ��ɾ����¼
	 * @param hql ��ѯ���
	 * @param id ���
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
	 * ɾ��ָ���ı�ŵļ�¼
	 * @param hql ��ѯ���
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
