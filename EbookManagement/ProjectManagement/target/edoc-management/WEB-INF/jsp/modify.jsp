<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/5
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save">
    <input type="hidden" name="id" value="${pro.id }">
    <table border="1">
        <tr>
            <td colspan="2">
                <h1>申报项目信息</h1>
            </td>
        </tr>
        <tr>
            <td>项目编号</td>
            <td>${pro.id }</td>
        </tr>
        <tr>
            <td>项目名称</td>
            <td>${pro.projectName }</td>
        </tr>
        <tr>
            <td>申报开始日期</td>
            <td><fmt:formatDate value="${pro.startDate }"/></td>
        </tr>
        <tr>
            <td>申报结束日期</td>
            <td><fmt:formatDate value="${pro.endDate }"/></td>
        </tr>
        <tr>
            <td>申报状态</td>
            <td>
                <select name="status">
                    <c:if test="${pro.status==0 }">
                    <option value ="0">已申报</option>
                    </c:if>
                    <option value ="1">审核中</option>
                    <option value ="2">已审核</option>
                    <lect>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="审核">
                <input type="button" value="返回" onclick="javascript:history.go(-1);">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
