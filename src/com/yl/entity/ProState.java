package com.yl.entity;

public class ProState {
	private Integer proStateId;
	private String proStateName;
	
	public ProState() {
		super();
	}

	public ProState(Integer proStateId, String proStateName) {
		super();
		this.proStateId = proStateId;
		this.proStateName = proStateName;
	}

	public Integer getProStateId() {
		return proStateId;
	}

	public void setProStateId(Integer proStateId) {
		this.proStateId = proStateId;
	}

	public String getProStateName() {
		return proStateName;
	}

	public void setProStateName(String proStateName) {
		this.proStateName = proStateName;
	}
	
}
