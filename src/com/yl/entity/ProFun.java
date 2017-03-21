package com.yl.entity;

import java.util.Date;

public class ProFun {
	private Integer funId;
	private String funName;
	private ProMod mod;
	private Emp emp;
	private ProFunPriority funPriority;
	private Date funCreateDate;
	private String funRemark;
	
	public ProFun() {
		super();
	}

	public ProFun(Integer funId, String funName, ProMod mod, Emp emp,
			ProFunPriority funPriority, Date funCreateDate, String funRemark) {
		super();
		this.funId = funId;
		this.funName = funName;
		this.mod = mod;
		this.emp = emp;
		this.funPriority = funPriority;
		this.funCreateDate = funCreateDate;
		this.funRemark = funRemark;
	}

	public Integer getFunId() {
		return funId;
	}

	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public ProMod getMod() {
		return mod;
	}

	public void setMod(ProMod mod) {
		this.mod = mod;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public ProFunPriority getFunPriority() {
		return funPriority;
	}

	public void setFunPriority(ProFunPriority funPriority) {
		this.funPriority = funPriority;
	}

	public Date getFunCreateDate() {
		return funCreateDate;
	}

	public void setFunCreateDate(Date funCreateDate) {
		this.funCreateDate = funCreateDate;
	}

	public String getFunRemark() {
		return funRemark;
	}

	public void setFunRemark(String funRemark) {
		this.funRemark = funRemark;
	}
	
}
