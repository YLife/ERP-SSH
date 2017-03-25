<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	function check(){
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
<form action="doFileUpload.action" method="post" enctype="multipart/form-data" name="form">
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >文件上传</th>
  </tr>
  <tr>
    <td class="CPanel">
      <table border="0" cellpadding="0" cellspacing="0" style="width:100%">
		<tr align="center">
			<td height="30" style="font-size:16px">
				<select name="file.pro.proId">
					<option>==选择项目==</option>
					<s:iterator value="plist" var="p">
						<option value="<s:property value="#p.proId "/>"><s:property value="#p.proName "/></option>
					</s:iterator>
				</select>
			</td>
		</tr>
		<TR>
		  <td height="26">	
			<table width="100%" border="0" cellpadding="2" align="center" cellspacing="1">	
					<tr class="TablePanel" align="center">
						<td width="30%" align="center">文件名</td>
						<td width="50%" align="center">文件路劲</td>	
						<td width="20%" >待定</td>        	
					</tr>
					<tr class="TablePanel" align="center">
						<td align="center"><input type="text" name="iName"/></td>
						<td align="center"><input name="upload" type="file" class="button" id="xxx" size="20" /></td>	        	
					    <td align="center">待定</td>
					</tr>
			</table>								  
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
