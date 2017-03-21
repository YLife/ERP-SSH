package com.yl.entity;

import java.util.Date;

public class ProMod {
	private Integer modId;
	private String modName;
	private Emp emp;
	private Pro pro;
	private ProModPriority modPriority;
	private Date modCreateDate;
	private Date modEndDate;
	private String modRemark;
	
	public ProMod() {
		super();
	}

	public ProMod(Integer modId, String modName, Emp emp, Pro pro,
			ProModPriority modPriority, Date modCreateDate, Date modEndDate,
			String modRemark) {
		super();
		this.modId = modId;
		this.modName = modName;
		this.emp = emp;
		this.pro = pro;
		this.modPriority = modPriority;
		this.modCreateDate = modCreateDate;
		this.modEndDate = modEndDate;
		this.modRemark = modRemark;
	}

	public Integer getModId() {
		return modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Pro getPro() {
		return pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public ProModPriority getModPriority() {
		return modPriority;
	}

	public void setModPriority(ProModPriority modPriority) {
		this.modPriority = modPriority;
	}

	public Date getModCreateDate() {
		return modCreateDate;
	}

	public void setModCreateDate(Date modCreateDate) {
		this.modCreateDate = modCreateDate;
	}

	public Date getModEndDate() {
		return modEndDate;
	}

	public void setModEndDate(Date modEndDate) {
		this.modEndDate = modEndDate;
	}

	public String getModRemark() {
		return modRemark;
	}

	public void setModRemark(String modRemark) {
		this.modRemark = modRemark;
	}
	
}
