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


<script type="text/javascript">
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
<form action="doEmpSalSend.action" method="post" name="form">
<div class="MainDiv">
  <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
    <tr>
      <th class="tablestyle_title" >员工工资发放</th>
    </tr>
    <tr>
      <td class="CPanel"><table border="0" cellpadding="0" cellspacing="0" style="width:100%">
          <tr>
            <td align="left"><label style="font-size:16px">&nbsp;&nbsp;<s:property value="empSal.emp.empName" /></label>工资<%-- <input type="text" name="empSal.Sal" value="<s:property value="empSal.salId" />"/> --%></td>
          </tr>
          <tr>
            <td width="100%"><fieldset style="height:100%;">
              <legend>工资信息</legend>
              <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
                <tr>
                  <td nowrap align="right" width="15%">基本工资:</td>
                  <td width="35%"><input name='txt3' type="text" class="text" style="width:154px" value="<s:property value="empSal.baseSal"/>"/></td>
                  <td align="right" width="16%">奖金:</td>
                  <td width="34%"><input name='txt32' type="text" class="text" style="width:154px" value="<s:property value="empSal.bonus + empSal.other"/>"/>
                      <span class="red">*</span></td>
                </tr>
                <tr>
                  <td width="15%" nowrap align="right">处罚扣除金额:</td>
                  <td width="35%"><input class="text" name='datevalue2' style="width:154px" value="<s:property value="empSal.fine"/>" /></td>
                  <td align="right">发放类型:</td>
                  <td><select name="empSal.salType" >
                      <option  selected="selected">==请选择==</option>
                      <option value="现金">现金</option>
                      <option value="打卡">打卡</option>
                  </select></td>
                </tr>
                <tr>
                  <td align="right">年份:</td>
                  <td><select name="year">
                      <option>2007</option>
                      <option selected="selected">2008</option>
                  </select></td>
                  <td align="right">月份:</td>
                  <td><select name="month">
                      <option >1</option>
                      <option>2</option>
                      <option>3</option>
                      <option>4</option>
                      <option>5</option>
                      <option>6</option>
                      <option>7</option>
                      <option>8</option>
                      <option>9</option>
                      <option>10</option>
                      <option>11</option>
                      <option>12</option>
                  </select></td>
                </tr>
                <tr>
                 <td align="right">编号:</td>
					 <td colspan="3">&nbsp;<input type="text" name="salId" value="<s:property value="empSal.salId"/>"/></td>
                </tr>
              </table>
              <br />
            </fieldset></td>
          </tr>
      </table></td>
    </tr>
    <tr>
      <td colspan="2" align="center" height="50px"><input type="submit" name="Submit2" value="确认发放" class="button"/>
        <input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
        <textarea name="salRemark" cols="100" rows="8"></textarea></td>
    </tr>
  </table>
  </td>
  </tr>
  </table>
</div>
</form>
</body>
</html>
