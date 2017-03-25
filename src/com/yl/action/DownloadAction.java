package com.yl.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class DownloadAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private InputStream inputStream ;
	private String fileName;
	
	public String download() throws Exception{
		fileName = new String(fileName.getBytes("iso-8859-1"),"utf-8");
		System.out.println(fileName);
		String path = ServletActionContext.getServletContext().getRealPath("/files");
		inputStream = new FileInputStream(new File(path + "/" + fileName));
		return "download";
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
