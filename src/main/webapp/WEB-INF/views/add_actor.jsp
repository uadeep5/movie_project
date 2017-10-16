<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #015850;">

<div style="width: 75%;box-shadow: 0 0 20px 0px black;background-color: #f5f5f5;padding: 10px;margin: auto;margin-top: 15px;">
<form action="/actor/add" enctype="multipart/form-data" method="post">
    <div class="form-group">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="image" type="file">
    <select style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="country">
        <c:forEach items="${counrys}" var="coun">
            <option value="${coun}">${coun}</option>
        </c:forEach>
    </select>
    <input  name="name" type="text" placeholder="Enter name" style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group">
    <input name="birthdayDate" type="date" placeholder="Enter birthDate" style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group btn btn-success" type="submit" value="Add">
    </div>
</form>
</div>
</body>
</html>
