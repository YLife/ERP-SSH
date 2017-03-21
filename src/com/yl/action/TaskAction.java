package com.yl.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.EmpBiz;
import com.yl.biz.ProBiz;
import com.yl.biz.ProFunBiz;
import com.yl.biz.ProModBiz;
import com.yl.biz.ProPriorityBiz;
import com.yl.biz.TaskBiz;
import com.yl.entity.Emp;
import com.yl.entity.Pro;
import com.yl.entity.ProFun;
import com.yl.entity.ProMod;
import com.yl.entity.ProPriority;
import com.yl.entity.Task;
import com.yl.vo.TaskVo;

public class TaskAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private TaskBiz tbiz;
	private ProBiz pbiz;
	private ProModBiz mbiz;
	private ProFunBiz fbiz;
	private EmpBiz ebiz;
	private ProPriorityBiz ppbiz;
	private Task task;
	private Integer taskId;
	private TaskVo vo;
	private List<Task> tlist = new ArrayList<Task>();
	private List<Pro> plist = new ArrayList<Pro>();
	private List<ProMod> mlist = new ArrayList<ProMod>();
	private List<ProFun> flist = new ArrayList<ProFun>();
	private List<ProPriority> pplist = new ArrayList<ProPriority>();
	private List<Emp> elist = new ArrayList<Emp>();
	private Integer[] delid = new Integer[5];
	
	public String task(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		tlist = tbiz.findList(currentPage, pageSize, vo);
		totalPage = tbiz.getTotalPage(pageSize, vo);
		return "task";
	}
	
	public String taskData(){
		task = tbiz.findById(taskId);
		return "taskData";
	}
	
	public String taskEdit(){
		task = tbiz.findById(taskId);
		plist = pbiz.findAll();
		mlist = mbiz.findAll();
		flist = fbiz.findAll();
		elist = ebiz.findAll();
		pplist = ppbiz.findAll();
		return "taskEdit";
	}
	
	public String doTaskEdit(){
		tbiz.saveOrUpdate(task);
		return "doTaskEdit";
	}
	
	public String taskAdd(){
		plist = pbiz.findAll();
		mlist = mbiz.findAll();
		flist = fbiz.findAll();
		elist = ebiz.findAll();
		pplist = ppbiz.findAll();
		return "taskAdd";
	}
	
	public String doTaskAdd(){
		tbiz.saveOrUpdate(task);
		return "doTaskAdd";
	}
	
	public String doTaskDel(){
		tbiz.delMany(delid);
		return "doTaskDel";
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

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public TaskVo getVo() {
		return vo;
	}

	public void setVo(TaskVo vo) {
		this.vo = vo;
	}

	public List<Task> getTlist() {
		return tlist;
	}

	public void setTlist(List<Task> tlist) {
		this.tlist = tlist;
	}

	public List<Pro> getPlist() {
		return plist;
	}

	public void setPlist(List<Pro> plist) {
		this.plist = plist;
	}

	public List<ProMod> getMlist() {
		return mlist;
	}

	public void setMlist(List<ProMod> mlist) {
		this.mlist = mlist;
	}

	public List<ProFun> getFlist() {
		return flist;
	}

	public void setFlist(List<ProFun> flist) {
		this.flist = flist;
	}

	public List<ProPriority> getPplist() {
		return pplist;
	}

	public void setPplist(List<ProPriority> pplist) {
		this.pplist = pplist;
	}

	public List<Emp> getElist() {
		return elist;
	}

	public void setElist(List<Emp> elist) {
		this.elist = elist;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public void setTbiz(TaskBiz tbiz) {
		this.tbiz = tbiz;
	}

	public void setPbiz(ProBiz pbiz) {
		this.pbiz = pbiz;
	}

	public void setMbiz(ProModBiz mbiz) {
		this.mbiz = mbiz;
	}

	public void setFbiz(ProFunBiz fbiz) {
		this.fbiz = fbiz;
	}

	public void setEbiz(EmpBiz ebiz) {
		this.ebiz = ebiz;
	}

	public void setPpbiz(ProPriorityBiz ppbiz) {
		this.ppbiz = ppbiz;
	}
	
}
