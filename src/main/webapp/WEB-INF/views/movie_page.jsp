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

<div style="width: 100%; background-color: black">
    <div style="width: 1100px; margin-right: auto; margin-left: auto">
        <table style="width: 100%">
            <tr>
                <td style="text-align: left; padding-bottom: 9px; padding-top: 15px">
                    <img width="240px"; height="370px" src="/image/${movie.image.id}">
                </td>
                <td style="text-align: right; padding-bottom: 9px; padding-top: 15px">
                    <iframe width="850" height="370" src="https://www.youtube.com/embed/${movie.trailer}?rel=0" frameborder="0" allowfullscreen>
                    </iframe>
                </td>
            </tr>
        </table>
    </div>
</div>

<div style="width: 1100px; margin-right: auto; margin-left: auto; padding: 0 10px;">
    <div style="height: 55px; padding-top: 15px">
        <div style="float: left"><h2>${movie.name}</h2></div>
        <div style="color: #e42511">${movie.year}</div>
    </div>

    <table width="100%">
        <tr>
            <td><span>Producer: <a href="/producer/${movie.producer.id}">${movie.producer.name}</a></span></td>
            <td>Genre: <c:forEach items="${movie.genres}" var="genre"><b>${genre} </b></c:forEach></td>
            <td><span>Country: <b>${movie.country}</b></span></td>
            <td><span>Duration: <b>${movie.duration}</b></span></td>
            <td><span>Kinopoisk: <b>${movie.kinopoisk}</b></span></td>
            <td><span>IMDB: <b>${movie.imdb}</b></span></td>
        </tr>
    </table>
    <hr>
    <div>
        <span><h5>Description</h5></span>
        <span>${movie.desription}</span></td>
    </div>
    <hr>

    <div style="height: 275px; white-space:nowrap;">
        <span><h5>Cast</h5></span>
        <c:forEach items="${movie.actors}" var="a">
            <div style="display:inline-block; padding: 0 5px; text-align: center">
                <a href="/actor/${a.id}">
                    <img border="1px" width="145px" height="180px" src="/image/${a.image.id}"></a><br>
                <a href="/actor/${a.id}">${a.name}</a>
            </div>
        </c:forEach>
    </div>
<br>
    </div>

<div style="width: 100%; background-color: #cacaca">
    <div style="width: 1100px; margin-right: auto; margin-left: auto">
    <br><h5>Other movie</h5><br>
    <div style="overflow: auto; height: 575px">
        <c:forEach items="${all}" var="mov">
            <div style="width: 176px; display:inline-block; padding-bottom: 5px; text-align: center">
                <a href="/movie/${mov.id}">
                    <img width="177px" height="260px" src="/image/${mov.image.id}"></a><br>
                <a href="/movie/${mov.id}">${mov.name}</a>
            </div>
        </c:forEach>
    </div>
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
