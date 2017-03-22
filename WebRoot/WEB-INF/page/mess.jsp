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
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
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
	
	function on_load(){
		var loadingmsg=document.getElementById("loadingmsg");
		var mainpage=document.getElementById("mainpage");
		loadingmsg.style.display="";
		mainpage.style.display="none";
		loadingmsg.style.display="none";
		mainpage.style.display="";
	}
	function del() {
		 var fom = document.getElementById("fom");
		 fom.action = "doMessDel.action";
		 fom.submit();
	}
</script>
</head>

<body onload="on_load()">
<form name="fom" id="fom" method="post" action="mess.action">
<table id="mainpage" width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="images/nav04.gif">
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="21"><img src="images/ico07.gif" width="20" height="18" /></td>
			<td width="550">查看内容：按时间：
			 <input name="vo.begin" type="text" size="12" value="<s:property value="vo.begin"/>"/><span class="newfont06">至</span>
			 <input name="vo.end" type="text" size="12" value="<s:property value="vo.end"/>"/>
			 <input name="Submit" type="submit" class="right-button02" value="查询" />
			 </td>
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
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="删除所选信息" onclick="del();"/>
	              </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
					<tr>
                    <td height="20" colspan="6" align="center" bgcolor="#EEEEEE"class="tablestyle_title">消息总列表</td>
                    </tr>
                  <tr>
				    <td width="4%" align="center" bgcolor="#EEEEEE">选择</td>
                    <td width="15%" height="20" align="center" bgcolor="#EEEEEE">标题</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">发件人</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">收件人</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">发送时间</td>
                    <td width="12%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                  <s:iterator value="mlist" var="m">
	                  <tr align="center">
					    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid" value="<s:property value="#m.messId"/>"/></td>
	                    <td height="20" bgcolor="#FFFFFF"><s:property value="#m.messTitle"/></td>
	                    <td bgcolor="#FFFFFF"><s:property value="#m.sendName"/></td>
	                    <td bgcolor="#FFFFFF"><s:property value="#m.getName"/></td>
	                    <td bgcolor="#FFFFFF"><s:date name="#m.sendDate" format="yyyy-MM-dd"/></td>
	                    <td bgcolor="#FFFFFF"><a href="messData.action?messId=<s:property value="#m.messId"/>">查看</a></td>
	                  </tr>
                  </s:iterator>
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
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="50%">共<span class="right-text09"><s:property value="totalPage"/></span> 页 | 第 <span class="right-text09"><s:property value="currentPage"/> </span> 页</td>
                <td width="49%" align="right">
                	[<a href="mess.action?currentPage=1" class="right-font08">首页
                	</a> | <s:if test="currentPage <= 1 ">上一页</s:if>
                	<s:if test="currentPage > 1 ">
                		<a href="mess.action?currentPage=<s:property value="currentPage - 1"/> " class="right-font08">上一页</a>
                	</s:if> | 
                	<s:if test="currentPage < totalPage "><a href="mess.action?currentPage=<s:property value="currentPage + 1"/>" class="right-font08">下一页</a></s:if>
                	<s:if test="currentPage >= totalPage ">下一页</s:if> | <a href="mess.action?currentPage=<s:property value="totalPage"/>" class="right-font08">末页</a>] 转至：
                </td>
                <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input name="jumpPage" type="text" class="right-textfield03" size="1" value="<s:property value="jumpPage"/>"/></td>
                      <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value=" " />
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
