package com.yl.action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.FileBiz;
import com.yl.biz.ProBiz;
import com.yl.entity.Emp;
import com.yl.entity.File;
import com.yl.entity.Pro;
import com.yl.vo.FileVo;

public class FileAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private java.io.File upload;
	private String uploadFileName;
	private String fileName;
	private ProBiz pbiz;
	private FileBiz fbiz;
	private FileVo vo;
	private File file;
	private List<File> flist = new ArrayList<File>();
	private List<Pro> plist = new ArrayList<Pro>();
	private Integer[] delid = new Integer[5];
	
	public String file(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		flist = fbiz.findList(currentPage, pageSize, vo);
		totalPage = fbiz.getTotalPage(pageSize, vo);
		return "file";
	}
	
	public String fileUpload(){
		plist = pbiz.findAll();
		return "fileUpload";
	}
	
	public String doFileUpload() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String path = request.getServletContext().getRealPath("/files");
		InputStream in = new FileInputStream(upload);
		OutputStream out= new FileOutputStream(path + "/" + uploadFileName);
		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
			out.flush();
		}
		out.close();
		in.close();
		Integer id = (Integer) ServletActionContext.getRequest().getSession().getAttribute("id");
		Emp emp = new Emp();
		Date date = new Date();
		emp.setEmpId(id);
		file.setUploadDate(date);
		file.setEmp(emp);
		file.setFileName(uploadFileName);
		fbiz.saveOrUpdate(file);
 		return "doFileUpload";
	}
	
	public String fileDel(){
		fbiz.delMany(delid);
		return "fileDel";
	}

	public Integer getJumpPage() {
		return jumpPage;
	}

	public void setJumpPage(Integer jumpPage) {
		this.jumpPage = jumpPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public FileVo getVo() {
		return vo;
	}

	public void setVo(FileVo vo) {
		this.vo = vo;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<File> getFlist() {
		return flist;
	}

	public void setFlist(List<File> flist) {
		this.flist = flist;
	}

	public List<Pro> getPlist() {
		return plist;
	}

	public void setPlist(List<Pro> plist) {
		this.plist = plist;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public void setPbiz(ProBiz pbiz) {
		this.pbiz = pbiz;
	}

	public void setFbiz(FileBiz fbiz) {
		this.fbiz = fbiz;
	}

	public java.io.File getUpload() {
		return upload;
	}

	public void setUpload(java.io.File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
