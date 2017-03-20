package com.yl.entity;

import java.util.Date;

public class Client {
	private Integer clientId;
	private String clientName;
	private String clientComp;
	private String clientPhone;
	private String clientAdd;
	private String clientBack;
	private Date clientDate;
	
	public Client() {
		super();
	}

	public Client(Integer clientId, String clientName, String clientComp,
			String clientPhone, String clientAdd, String clientBack,
			Date clientDate) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientComp = clientComp;
		this.clientPhone = clientPhone;
		this.clientAdd = clientAdd;
		this.clientBack = clientBack;
		this.clientDate = clientDate;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientComp() {
		return clientComp;
	}

	public void setClientComp(String clientComp) {
		this.clientComp = clientComp;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientAdd() {
		return clientAdd;
	}

	public void setClientAdd(String clientAdd) {
		this.clientAdd = clientAdd;
	}

	public String getClientBack() {
		return clientBack;
	}

	public void setClientBack(String clientBack) {
		this.clientBack = clientBack;
	}

	public Date getClientDate() {
		return clientDate;
	}

	public void setClientDate(Date clientDate) {
		this.clientDate = clientDate;
	}
	
}
