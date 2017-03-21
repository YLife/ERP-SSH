package com.yl.entity;

import java.util.Date;

public class Task {
	private Integer taskId;
	private String taskName;
	private Pro pro;
	private ProMod mod;
	private ProFun fun;
	private Emp emp;
	private ProPriority priority;
	private Date taskCreateDate;
	private Date taskEndDate;
	private String taskNote;
	
	public Task() {
		super();
	}

	public Task(Integer taskId, String taskName, Pro pro, ProMod mod,
			ProFun fun, Emp emp, ProPriority priority, Date taskCreateDate,
			Date taskEndDate, String taskNote) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.pro = pro;
		this.mod = mod;
		this.fun = fun;
		this.emp = emp;
		this.priority = priority;
		this.taskCreateDate = taskCreateDate;
		this.taskEndDate = taskEndDate;
		this.taskNote = taskNote;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Pro getPro() {
		return pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public ProMod getMod() {
		return mod;
	}

	public void setMod(ProMod mod) {
		this.mod = mod;
	}

	public ProFun getFun() {
		return fun;
	}

	public void setFun(ProFun fun) {
		this.fun = fun;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public ProPriority getPriority() {
		return priority;
	}

	public void setPriority(ProPriority priority) {
		this.priority = priority;
	}

	public Date getTaskCreateDate() {
		return taskCreateDate;
	}

	public void setTaskCreateDate(Date taskCreateDate) {
		this.taskCreateDate = taskCreateDate;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public String getTaskNote() {
		return taskNote;
	}

	public void setTaskNote(String taskNote) {
		this.taskNote = taskNote;
	}
	
}	
