<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td><img src="/image/${producer.image.id}"></td>
        <td>${producer.name}</td>
        <td>
            <c:forEach items="${producer.movies}" var="p">
                ${p.name}<br>
            </c:forEach></td>
    </tr>
</table>
</body>
</html>