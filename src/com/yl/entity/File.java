package com.yl.entity;

import java.util.Date;

public class File {
	private Integer fileId;
	private String fileName;
	private Date uploadDate;
	private Emp emp;
	private Pro pro;
	
	public File() {
		super();
	}

	public File(Integer fileId, String fileName, Date uploadDate, Emp emp,
			Pro pro) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.uploadDate = uploadDate;
		this.emp = emp;
		this.pro = pro;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Pro getPro() {
		return pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}
	
}
