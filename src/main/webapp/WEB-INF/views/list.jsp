<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>password</th>
    </tr>
    <c:forEach  items="${testBeans}" var="testBean">
        <tr>
            <td>${testBean.id}</td>
            <td>${testBean.username}</td>
            <td>${testBean.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
