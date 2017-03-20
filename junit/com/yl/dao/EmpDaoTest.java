package com.yl.dao;


import java.util.Calendar;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yl.entity.Emp;
import com.yl.entity.EmpJob;
import com.yl.entity.EmpRole;
import com.yl.entity.EmpSal;
import com.yl.entity.EmpType;
import com.yl.vo.EmpVo;

public class EmpDaoTest {
	
	private static  EmpDao dao;
	private static  EmpSalDao sdao;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void init(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		dao = (EmpDao) factory.getBean("empDao");
		sdao = (EmpSalDao) factory.getBean("empSalDao");
	}
	
	@Test
	public void testQueryListIntegerIntegerEmpVo() {
		EmpVo vo = new EmpVo();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2002, 01, 01);
		vo.setBegin(calendar.getTime());
		List<Emp> list = dao.queryList(0, 5, vo);
		for (Emp emp : list) {
			System.out.println(emp.getEmpName() + ":" + emp.getEmpRole().getRoleName());
		}
 	}
	
	@Test
	public void testQueryById(){
		Emp emp = dao.queryById(Integer.valueOf(100));
		System.out.println(emp.getEmpName() + ":" + emp.getEmpRole().getRoleName() );
	}
	
	@Test
	public void testGetCount(){
		int count = dao.getCount(null);
		System.out.println(count);
	}
	
	@Test
	public void testDelete(){
		dao.del(Integer.valueOf(107));
		/*Emp emp = dao.queryById(Integer.valueOf(119));
		System.out.println(emp.getEmpSal().getBonus());*/
	}
	
	@Test
	public void testSave(){
		Emp emp = new Emp();
		EmpSal sal = new EmpSal();
		EmpType type = new EmpType();
		EmpJob job = new EmpJob();
		EmpRole role = new EmpRole();
		type.setTypeId(1);
		job.setJobId(1);
		role.setRoleId(1);
		emp.setEmpType(type);
		emp.setEmpJob(job);
		emp.setEmpRole(role);
		sal.setEmp(emp);
		dao.saveOrUpdate(emp);
		sdao.saveOrUpdate(sal);
	}
	
	@Test
	public void testRemove(){
		Emp emp = dao.queryById(120);
		dao.remove(emp);
	}
	
	@Test
	public void testUpdate(){
		Emp emp = new Emp();
		emp.setEmpId(119);
		EmpSal sal = new EmpSal();
		sal.setSalId(11);
		sal.setBaseSal(20000.0);
		sal.setEmp(emp);
		sdao.saveOrUpdate(sal);
	}
	
	@Test
	public void testEdit(){
		Emp emp = new Emp();
		EmpSal sal = new EmpSal();
		EmpType type = new EmpType();
		EmpJob job = new EmpJob();
		EmpRole role = new EmpRole();
		sal.setSalId(17);
		emp.setEmpId(127);
		type.setTypeId(1);
		job.setJobId(1);
		role.setRoleId(1);
		emp.setEmpType(type);
		emp.setEmpJob(job);
		emp.setEmpRole(role);
		sal.setEmp(emp);
		/*sal.setBaseSal(Double.valueOf(2000));*/
		sdao.saveOrUpdate(sal);
	}
	
}
