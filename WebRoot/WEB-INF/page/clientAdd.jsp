
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<form action="doClientAdd.action" method="post" name="form">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0"
				class="CContent">
				<tr>
					<th class="tablestyle_title">客户基本信息录入</th>
				</tr>
				<tr>
					<td class="CPanel">
						<table border="0" cellpadding="0" cellspacing="0"
							style="width:100%;margin-top: 20px;">
							<TR>
								<TD width="100%">
									<fieldset style="height:100%;">
										<legend>客户信息</legend>
										<table border="0" cellpadding="2" cellspacing="1"
											style="width:100%">
											<tr>
												<td align="right" width="15%">公司名称:</td>
												<td width="35%"><input name="client.clientComp" type="text"
													class="text" style="width:154px"/> <span class="red">*</span></td>
												<td width="16%" align="right" nowrap="nowrap">联系人:</td>
												<td width="34%"><input class="text" name="client.clientName"
													style="width:154pxzzz"/></td>
											</tr>
											<tr>
												<td nowrap="nowrap" align="right">联系电话:</td>
												<td><input class="text" name="client.clientPhone"
													style="width:154px"/></td>
												<td align="right">联系地址:</td>
												<td><input class="text" name="client.clientAdd"
													style="width:154px"/></td>
											</tr>

											<tr>
												<td align="right">公司背景:</td>
												<td colspan="3"><textarea name="client.clientBack" cols="100"
														rows="8"></textarea></td>
											</tr>
										</table>
										<br />
									</fieldset>
								</TD>
							</TR>
						</TABLE>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center" height="50px">
						<input type="submit" name="Submit" value="保存 " class="button"/> 
						<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);" />
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
