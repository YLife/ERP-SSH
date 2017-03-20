package com.yl.entity;

import java.util.Date;

public class EmpSal {
	
	private Integer salId;
	private Double baseSal;
	private Double bonus;
	private Double fine;
	private Double other;
	private String salType;
	private Date salDate;
	private String remark;
	private Emp emp;
	private EmpSalState salState;
	
	public EmpSal() {
		super();
	}

	public EmpSal(Integer salId, Double baseSal, Double bonus, Double fine,
			Double other, String salType, Date salDate, String remark, Emp emp,
			EmpSalState salState) {
		super();
		this.salId = salId;
		this.baseSal = baseSal;
		this.bonus = bonus;
		this.fine = fine;
		this.other = other;
		this.salType = salType;
		this.salDate = salDate;
		this.remark = remark;
		this.emp = emp;
		this.salState = salState;
	}

	public Integer getSalId() {
		return salId;
	}

	public void setSalId(Integer salId) {
		this.salId = salId;
	}

	public Double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(Double baseSal) {
		this.baseSal = baseSal;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

	public Double getOther() {
		return other;
	}

	public void setOther(Double other) {
		this.other = other;
	}

	public String getSalType() {
		return salType;
	}

	public void setSalType(String salType) {
		this.salType = salType;
	}

	public Date getSalDate() {
		return salDate;
	}

	public void setSalDate(Date salDate) {
		this.salDate = salDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public EmpSalState getSalState() {
		return salState;
	}

	public void setSalState(EmpSalState salState) {
		this.salState = salState;
	}

}
