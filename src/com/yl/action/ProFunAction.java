package com.yl.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.ProFunBiz;
import com.yl.biz.ProFunPriorityBiz;
import com.yl.biz.ProModBiz;
import com.yl.entity.ProFun;
import com.yl.entity.ProFunPriority;
import com.yl.entity.ProMod;
import com.yl.vo.ProFunPriorityVo;
import com.yl.vo.ProFunVo;

public class ProFunAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private ProFunBiz fbiz;
	private ProFunPriorityBiz pbiz;
	private ProModBiz mbiz;
	private ProFun fun;
	private Integer funId;
	private ProFunVo fvo;
	private ProFunPriorityVo pvo;
	private List<ProFun> flist = new ArrayList<ProFun>();
	private List<ProFunPriority> plist = new ArrayList<ProFunPriority>();
	private List<ProMod> mlist = new ArrayList<ProMod>();
	private Integer[] delid = new Integer[5];
	
	public String fun(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		flist = fbiz.findList(currentPage, pageSize, fvo);
		totalPage = fbiz.getTotalPage(pageSize, fvo);
		return "fun";
	}
	
	public String funData(){
		fun = fbiz.findById(funId);
		return "funData";
	}
	
	public String funEdit(){
		plist = pbiz.findAll();
		mlist = mbiz.findAll();
		fun = fbiz.findById(funId);
		return "funEdit";
	}
	
	public String doFunEdit(){
		Date date = new Date();
		fun.setFunCreateDate(date);
		fbiz.saveOrUpdate(fun);
		return "doFunEdit";
	}
	
	public String funAdd(){
		plist = pbiz.findAll();
		mlist = mbiz.findAll();
		return "funAdd";
	}
	
	public String doFunAdd(){
		Date date = new Date();
		fun.setFunCreateDate(date);
		fbiz.saveOrUpdate(fun);
		return "doFunAdd";
	}
	
	public String doFunDel(){
		fbiz.delMany(delid);
		return "doFunDel";
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

	public ProFun getFun() {
		return fun;
	}

	public void setFun(ProFun fun) {
		this.fun = fun;
	}

	public Integer getFunId() {
		return funId;
	}

	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public ProFunVo getFvo() {
		return fvo;
	}

	public void setFvo(ProFunVo fvo) {
		this.fvo = fvo;
	}

	public ProFunPriorityVo getPvo() {
		return pvo;
	}

	public void setPvo(ProFunPriorityVo pvo) {
		this.pvo = pvo;
	}

	public List<ProFun> getFlist() {
		return flist;
	}

	public void setFlist(List<ProFun> flist) {
		this.flist = flist;
	}

	public List<ProFunPriority> getPlist() {
		return plist;
	}

	public void setPlist(List<ProFunPriority> plist) {
		this.plist = plist;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public void setFbiz(ProFunBiz fbiz) {
		this.fbiz = fbiz;
	}

	public void setPbiz(ProFunPriorityBiz pbiz) {
		this.pbiz = pbiz;
	}

	public List<ProMod> getMlist() {
		return mlist;
	}

	public void setMlist(List<ProMod> mlist) {
		this.mlist = mlist;
	}

	public void setMbiz(ProModBiz mbiz) {
		this.mbiz = mbiz;
	}
	
}
