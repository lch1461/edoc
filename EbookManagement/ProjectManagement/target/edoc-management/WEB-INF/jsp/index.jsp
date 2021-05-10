<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/5
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=path%>/list" id="proForm">
    <input type="hidden" name="pageIndex" value="1">
    申报状态:
    <select name="status">
        <option value="-1">全部</option>
        <option value="0">已申报</option>
        <option value="1">审核中</option>
        <option value="2">已审核</option>
    </select>
    <input type = "submit" value="查询"/>
</form>


<table border="1">
    <tr>
        <th colspan="6">
            <h1>申报项目列表</h1>
        </th>

    </tr>
    <tr>
        <th>项目编号</th>
        <th>项目名称</th>
        <th>申报开始日期</th>
        <th>申报结束日期</th>
        <th>申报状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${projectList }" var="pro">
        <tr>
            <td>${pro.id }</td>
            <td>${pro.projectName }</td>
            <td><fmt:formatDate value="${pro.startDate }"/></td>
            <td><fmt:formatDate value="${pro.endDate }"/></td>
            <td>${pro.statusName }</td>
            <td>
                <c:if test="${pro.status!=2 }">
                    <a href="toModify?id=${pro.id }">审核</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6">
            <c:if test="${page!=1 }">
                <a href="javascript:toPage(1);">首页</a>
                <a href="javascript:toPage(${page-1 });">上一页</a>
            </c:if>
            <c:if test="${page!=totalPage }">
                <a href="javascript:toPage(${page+1 });">下一页</a>
                <a href="javascript:toPage(${totalPage });">末页</a>
            </c:if>
            第${page}页/共${totalPage}页
        </td>
    </tr>
</table>
<script>
    function toPage(num){
        var frm = document.getElementById("proForm");
        frm.pageIndex.value = num;
        frm.submit();
    }
</script>
</body>
</html>
