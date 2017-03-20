package com.yl.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.entity.EmpSalType;

public class EmpSalTypeDaoTest {
	private static EmpSalTypeDao dao ;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void init(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		dao = (EmpSalTypeDao) factory.getBean("empSalTypeDao");
	}
	
	@Test
	public void test() {
		List<EmpSalType> list = dao.queryList(1, 5, null);
		for (EmpSalType type : list) {
			System.out.println(type);
		}
	}

}
