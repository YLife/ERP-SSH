package com.yl.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.EmpBiz;
import com.yl.biz.MessBiz;
import com.yl.entity.Emp;
import com.yl.entity.Mess;
import com.yl.vo.MessVo;

public class MessAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private MessBiz mbiz;
	private EmpBiz ebiz;
	private MessVo vo;
	private Mess mess;
	private Integer messId;
	private String name;
	private List<Emp> elist = new ArrayList<Emp>();
	private List<Mess> mlist = new ArrayList<Mess>();
	private Integer[] delid = new Integer[5];
	
	public String mess(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		name = (String) session.getAttribute("name");
		mlist = mbiz.queryByName(currentPage, pageSize, vo, name);
		totalPage = mbiz.getCountByName(vo, name, pageSize);
		return "mess";
	}
	
	public String messData(){
		mess = mbiz.queryById(messId);
		return "messData";
	}
	
	public String messAdd(){
		elist = ebiz.findAll();
		return "messAdd";
	}
	
	public String doMessAdd(){
		Date date = new Date();
		HttpSession session = ServletActionContext.getRequest().getSession();
		name = (String) session.getAttribute("name");
		mess.setSendName(name);
		mess.setSendDate(date);
		mess.setGetDate(date);
		mbiz.save(mess);
		return "doMessAdd";
	}
	
	public String doMessDel(){
		mbiz.delMany(delid);
		return "doMessDel";
	}
	
	public String messSend(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		name = (String) session.getAttribute("name");
		mlist = mbiz.querySendMess(currentPage, pageSize, vo, name);
		totalPage = mbiz.getCountBySendName(vo, name, pageSize);
		return "messSend";
	}
	
	public String messGet(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		name = (String) session.getAttribute("name");
		mlist = mbiz.queryGetMess(currentPage, pageSize, vo, name);
		totalPage = mbiz.getCountByGetName(vo, name, pageSize);
		return "messGet";
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

	public MessVo getVo() {
		return vo;
	}

	public void setVo(MessVo vo) {
		this.vo = vo;
	}

	public Mess getMess() {
		return mess;
	}

	public void setMess(Mess mess) {
		this.mess = mess;
	}

	public Integer getMessId() {
		return messId;
	}

	public void setMessId(Integer messId) {
		this.messId = messId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp> getElist() {
		return elist;
	}

	public void setElist(List<Emp> elist) {
		this.elist = elist;
	}

	public List<Mess> getMlist() {
		return mlist;
	}

	public void setMlist(List<Mess> mlist) {
		this.mlist = mlist;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public void setMbiz(MessBiz mbiz) {
		this.mbiz = mbiz;
	}

	public void setEbiz(EmpBiz ebiz) {
		this.ebiz = ebiz;
	}
	
	
}
