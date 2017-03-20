package com.yl.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.biz.ClientBiz;
import com.yl.entity.Client;
import com.yl.vo.ClientVo;

public class ClientAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private Integer jumpPage;
	private Integer pageSize;
	private Integer currentPage;
	private Integer totalPage;
	private Client client;
	private Integer clientId;
	private ClientVo vo ;
	private ClientBiz biz;
	private List<Client> list = new ArrayList<Client>();
	private Integer[] delid = new Integer[5];
	
	public String client(){
		pageSize = pageSize == null ? 5 : pageSize;
		currentPage = currentPage == null ? 1 : currentPage;
		if (jumpPage != null && !"".equals(jumpPage)) {
			currentPage = jumpPage;
		}
		list = biz.findList(currentPage, pageSize, vo);
		totalPage = biz.getTotalPage(pageSize, vo);
		return "client";
	}
	
	public String clientData(){
		client = biz.findById(clientId);
		return "clientData";
	}
	
	public String clientEdit(){
		client = biz.findById(clientId);
		return "clientEdit";
	}
	
	public String doClientEdit(){
		biz.saveOrUpdate(client);
		return "doClientEdit";
	}
	
	public String doClientAdd(){
		Date date = new Date();
		client.setClientDate(date);
		biz.saveOrUpdate(client);
		return "doClientAdd";
	}
	
	public String doClientDel(){
		biz.delMany(delid);
		return "doClientDel";
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public ClientVo getVo() {
		return vo;
	}

	public void setVo(ClientVo vo) {
		this.vo = vo;
	}

	public void setBiz(ClientBiz biz) {
		this.biz = biz;
	}

	public List<Client> getList() {
		return list;
	}

	public void setList(List<Client> list) {
		this.list = list;
	}

	public Integer[] getDelid() {
		return delid;
	}

	public void setDelid(Integer[] delid) {
		this.delid = delid;
	}

}
