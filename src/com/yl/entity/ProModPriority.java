package com.yl.entity;

public class ProModPriority {
	private Integer modPriorityId;
	private String modPriorityName;
	
	public ProModPriority() {
		super();
	}

	public ProModPriority(Integer modPriorityId, String modPriorityName) {
		super();
		this.modPriorityId = modPriorityId;
		this.modPriorityName = modPriorityName;
	}

	public Integer getModPriorityId() {
		return modPriorityId;
	}

	public void setModPriorityId(Integer modPriorityId) {
		this.modPriorityId = modPriorityId;
	}

	public String getModPriorityName() {
		return modPriorityName;
	}

	public void setModPriorityName(String modPriorityName) {
		this.modPriorityName = modPriorityName;
	}
	
}
