package com.yl.entity;

import java.util.Date;

public class EmpSalType {
	private Integer salTypeId;
	private String salTypeName;
	private String salTypeAccount;
	private String salTypeRemark;
	private Date salTypeDate;
	private String salTypeState;
	private String salTypePriority;
	
	public EmpSalType() {
		super();
	}

	public EmpSalType(Integer salTypeId, String salTypeName,
			String salTypeAccount, String salTypeRemark, Date salTypeDate,
			String salTypeState, String salTypePriority) {
		super();
		this.salTypeId = salTypeId;
		this.salTypeName = salTypeName;
		this.salTypeAccount = salTypeAccount;
		this.salTypeRemark = salTypeRemark;
		this.salTypeDate = salTypeDate;
		this.salTypeState = salTypeState;
		this.salTypePriority = salTypePriority;
	}

	public Integer getSalTypeId() {
		return salTypeId;
	}

	public void setSalTypeId(Integer salTypeId) {
		this.salTypeId = salTypeId;
	}

	public String getSalTypeName() {
		return salTypeName;
	}

	public void setSalTypeName(String salTypeName) {
		this.salTypeName = salTypeName;
	}

	public String getSalTypeAccount() {
		return salTypeAccount;
	}

	public void setSalTypeAccount(String salTypeAccount) {
		this.salTypeAccount = salTypeAccount;
	}

	public String getSalTypeRemark() {
		return salTypeRemark;
	}

	public void setSalTypeRemark(String salTypeRemark) {
		this.salTypeRemark = salTypeRemark;
	}

	public String getSalTypeState() {
		return salTypeState;
	}

	public void setSalTypeState(String salTypeState) {
		this.salTypeState = salTypeState;
	}

	public String getSalTypePriority() {
		return salTypePriority;
	}

	public void setSalTypePriority(String salTypePriority) {
		this.salTypePriority = salTypePriority;
	}

	public Date getSalTypeDate() {
		return salTypeDate;
	}

	public void setSalTypeDate(Date salTypeDate) {
		this.salTypeDate = salTypeDate;
	}
	
}
