package com.yl.entity;

public class ProPriority {
	private Integer priorityId;
	private String priorityName;
	
	public ProPriority() {
		super();
	}

	public ProPriority(Integer priorityId, String priorityName) {
		super();
		this.priorityId = priorityId;
		this.priorityName = priorityName;
	}

	public Integer getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}
	
}
