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
	
	function link(){
	    document.getElementById("fom").action="xuqiumingxi.html";
	    document.getElementById("fom").submit();
	}
</script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form name="fom" id="fom" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" background="images/nav04.gif">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21">&nbsp;</td>
			  </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
					<tr>
                    <td height="20" colspan="3" align="center" bgcolor="#EEEEEE"class="tablestyle_title">
							<div align="center" style="font-size:16px">模块明细列表</div></td>
                    </tr>
                  <tr>
				    <td width="16%" height="20" align="right" bgcolor="#FFFFFF">模块名称:</td>
                    <td width="84%" colspan="2" bgcolor="#FFFFFF"><s:property value="mod.modName"/></td>
                  </tr>
				  <tr>
				    <td width="16%" height="20" align="right" bgcolor="#FFFFFF">任务执行人:</td>
                    <td width="84%" colspan="2" bgcolor="#FFFFFF"><s:property value="mod.emp.empName"/></td>
                  </tr>
				  
                  <tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">所属项目:</td>
				    <td colspan="2" bgcolor="#FFFFFF"><s:property value="mod.pro.proName"/></td>
                    </tr>
					<tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">项目需求:</td>
				    <td colspan="2" bgcolor="#FFFFFF">等待客户告知</td>
                    </tr>
					<tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">优先级:</td>
				    <td colspan="2" bgcolor="#FFFFFF"><s:property value="mod.modPriority.modPriorityName"/></td>
                    </tr>
                  <tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">创建时间:</td>
				    <td colspan="2" bgcolor="#FFFFFF"><s:date name="mod.modCreateDate" format="yyyy-MM-dd"/></td>
                    </tr>
                  <tr>
                    <td height="20" align="right" bgcolor="#FFFFFF">结束时间:</td>
                    <td colspan="2" bgcolor="#FFFFFF"><s:date name="mod.modEndDate" format="yyyy-MM-dd"/></td>
                  </tr>
                  <tr>
				    <td height="80" align="right" bgcolor="#FFFFFF">模块描述:</td>
				    <td colspan="2" bgcolor="#FFFFFF"><s:property value="mod.modRemark"/></td>
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
        <tr>
			<td align="center" height="50px">
				<input type="button" name="submit" id="submit" onclick="alert('打印成功')" value="打印" />
				<input type="button" name="back" id="back" onclick="window.history.go(-1);" value="返回"/>
			</td>
	    </tr>
        </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
