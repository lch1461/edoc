<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/4
  Time: 16:12
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
<form action="add" class="addedoc">
    <table border="1">
        <tr>
            <th colspan="2">
                增加电子图书
            </th>
        </tr>
        <tr>
            <td>图书名称(*)</td>
            <td><input type="text" name="title" class="title"></td>
        </tr>
        <tr>
            <td>图书摘要</td>
            <td><input type="text" name="summary" class="summary"></td>
        </tr>
        <tr>
            <td>上传人</td>
            <td><input type="text" name="uploadUser" class="uploadUser"></td>
        </tr>
        <tr>
            <td>上传时间(*)</td>
            <td><input type="text" name="createDate" class="createDate">(yyyy-MM-dd)</td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="submit" value="返回">
            </td>
        </tr>
    </table>
</form>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
<script>
    //表单非空验证
    $(".addedoc").submit(function(){
        var title = $(".title").val();
        var createDate = $(".createDate").val();
        if (title=="") {
            alert("文档名称不能为空！")
            return false;
        }
        if (createDate=="") {
            alert("上传时间不能为空！")
            return false;
        }
    })
    <script>
    //表单非空验证
    $(".addedoc").submit(function(){
        var title = $(".title").val();
        var createDate = $(".createDate").val();
        if (title=="") {
            alert("文档名称不能为空！")
            return false;
        }
        if (createDate=="") {
            alert("上传时间不能为空！")
            return false;
        }
    })
</script>
</body>
</html>
