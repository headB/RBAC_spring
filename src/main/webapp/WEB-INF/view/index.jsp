<%--
  Created by IntelliJ IDEA.
  User: lizhixuan
  Date: 2019-11-28
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我这个是标题,用的是spring-mvc+spring容器</title>
</head>
<body>
    <p>我是正文,段落文件</p>

    <p>我的名字是->: ${username}</p>
    <p>我的年龄是->:${age}</p>

    <p>下面即将输出user的数据</p>
    <p>${userInfo}</p>

    <p>测试 @modelAttribute ${name1}</p>
<%--    <p>我的名字是->: ${username}</p>--%>
<%--    <p>我的年龄是->:${age}</p>--%>
<div style="width: 100%;text-align: center"  >
<div  >
<form method="post">
    <input name="username">
    <input type="submit" >
</form>
</div>
</div>
</body>
</html>
