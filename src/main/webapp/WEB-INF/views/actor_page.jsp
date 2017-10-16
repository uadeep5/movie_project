<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body {
            padding-top: 50px;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-md fixed-top navbar-dark bg-dark">

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Add</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="/add_movie">Add Movie</a> <br>
                    <a class="dropdown-item" href="/add_actor">Add Actor</a><br>
                    <a class="dropdown-item" href="/add_producer">Add Producer</a>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn btn-info my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<div style="width: 1100px; margin-right: auto; margin-left: auto; padding: 0 10px;">
<table>
    <tr>
        <td><img src="/image/${actor.image.id}" width="200px" height="300px"></td>
        <td>${actor.name}<br>
            ${actor.birthdayDate}
        </td>

    </tr>
</table>
    <hr>
    <div>
        <c:forEach items="${actor.movies}" var="m">
            ${m.name}<br>
        </c:forEach>
    </div>
</div>

<footer style="background-color: #343a40; height: 60px">
    <p>&copy; Company 2017</p>
</footer>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" ></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>
</body>
</html>
