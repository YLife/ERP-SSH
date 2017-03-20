<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>ERP管理系统</title>
<link rel="stylesheet" rev="stylesheet" href="css/style.css" type="text/css" media="all" />
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>
<body class="ContentBody">
<form action="doProEdit.action" method="post" name="form">
<div class="MainDiv">
<input type="hidden" name="pro.proId" value="<s:property value="pro.proId"/>"/>
<input type="hidden" name="pro.emp.empId" value="<s:property value="pro.emp.empId"/>"/>
<input type="hidden" name="pro.client.clientId" value="<s:property value="pro.client.clientId"/>"/>
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >项目添加录入</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr align="center">
          <td class="TablePanel"></td>
		  </tr>
		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>项目信息</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					  <tr>
					    <td nowrap align="right" width="15%">项目名称:</td>
					    <td width="35%"><input name='pro.proName' type="text" class="text" style="width:154px" value="<s:property value="pro.proName"/>" />
				        <span class="red">*</span></td>
				        	
					    <td nowrap align="right" width="18%">所属单位:</td>
					    <td width="35%"><input name='pro.client.clientComp' type="text" class="text" style="width:154px" value="<s:property value="pro.client.clientComp"/>" />
				        <span class="red">*</span></td>
					    </tr>
						<tr>
					    <td nowrap align="right" width="15%">项目金额:</td>
					    <td width="35%"><input name='pro.proAmount' type="text" class="text" style="width:154px" value="<s:property value="pro.proAmount"/>"/></td>
				         <td nowrap align="right" width="18%">开发人数:</td>
					    <td width="35%"><input name='pro.devNum' type="text" class="text" style="width:154px" value="<s:property value="pro.devNum"/>" /></td>	
						</tr>
						<tr>	
							<td nowrap align="right" width="15%">项目经理:</td>
							<td width="35%">
								<input name='pro.emp.empName' type="text" class="text" style="width:154px" value="<s:property value="pro.emp.empName"/>"/></td>
							<td nowrap align="right" width="18%">完成状态:</td>
							<td width="35%">
							<select id="select1" name="pro.proState.proStateId">
								<s:iterator value="slist" var="s">
									<option value="<s:property value="#s.proStateId"/>" <s:if test="pro.proState.proStateId == #s.proStateId">selected = "selected"</s:if>><s:property value="#s.proStateName"/></option>
								</s:iterator>
							</select>							</td>
				        </tr>
						<tr>	
							<td nowrap align="right" width="15%">预算总成本:</td>
							<td width="35%"><input name='pro.proCost' type="text" class="text" style="width:154px" value="<s:property value="pro.proCost"/>" /></td>
							<td nowrap="nowrap" align="right">计划开发日期:</td>
							<td><input name='pro.startDate' type="text" class="text" style="width:154px" value="<s:date name="pro.startDate" format="yyyy-MM-dd"/>"/></td>
						</tr>
						<tr>
						  <td nowrap="nowrap" align="right">计划完成日期:</td>
						  <td><input name='pro.endDate' type="text" class="text" style="width:154px" value="<s:date name="pro.endDate" format="yyyy-MM-dd"/>"/>                          </td>	
							<td  align="right">优先级:</td>
							<td >
								<select name="pro.proPriority.priorityId" >
									<s:iterator value="plist" var="p">
										<option value="<s:property value="#p.priorityId"/>" <s:if test="pro.proPriority.priorityId == #p.priorityId">selected = "selected"</s:if>><s:property value="#p.priorityName"/></option>
									</s:iterator>
	                            </select>
                            </td>
						</tr>
					  <tr>
					    <td  width="15%" nowrap align="right">备注:</td>
					    <td colspan="3"><textarea name="pro.remark" cols="100" rows="10"><s:property value="pro.remark"/></textarea></td>
					    </tr>
					  </table>
			  	<br />
				</fieldset></TD>
			</TR>
			</TABLE>
		 </td>
  		 </tr>
		 <TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="保存" class="button"/>
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
		</TR>
		</TABLE>
	 </td>
  </tr>
  </table>
</div>
</form>
</body>
</html>
