<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body {
            padding-top: 90px;
            padding-bottom: 40px;
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


<div class="container">

    <div class="row">

        <div class="col-12 col-md-12">
            <div class="row">
                <c:forEach items="${all}" var="m">

                    <div class="col-md-3">
                        <a href="/movie/${m.id}"><img src="/image/${m.image.id}" height="378px" width="252px"></a>
                    </div>

                </c:forEach>

            </div>
        </div>
    </div>

    <hr>

    <footer>
        <p>&copy; Company 2017</p>
    </footer>

</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" ></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>

</body>
</html>
