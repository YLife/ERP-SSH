package com.yl.entity;

public class EmpSalState {
	private Integer salStateId;
	private String salState;
	
	public EmpSalState() {
		super();
	}

	public EmpSalState(Integer salStateId, String salState) {
		super();
		this.salStateId = salStateId;
		this.salState = salState;
	}

	public Integer getSalStateId() {
		return salStateId;
	}

	public void setSalStateId(Integer salStateId) {
		this.salStateId = salStateId;
	}

	public String getSalState() {
		return salState;
	}

	public void setSalState(String salState) {
		this.salState = salState;
	}

}
