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
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">
	function selectAll(){
		var obj = document.fom.elements;
		for (var i=0;i<obj.length;i++){
			if (obj[i].name == "delid"){
				obj[i].checked = true;
			}
		}
	}
	
	function unselectAll(){
		var obj = document.fom.elements;
		for (var i=0;i<obj.length;i++){
			if (obj[i].name == "delid"){
				if (obj[i].checked==true) obj[i].checked = false;
				else obj[i].checked = true;
			}
		}
	}
</script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form name="fom" id="fom" method="post" action="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
 
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="images/nav04.gif">
          
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="679" align="left"><a href="#" onclick="sousuo()"></a></td>	
		  </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	         
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="9" align="center" bgcolor="#EEEEEE"class="tablestyle_title"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					个人信息列表</td>
                    </tr>
                  <tr>
				    <td width="15%" height="20" align="right" bgcolor="#FFFFFF">用户名称:</td>
                    <td width="85%" align="left" bgcolor="#FFFFFF"><input type="text" value="<s:property value="emp.empName" />" name="empName"/></td>
                    </tr>
					<tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">用户职位:</td>
                    <td bgcolor="#FFFFFF"><input type="text" value="<s:property value="emp.empJob.jobName" />" name="jobName"/></td>
                    </tr>
                  <tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">性别:</td>
                    <td bgcolor="#FFFFFF"><select name="empSex"><option value="男" <s:if test="emp.empSex == '男' ">selected = "selected"</s:if>>男</option>
                    	<option value="女" <s:if test="emp.empSex == '女' ">selected = "selected"</s:if>>女</option></select></td>
                    </tr>
					<tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">出生日期:</td>
                    <td bgcolor="#FFFFFF"><input type="text" value="<s:property value="emp.empBorn" />" name="empBorn"/></td>
                    </tr>
                  <tr>
				   <td height="20" align="right" bgcolor="#FFFFFF">身份证号码:</td>
                    <td bgcolor="#FFFFFF"><input type="text" value="<s:property value="emp.empNo" />" name="empNo"/></td>
                    </tr>
					<tr>
				    <td align="right" bgcolor="#FFFFFF">电话:</td>
                    <td bgcolor="#FFFFFF"><input type="text" value="<s:property value="emp.empPhone" />" name="empPhone"/></td>
                    </tr>
			
				<tr>
				    <td align="right" bgcolor="#FFFFFF"></td>
                    <td bgcolor="#FFFFFF">
                    	<input type="button" value="打印" style="margin-left: 15px;" onclick="alert('打印成功！')"/>
                    	<input type="button" value="返回" style="margin-left: 15px;" onclick="window.history.go(-1)"/></td>
                    </tr>
					
                </table></td>
              </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="images/spacer.gif" width="1" height="1" /></td>
        </tr>
        
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
