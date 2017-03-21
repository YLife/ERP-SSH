<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
	
	function link(){
		alert('保存成功！');
	    document.getElementById("fom").action="xuqiumingxi.htm";
	   	document.getElementById("fom").submit();
	}
</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>
<body class="ContentBody">
<form action="doModEdit.action" method="post" name="fom" id="fom">
<div class="MainDiv">
<input type="hidden" name="mod.modId" value="<s:property value="mod.modId"/>"/>
<input type="hidden" name="mod.emp.empId" value="<s:property value="mod.emp.empId"/>"/>
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >项目模块修改页面</th>
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
				<legend>模块</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					  <tr>
					    <td nowrap align="right" width="13%">模块名字:</td>
					    <td width="46%"><input name="mod.modName" class="text" style="width:250px" type="text" size="40" value="<s:property value="mod.modName"/>"/>
				        <span class="red"> *</span></td>
					    <td align="right">所属项目:</td>
					    <td>
						    <select name="mod.pro.proId" >
						    	<s:iterator value="list" var="p">
					              <option value="<s:property value="#p.proId"/>" <s:if test="#p.proId == mod.pro.proId">selected = "selected"</s:if>><s:property value="#p.proName"/></option>         	  
						    	</s:iterator>
	                        </select>
	                    </td>
					  </tr>
					   <tr>
					    <td nowrap align="right">任务执行人:</td>
					    <td><input name="mod.emp.empName" class="text" style="width:250px" type="text" size="40" value="<s:property value="mod.emp.empName"/>"/></td>
					    <td align="right">优先级:</td>
					    <td><select name="mod.modPriority.modPriorityId" >
                          <s:iterator value="plist" var="s">
					              <option value="<s:property value="#s.modPriorityId"/>" <s:if test="#s.modPriorityId == mod.modPriority.modPriorityId">selected = "selected"</s:if>><s:property value="#s.modPriorityName"/></option>         	  
						  </s:iterator>
                        </select></td>
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px">模块描述:</td>
					    <td colspan="3"><textarea id="modRemark" name="mod.modRemark" rows="5" cols="80"><s:property value="mod.modReamark"/></textarea></td>
					    </tr>
					  </table>
				   <br/>
				</fieldset>			
			</TD>
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
