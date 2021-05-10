<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/4
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update">
    <table border="1">
        <tr>
            <th colspan="2">
                更新电子图书
            </th>
        </tr>
        <tr>
            <td>图书编号</td>
            <input type="hidden" name="id" value="${ebookEntry.id}">
            <td>${ebookEntry.id}</td>
        </tr>
        <tr>
            <td>图书名称(*)</td>
            <td><input type="text" name="title" value="${ebookEntry.title}"></td>
        </tr>
        <tr>
            <td>图书摘要</td>
            <td><input type="text" name="summary" value="${ebookEntry.summary}"></td>
        </tr>
        <tr>
            <td>上传人</td>
            <td><input type="text" name="uploadUser" value="${ebookEntry.uploadUser}"></td>
        </tr>
        <tr>
            <td>上传时间(*)</td>
            <td><input type="text" name="createDate" value="<fmt:formatDate value="${ebookEntry.createDate}"></fmt:formatDate>">(yyyy-MM-dd)</td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="submit" value="返回">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
