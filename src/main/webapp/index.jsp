<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lizhixuan
  Date: 2019-11-29
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form>

    <input type="checkbox" name="coffee" value="加冰">加冰<br>
    <input type="checkbox" name="coffee" value="加糖">加糖<br>
    <input type="checkbox" name="coffee" value="走奶">走奶<br>
    <input type="submit" >

    <select name="multiValue" multiple="true">
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="mercedes">Mercedes</option>
        <option value="audi">Audi</option>
    </select>

</form>

</body>
</html>
