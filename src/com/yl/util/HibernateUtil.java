package com.yl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;
	private static ThreadLocal<Session> local = new ThreadLocal<Session>();
	
	static {
		Configuration configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
	}
	
	/**
	 * ��ȡ�Ự����
	 * @return �Ự����
	 */
	public static Session getSession(){
		Session session = local.get();
		if (session == null) {
			session = factory.openSession();
			local.set(session);
		}
		return session;
	}
	
	/**
	 * �رջỰ����
	 */
	public static void close(){
		Session session = local.get();
		if (session != null) {
			session.close();
			local.set(null);
		}
	}
}
