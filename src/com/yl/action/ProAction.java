package com.yl.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.ProBiz;
import com.yl.biz.ProPriorityBiz;
import com.yl.biz.ProStateBiz;
import com.yl.entity.Pro;
import com.yl.entity.ProPriority;
import com.yl.entity.ProState;
import com.yl.vo.ProVo;

public class ProAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private ProBiz biz;
	private ProPriorityBiz pbiz;
	private ProStateBiz sbiz;
	private Pro pro;
	private ProVo vo;
	private Integer proId;
	private List<Pro> list = new ArrayList<Pro>();
	private List<ProPriority> plist = new ArrayList<ProPriority>();
	private List<ProState> slist = new ArrayList<ProState>();
	private Integer[] delid = new Integer[5];
	
	public String pro(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		list = biz.findList(currentPage, pageSize, vo);
		totalPage = biz.getTotalPage(pageSize, vo);
		return "pro";
	}
	
	public String proData(){
		pro = biz.findById(proId);
		return "proData";
	}
	
	public String proEdit(){
		plist = pbiz.findAll();
		slist = sbiz.findAll();
		pro = biz.findById(proId);
		return "proEdit";
	}
	
	public String doProEdit(){
		biz.saveOrUpdate(pro);
		return "doProEdit";
	}
	
	public String proAdd(){
		plist = pbiz.findAll();
		slist = sbiz.findAll();
		return "proAdd";
	}
	
	public String doProAdd(){
		biz.saveOrUpdate(pro);
		return "doProAdd";
	}
	
	public String doProDel(){
		biz.delMany(delid);
		return "doProDel";
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

	public void setBiz(ProBiz biz) {
		this.biz = biz;
	}

	public Pro getPro() {
		return pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public ProVo getVo() {
		return vo;
	}

	public void setVo(ProVo vo) {
		this.vo = vo;
	}

	public List<Pro> getList() {
		return list;
	}

	public void setList(List<Pro> list) {
		this.list = list;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public List<ProPriority> getPlist() {
		return plist;
	}

	public void setPlist(List<ProPriority> plist) {
		this.plist = plist;
	}

	public List<ProState> getSlist() {
		return slist;
	}

	public void setSlist(List<ProState> slist) {
		this.slist = slist;
	}

	public void setPbiz(ProPriorityBiz pbiz) {
		this.pbiz = pbiz;
	}

	public void setSbiz(ProStateBiz sbiz) {
		this.sbiz = sbiz;
	}
	
}
