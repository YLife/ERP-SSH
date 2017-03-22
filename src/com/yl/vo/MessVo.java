package com.yl.vo;

import java.util.Date;

public class MessVo {
	private Date begin;
	private Date end;
	
	public MessVo() {
		super();
	}

	public MessVo(Date begin, Date end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
}
