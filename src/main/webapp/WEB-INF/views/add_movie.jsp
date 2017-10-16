<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body style="background-color: #015850;">

<div style="width: 75%;box-shadow: 0 0 20px 0px black;background-color: #f5f5f5;padding: 10px;margin: auto;margin-top: 15px;">
    <div>
<form action="/movie/add" enctype="multipart/form-data" method="post" role="form">
    <div class="form-group">

    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" name="image" type="file" class="form-group">

    <select style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" size="3" multiple name="actorList">
        <c:forEach items="${actors}" var="actor">
            <option value="${actor.id}">${actor.name}</option>
        </c:forEach>
    </select>

    <select style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="producer">
        <c:forEach items="${producers}" var="producer">
            <option value="${producer.id}">${producer.name}</option>
        </c:forEach>
    </select>

    <select style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" size="3" multiple name="genreList">
        <c:forEach items="${genres}" var="genre">
            <option value="${genre}">${genre}</option>
        </c:forEach>
    </select>

    <select style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="country">
        <c:forEach items="${counrys}" var="coun">
            <option value="${coun}">${coun}</option>
        </c:forEach>
    </select>

    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="name" type="text" placeholder="Enter name">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="year" type="number" placeholder="Enter year">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="duration" type="text" placeholder="Enter duration">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group"name="description" type="text" placeholder="Enter description">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="kinopoisk" type="text" placeholder="Enter kinopoisk">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="imdb" type="text" placeholder="Enter imdb">
        <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group" name="trailer" type="text" placeholder="Enter youtube link">
    <input style="margin-left: 15px;width: 96%;border-radius: 4px;" class="form-group btn btn-success" type="submit" value="Add">

    </div>
    </form>
    </div>
</div>
</body>
</html>
