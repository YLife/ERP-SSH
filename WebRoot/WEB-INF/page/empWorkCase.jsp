<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
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

</script>
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
<link href="css/style.css" rel="stylesheet" type="text/css" />
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
</head>
<body>
<form name="fom" id="fom" method="post" action="empWorkCase.action">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="images/nav04.gif"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="24"><img src="images/ico07.gif" width="20" height="18" /></td>
            <td width="519">年份
                <select name="first">
                  <option value="">请选择</option>
                  <option value="2001" ${first=="2001"? "selected" : "" } >2001</option>
                  <option value="2002" ${first=="2002"? "selected" : "" } >2002</option>
                </select>
              &nbsp;&nbsp;
             月份:
              <select name="second">
              	 <option value="" >请选择</option>
	             <option value="01"  ${second=="01"? "selected" : ""}>1</option>
	             <option value="02"  ${second=="02"? "selected" : ""}>2</option>
	             <option value="03"  ${second=="03"? "selected" : ""}>3</option>
	             <option value="04"  ${second=="04"? "selected" : ""}>4</option>
	             <option value="05"  ${second=="05"? "selected" : ""}>5</option>
	             <option value="06"  ${second=="06"? "selected" : ""}>6</option>
	             <option value="07"  ${second=="07"? "selected" : ""}>7</option>
	             <option value="08"  ${second=="08"? "selected" : ""}>8</option>
	             <option value="09"  ${second=="09"? "selected" : ""}>9</option>
	             <option value="10"  ${second=="10"? "selected" : ""}>10</option>
	             <option value="11"  ${second=="11"? "selected" : ""}>11</option>
	             <option value="12"  ${second=="12"? "selected" : ""}>12</option>
              </select>
              &nbsp;&nbsp;
              <input name="Submit" type="submit" class="right-button02" value="查询" /></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr align="center">
                    	<td height="20" colspan="9" align="center" bgcolor="#EEEEEE"class="tablestyle_title">员工月工资列表</td>
                    </tr>
              	<tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">序列</td>
                    <td width="8%" height="20" align="center" bgcolor="#EEEEEE">员工姓名</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">年份</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">月份</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">总工资</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">扣除工资</td>
                    <td width="10%" align="center" bgcolor="#EEEEEE">实发工资</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">状态</td>
                    <td width="13%" align="center" bgcolor="#EEEEEE">发款人</td>
                    <td width="16%" align="center" bgcolor="#EEEEEE">详情</td>
                  </tr>
                  <s:iterator value="slist" var="s">
	                  <tr>
					    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.salId"/></div></td>
	                    <td height="20" bgcolor="#FFFFFF"><div align="center"><s:property value="#s.emp.empName"/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.salDate.year"/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.salDate.month"/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.baseSal + #s.bonus + #s.other"/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.fine "/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><s:property value="#s.baseSal + #s.bonus + #s.other - #s.fine"/></div></td>
	                    <td bgcolor="#FFFFFF"><div align="center" class="top-font01"><s:if test="#s.salState.salState == '已发放'"><span class="STYLE1">已发放</span></s:if>
	                    	<s:if test="#s.salState.salState != '已发放'"><span class="STYLE2">未发放</span></s:if></div>
	                    </td>
	                    <td bgcolor="#FFFFFF"><div align="center">韦华</div></td>
	                    <td bgcolor="#FFFFFF"><div align="center"><a href="empWorkCaseData.action?salId=<s:property value="#s.salId" />">查看</a>&nbsp;|&nbsp;
	                    	<s:if test="#s.salState.salState == '已发放'"><span class="STYLE1">已发</span></s:if>
	                    	<s:if test="#s.salState.salState != '已发放'"><a href="empSalSend.action?salId=<s:property value="#s.salId"/>">发放</a></s:if></div>
	                    </td>
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
               <td width="50%">共<span class="right-text09"><s:property value="totalPage" /> </span> 页 | 第 <span class="right-text09"><s:property value="currentPage" /></span> 页</td>
                 <td width="49%" align="right">
                	[<a href="empWorkCase.action?currentPage=1" class="right-font08">首页
                	</a> | <s:if test="currentPage <= 1 ">上一页</s:if>
                	<s:if test="currentPage > 1 ">
                		<a href="empWorkCase.action?currentPage=<s:property value="currentPage - 1"/> " class="right-font08">上一页</a>
                	</s:if> | 
                	<s:if test="currentPage < totalPage "><a href="empWorkCase.action?currentPage=<s:property value="currentPage + 1"/>" class="right-font08">下一页</a></s:if>
                	<s:if test="currentPage >= totalPage ">下一页</s:if> | <a href="empWorkCase.action?currentPage=<s:property value="totalPage"/>" class="right-font08">末页</a>] 转至：
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
