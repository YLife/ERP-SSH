package com.yl.dao;


import java.util.List;

import org.junit.Test;

import com.yl.dao.impl.EmpDaoImpl;
import com.yl.dao.impl.EmpSalDaoImpl;
import com.yl.entity.Emp;
import com.yl.entity.EmpSal;

public class EmpSalDaoTest {
	private EmpSalDao dao = new EmpSalDaoImpl();
	private EmpDao edao = new EmpDaoImpl();
	
	@Test
	public void testQueryById() {
		EmpSal sal = dao.queryById(100);
		System.out.println(sal.getBaseSal());
	}
	
	@Test
	public void testQueryAll(){
		List<EmpSal> list = dao.queryAll();
		for (EmpSal empSal : list) {
			System.out.println(empSal.getEmp().getEmpName());
		}
	}
	
	@Test
	public void testSave(){
		Emp emp = edao.queryById(Integer.valueOf(119));
		emp.setEmpName("caoo");
		EmpSal sal = new EmpSal();
		sal.setEmp(emp);
		sal.setBonus(Double.valueOf(20000));
		edao.saveOrUpdate(emp);
		dao.saveOrUpdate(sal);
	}

}
