<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/3
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path =request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/list">
        <strong>图书分类：</strong>
        <select name="categoryId">
            <option value="0">全部</option>
            <c:forEach items="${categoryList}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>

        <input type="submit" value="查询"/>
    </form>
    <form action="${pageContext.request.contextPath}/toadd">
        <input type="submit" value="新增电子图书">
    </form>
</div>
<table border="1">
    <tr>
        <td colspan="6"><h3>电子图书列表</h3></td>
    </tr>
    <tr>
        <th>图书编号</th>
        <th>图书名称</th>
        <th>图书摘要</th>
        <th>上传人</th>
        <th>上传时间</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${entryList}" var="entry">
        <tr>
            <td>${entry.id}</td>
            <td>${entry.title}</td>
            <td>${entry.summary}</td>
            <td>${entry.uploadUser}</td>
            <td><fmt:formatDate value="${entry.createDate}" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="toupdate?id=${entry.id}">修改</a>
                <a href="javascript:" class="deleteEntry" entryId="${entry.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
<script>
    $(function () {
        $(".deleteEntry").click(function () {
            if (!confirm("是否删除该数据？")){
                return;
            }
            var entryId = $(this).attr("entryId");
            var el = $(this);
            $.ajax({
                url:"deleteEntry",
                data:{id:entryId},
                type:"GET",
                dataType:"text",
                success:function (result) {
                    if(result=='ok'){
                        alert("删除成功！");
                        el.parents("tr").remove();
                    }else {
                        alert("删除失败！");
                    }
                }
            })
        })
    })
</script>
</body>
</html>
