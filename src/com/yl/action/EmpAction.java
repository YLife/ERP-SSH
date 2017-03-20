package com.yl.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.EmpBiz;
import com.yl.biz.EmpJobBiz;
import com.yl.biz.EmpRoleBiz;
import com.yl.biz.EmpSalBiz;
import com.yl.biz.EmpSalStateBiz;
import com.yl.biz.EmpSalTypeBiz;
import com.yl.biz.EmpTypeBiz;
import com.yl.entity.Emp;
import com.yl.entity.EmpJob;
import com.yl.entity.EmpRole;
import com.yl.entity.EmpSal;
import com.yl.entity.EmpSalState;
import com.yl.entity.EmpSalType;
import com.yl.entity.EmpType;
import com.yl.vo.EmpJobVo;
import com.yl.vo.EmpSalTypeVo;
import com.yl.vo.EmpSalVo;
import com.yl.vo.EmpVo;

public class EmpAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private EmpSalTypeBiz biz;
	private EmpBiz ebiz;
	private	EmpTypeBiz tbiz;
	private EmpJobBiz jbiz;
	private EmpRoleBiz rbiz;
	private EmpSalBiz sbiz;
	private EmpSalStateBiz ssbiz;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private Integer empId;
	private Integer jobId;
	private Integer salId;
	private Integer salTypeId;
	private EmpVo vo;
	private EmpSalTypeVo tvo;
	private EmpJobVo jvo;
	private EmpSalVo svo;
	private Emp emp;
	private EmpSal empSal;
	private EmpType empType;
	private EmpJob empJob;
	private EmpRole empRole;
	private EmpSalType empSalType;
	private Integer[] delid = new Integer[5];
	private List<Emp> elist = new ArrayList<Emp>();
	private List<EmpType> tlist = new ArrayList<EmpType>();
	private List<EmpJob> jlist = new ArrayList<EmpJob>();
	private List<EmpRole> rlist = new ArrayList<EmpRole>();
	private List<EmpSal> slist = new ArrayList<EmpSal>();
	private List<EmpSalType> stlist = new ArrayList<EmpSalType>();
	
	public String queryEmps(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		elist = ebiz.findList(currentPage, pageSize, vo);
		totalPage = ebiz.getTotalPage(pageSize, vo);
		return "emp";
	}
	
	public String empAdd(){
		tlist = tbiz.findAll();
		jlist = jbiz.findAll();
		rlist = rbiz.findAll();
		return "empAdd";
	}
	
	public String doEmpAdd(){
		emp.setEmpType(empType);
		emp.setEmpJob(empJob);
		emp.setEmpRole(empRole);
		empSal.setEmp(emp);
		empSal.setSalState(ssbiz.findById(2));
		ebiz.saveOrUpdate(emp);
		sbiz.saveOrUpdate(empSal);
		return "doEmpAdd";
	}
	
	public String empEdit(){
		emp = ebiz.findById(empId);
		tlist = tbiz.findAll();
		jlist = jbiz.findAll();
		rlist = rbiz.findAll();
		return "empEdit";
	}
	
	public String doEmpEdit(){
		empSal.setEmp(emp);
		sbiz.saveOrUpdate(empSal);
		return "doEmpEdit";
	}
	
	public String empDel(){
		sbiz.delMany(delid);
		ebiz.delMany(delid);
		return "empDel";
	}
	
	public String empJob(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		jlist = jbiz.findList(currentPage, pageSize, jvo);
		totalPage = jbiz.getTotalPage(pageSize, jvo);
		return "empJob";
	}
	
	public String empJobData(){
		empJob = jbiz.findById(jobId);
		return "empJobData";
	}
	
	public String empJobDel(){
		jbiz.delMany(delid);
		return "empJobDel";
	}
	
	public String empWorkCase(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		slist = sbiz.findList(currentPage, pageSize, svo);
		totalPage = sbiz.getTotalPage(pageSize, svo);
		return "empWorkCase";
	}
	
	public String empWorkCaseData(){
		empSal = sbiz.findById(salId);
		return "empWorkCaseData";
	}
	
	public String empSalSend(){
		empSal = sbiz.findById(salId);
		return "empSalSend";
	}
	
	public String doEmpSalSend(){
		EmpSalState salState = new EmpSalState();
		salState.setSalStateId(1);
		String salType = empSal.getSalType();
		empSal = sbiz.findById(salId);
		empSal.setSalType(salType);
		empSal.setSalState(salState);
		sbiz.saveOrUpdate(empSal);
		return "doEmpSalSend";
	}
	
	public String empData(){
		emp = ebiz.findById(empId);//´ý²¹³ä
		return "empData";
	}
	
	public String doEmpRegister(){
		Date date = new Date();
		emp.setEmpDate(date);
		sbiz.saveOrUpdate(empSal);
		return "doEmpRegister";
	}
	
	public String doEmpJobAdd(){
		jbiz.saveOrUpdate(empJob);
		return "doEmpJobAdd";
	}
	
	public String empSalType(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		stlist = biz.findList(currentPage, pageSize, tvo);
		System.out.println(stlist.size());
		totalPage = biz.getTotalPage(pageSize, tvo);
		return "empSalType";
	}
	
	public String empSalTypeEdit(){
		empSalType = biz.findById(salTypeId);
		return "empSalTypeEdit";
	}
	
	public String doEmpSalTypeEdit(){
		biz.saveOrUpdate(empSalType);;
		return "doEmpSalTypeEdit";
	}
	
	public EmpVo getVo() {
		return vo;
	}

	public void setVo(EmpVo vo) {
		this.vo = vo;
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

	public List<Emp> getElist() {
		return elist;
	}

	public void setElist(List<Emp> elist) {
		this.elist = elist;
	}

	public List<EmpType> getTlist() {
		return tlist;
	}

	public void setTlist(List<EmpType> tlist) {
		this.tlist = tlist;
	}

	public List<EmpJob> getJlist() {
		return jlist;
	}

	public void setJlist(List<EmpJob> jlist) {
		this.jlist = jlist;
	}

	public List<EmpRole> getRlist() {
		return rlist;
	}

	public void setRlist(List<EmpRole> rlist) {
		this.rlist = rlist;
	}

	public EmpSal getEmpSal() {
		return empSal;
	}
	
	public List<EmpSal> getSlist() {
		return slist;
	}

	public void setSlist(List<EmpSal> slist) {
		this.slist = slist;
	}

	public void setEmpSal(EmpSal empSal) {
		this.empSal = empSal;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public EmpType getEmpType() {
		return empType;
	}

	public void setEmpType(EmpType empType) {
		this.empType = empType;
	}

	public EmpJob getEmpJob() {
		return empJob;
	}

	public void setEmpJob(EmpJob empJob) {
		this.empJob = empJob;
	}

	public EmpRole getEmpRole() {
		return empRole;
	}

	public void setEmpRole(EmpRole empRole) {
		this.empRole = empRole;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public Integer getSalId() {
		return salId;
	}

	public void setSalId(Integer salId) {
		this.salId = salId;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

	public EmpBiz getEbiz() {
		return ebiz;
	}

	public void setEbiz(EmpBiz ebiz) {
		this.ebiz = ebiz;
	}

	public void setTbiz(EmpTypeBiz tbiz) {
		this.tbiz = tbiz;
	}

	public void setJbiz(EmpJobBiz jbiz) {
		this.jbiz = jbiz;
	}

	public void setRbiz(EmpRoleBiz rbiz) {
		this.rbiz = rbiz;
	}

	public void setSbiz(EmpSalBiz sbiz) {
		this.sbiz = sbiz;
	}

	public void setSsbiz(EmpSalStateBiz ssbiz) {
		this.ssbiz = ssbiz;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public void setBiz(EmpSalTypeBiz biz) {
		this.biz = biz;
	}

	public Integer getSalTypeId() {
		return salTypeId;
	}

	public void setSalTypeId(Integer salTypeId) {
		this.salTypeId = salTypeId;
	}

	public EmpSalTypeVo getTvo() {
		return tvo;
	}

	public void setTvo(EmpSalTypeVo tvo) {
		this.tvo = tvo;
	}

	public EmpSalType getEmpSalType() {
		return empSalType;
	}

	public void setEmpSalType(EmpSalType empSalType) {
		this.empSalType = empSalType;
	}

	public List<EmpSalType> getStlist() {
		return stlist;
	}

	public void setStlist(List<EmpSalType> stlist) {
		this.stlist = stlist;
	}
	
}
