package com.yl.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.ProBiz;
import com.yl.biz.ProModBiz;
import com.yl.biz.ProModPriorityBiz;
import com.yl.entity.Pro;
import com.yl.entity.ProMod;
import com.yl.entity.ProModPriority;
import com.yl.vo.ProModPriorityVo;
import com.yl.vo.ProModVo;

public class ProModAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private ProModBiz mbiz;
	private ProModPriorityBiz pbiz;
	private ProBiz biz;
	private Integer modId;
	private ProMod mod;
	private ProModVo mvo;
	private ProModPriorityVo pvo;
	private List<ProMod> mlist = new ArrayList<ProMod>();
	private List<ProModPriority> plist = new ArrayList<ProModPriority>();
	private List<Pro> list = new ArrayList<Pro>();
	private Integer[] delid = new Integer[5];
	
	public String mod(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		mlist = mbiz.findList(currentPage, pageSize, mvo);
		totalPage = mbiz.getTotalPage(pageSize, mvo);
		return "mod";
	}
	
	public String modData(){
		mod = mbiz.findById(modId);
		return "modData";
	}
	
	public String modEdit(){
		mod = mbiz.findById(modId);
		list = biz.findAll();
		plist = pbiz.findAll();
		return "modEdit";
	}

	public String doModEdit(){
		Date date = new Date();
		mod.setModCreateDate(date);
		mbiz.saveOrUpdate(mod);
		return "doModEdit";
	}
	
	public String modAdd(){
		list = biz.findAll();
		plist = pbiz.findAll();
		return "modAdd";
	}
	
	public String doModAdd(){
		Date date = new Date();
		mod.setModCreateDate(date);
		mbiz.saveOrUpdate(mod);
		return "doModAdd";
	}
	
	public String doModDel(){
		mbiz.delMany(delid);
		return "doModDel";
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

	public Integer getModId() {
		return modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	public ProMod getMod() {
		return mod;
	}

	public void setMod(ProMod mod) {
		this.mod = mod;
	}

	public ProModVo getMvo() {
		return mvo;
	}

	public void setMvo(ProModVo mvo) {
		this.mvo = mvo;
	}

	public ProModPriorityVo getPvo() {
		return pvo;
	}

	public void setPvo(ProModPriorityVo pvo) {
		this.pvo = pvo;
	}

	public List<ProMod> getMlist() {
		return mlist;
	}

	public void setMlist(List<ProMod> mlist) {
		this.mlist = mlist;
	}

	public List<ProModPriority> getPlist() {
		return plist;
	}

	public void setPlist(List<ProModPriority> plist) {
		this.plist = plist;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public void setMbiz(ProModBiz mbiz) {
		this.mbiz = mbiz;
	}

	public void setPbiz(ProModPriorityBiz pbiz) {
		this.pbiz = pbiz;
	}

	public List<Pro> getList() {
		return list;
	}

	public void setList(List<Pro> list) {
		this.list = list;
	}

	public void setBiz(ProBiz biz) {
		this.biz = biz;
	}
	
}
