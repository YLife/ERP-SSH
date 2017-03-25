package com.yl.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.yl.biz.EmpBiz;
import com.yl.entity.Emp;

public class CheckAction {
	
	private EmpBiz biz;
	private Emp emp;
	private Integer id;
	private String pwd;
	private String validate;
	private String code;
	
	public String check(){
		emp = biz.findById(id);
		if (emp != null) {
			if (pwd.equals(emp.getEmpPwd())) {
				HttpSession session = ServletActionContext.getRequest().getSession();
				code = (String) session.getAttribute("code");
				if (code != null && code.equalsIgnoreCase(validate)) {
					session.removeAttribute("code");
					session.setAttribute("id", id);
					session.setAttribute("name", emp.getEmpName());
					session.setAttribute("roleName", emp.getEmpRole().getRoleName());
					return "checked";
				}
				return "false";
			}
			return "false";
		}
		return "false";
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}

	public void setBiz(EmpBiz biz) {
		this.biz = biz;
	}
	
}


