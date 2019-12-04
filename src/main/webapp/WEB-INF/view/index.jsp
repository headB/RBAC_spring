<%--
  Created by IntelliJ IDEA.
  User: lizhixuan
  Date: 2019-11-28
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--这里需要引入JSTL--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    
    <div>
        <p>我!</p>

<%--        这里想实现一个遍历数据的功能.!!!试一试啦!.分页的!.--%>
        <c:if test="${pageInfo != null}" >
            <c:forEach items="${pageInfo.data}" var="page" >
                <p>${page.username}</p>
            </c:forEach>
        </c:if>

        
        
    </div>
    
    
</div>
</body>
</html>
