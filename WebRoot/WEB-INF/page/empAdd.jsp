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

</script>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
</head>
<body class="ContentBody">
<form action="doEmpAdd.action" method="post" name="form">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >员工基本信息录入</th>
  </tr>
  <tr>
    <td class="CPanel">
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr><td align="left"></td></tr>
		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>员工信息</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					  <tr>
					    <td nowrap="nowrap" align="right" width="15%">员工唯一编号:</td>
					    <td width="35%"><input name="id" type="text" class="text" style="width:154px"/></td>
					    <td width="16%" align="right" nowrap="nowrap">密码:</td>
					    <td width="34%"><input class="text" type="password" name="emp.empPwd" style="width:154px"/></td>
					  </tr>
					    
					    
					  <tr>
					    <td nowrap="nowrap" align="right">真实姓名:</td>
					    <td><input class="text" type="text" name="emp.empName" style="width:154px"/></td>
					    <td align="right">性别:</td>
					    <td><select name="emp.empSex" >
                            <option selected="selected">==请选择==</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select></td>
					  </tr>
					  
					  
					  <tr>
					    <td align="right">出生日期:</td>
					    <td><input class="text" type="text" name="emp.empBorn" style="width:154px"/></td>
					    <td align="right">身份证号码:</td>
					    <td><input class="text" type="text" name="emp.empNo" style="width:154px"/></td>
					  </tr>
					  <tr>
					    <td align="right">电话号码:</td>
					    <td><input class="text" type="text" name="emp.empPhone" style="width:154px"/></td>
					     <td align="right">入职时间:</td>
					    <td><input class="text" type="text" name="emp.empDate" style="width:154px"/></td>
					  </tr>
					  <tr>
					    <td align="right">职位:</td>
					    <td><select name="empJob.jobId" >
                          <option  value="0">==请选择==</option>
                          <s:iterator value="jlist" var="j">
                          	<option value="<s:property value="#j.jobId"/>"><s:property value="#j.jobName"/> </option>
                          </s:iterator>
                        </select></td>
                        <td align="right">奖金:</td>
					    <td><input class="text" type="text" name="empSal.bonus" style="width:154px"/></td>
					  </tr>
					  <tr>
					    
					  </tr>
					  <tr>
					   	<td align="right">员工类型:</td>
					    <td>
						    <select name="empType.typeId" >
	                            <option  value="0">==请选择==</option>
	                            <s:iterator value="tlist" var="t">
                          			<option value="<s:property value="#t.typeId"/>"><s:property value="#t.typeName"/> </option>
                          		</s:iterator>
	                        </select>
                        </td>
					    <td align="right">其他补助金:</td>
					    <td><input class="text" type="text" name="empSal.other" style="width:154px"/></td>
                        
                      </tr>
              		  <tr>
              		  	<td align="right">角色:</td>
					    <td>
						    <select name="empRole.roleId" >
	                            <option  value="0">==请选择==</option>
	                           <s:iterator value="rlist" var="r">
                          			<option value="<s:property value="#r.roleId"/>"><s:property value="#r.roleName"/> </option>
                         	   </s:iterator>
	                        </select>
                        </td>
					    <td align="right">基本工资:</td>
					    <td><input class="text" type="text" name='empSal.baseSal' style="width:154px"/></td>
					  </tr>
					 
					 
					  <tr>
					    <td align="right">描述:</td>
					    <td colspan="3"><textarea name="empSal.remark" cols="100" rows="8"></textarea></td>
					    </tr>
					  </table>
			  <br />
				</fieldset>			</TD>
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
</form>
</body>
</html>
