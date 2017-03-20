package com.yl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yl.dao.EmpJobDao;
import com.yl.dao.EmpRoleDao;
import com.yl.dao.EmpTypeDao;
import com.yl.dao.impl.EmpJobDaoImpl;
import com.yl.dao.impl.EmpRoleDaoImpl;
import com.yl.dao.impl.EmpTypeDaoImpl;
import com.yl.entity.EmpJob;
import com.yl.entity.EmpRole;
import com.yl.entity.EmpType;

public class EmpAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpTypeDao tdao = new EmpTypeDaoImpl();
	private EmpJobDao jdao = new EmpJobDaoImpl();
	private EmpRoleDao rdao = new EmpRoleDaoImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<EmpType> tlist = tdao.queryAll();
		List<EmpJob> jlist = jdao.queryAll();
		List<EmpRole> rlist = rdao.queryAll();
		request.setAttribute("tlist", tlist);
		request.setAttribute("jlist", jlist);
		request.setAttribute("rlist", rlist);
		request.getRequestDispatcher("empAdd.jsp").forward(request, response);
	}

}
