package com.yl.entity;

public class ProFunPriority {
	private Integer funPriorityId;
	private String funPriorityName;
	
	public ProFunPriority() {
		super();
	}

	public ProFunPriority(Integer funPriorityId, String funPriorityName) {
		super();
		this.funPriorityId = funPriorityId;
		this.funPriorityName = funPriorityName;
	}

	public Integer getFunPriorityId() {
		return funPriorityId;
	}

	public void setFunPriorityId(Integer funPriorityId) {
		this.funPriorityId = funPriorityId;
	}

	public String getFunPriorityName() {
		return funPriorityName;
	}

	public void setFunPriorityName(String funPriorityName) {
		this.funPriorityName = funPriorityName;
	}
	
}
