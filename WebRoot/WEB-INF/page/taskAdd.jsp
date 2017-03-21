<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script language="JavaScript" type="text/javascript">
	function check()
	{
		document.getElementById("aa").style.display="";
	}
</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>
<body class="ContentBody">
<form action="doTaskAdd.action" method="post" name="fom" id="fom">
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >添加任务页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>添加任务</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					  <tr>
					    <td nowrap align="right" width="13%">任务标题:</td>
					    <td width="41%"><input name="task.taskName" class="text" style="width:250px" type="text" size="40" />
				        <span class="red"> *</span></td>
					    <td nowrap align="right">所属项目/模块/功能:</td>
					    <td>
					    	<select name="task.pro.proId">
					    		<option value="">==请选择==</option>
						    	<s:iterator value="plist" var="p">
		                          	<option value="<s:property value="#p.proId"/>" <s:if test="#p.proId == task.pro.proId">selected = "selected"</s:if>><s:property value="#p.proName"/></option>
						    	</s:iterator>
	                        </select>
	                        <select name="task.mod.modId">
	                        	<option value="">==请选择==</option>
						    	<s:iterator value="mlist" var="m">
		                          	<option value="<s:property value="#m.modId"/>" <s:if test="#m.modId == task.mod.modId">selected = "selected"</s:if>><s:property value="#m.modName"/></option>
						    	</s:iterator>
	                        </select>
	                        <select name="task.fun.funId">
	                        	<option value="">==请选择==</option>
						    	<s:iterator value="flist" var="f">
		                          	<option value="<s:property value="#f.funId"/>" <s:if test="#f.funId == task.fun.funId">selected = "selected"</s:if>><s:property value="#f.funName"/></option>
						    	</s:iterator>
	                        </select>
						</td>
					  </tr>
					  <tr>
					    <td nowrap align="right">计划开始时间:</td>
					    <td><input name="task.taskCreateDate" type="text" id="" class="text" style="width:154px"/></td>
					    <td align="right">计划结束时间:</td>
					    <td><input name="task.taskEndDate" type="text" id="Input" class="text" style="width:154px" /></td>
					  </tr>
					  <tr>
					    <td nowrap align="right">任务执行人:</td>
					     <td>
						    <select name="task.emp.empId" >
						    	<option value="">==请选择==</option>
						    	<s:iterator value="elist" var="e">
						    		<option value="<s:property value="#e.empId"/>" <s:if test="#e.empId == task.emp.empId">selected = "selected"</s:if>><s:property value="#e.empName"/></option>
						    	</s:iterator>
	                        </select>
                        </td>
					    <td align="right">优先级:</td>
					    <td>
						    <select name="task.priority.priorityId" >
						    	<option value="">==请选择==</option>
						    	<s:iterator value="pplist" var="p">
						    		<option value="<s:property value="#p.priorityId"/>" <s:if test="#p.priorityId == task.priority.priorityId">selected = "selected"</s:if>><s:property value="#p.priorityName"/></option>
						    	</s:iterator>
	                        </select>
                        </td>
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px">任务说明:</td>
					    <td colspan="3"><textarea id="textarea" name="task.taskNote" rows="5" cols="80"></textarea></td>
					    </tr>
					  </table>
			 		<br/>
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
