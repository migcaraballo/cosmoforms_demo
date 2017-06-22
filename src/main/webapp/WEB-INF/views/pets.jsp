<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Pets Demo</title>

        <link href="/cosmoforms_demo/css/united-bootstrap.min.css" rel="stylesheet">

        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <div class="container">
            <div class="row">
                <div classs="col-xs-4">
                    <h1>Pets!!!</h1>
                </div>

                <div class="col-xs-12">
                    <nav class="navbar navbar-default">
                        <div class="container-fluid">
                            <ul class="nav navbar-nav">
                                <li>
                                    <a href="/cosmoforms_demo/pets/addpet">Add Pet</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-6">

                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Pet</th>
                                <th>ID</th>
                                <th>Action</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach var="p" items="${petsList}">
                                <tr>
                                    <td><c:out value="${p.nombre}"/></td>
                                    <td><c:out value="${p._id}"/></td>
                                    <td>
                                        <a href="/cosmoforms_demo/pets/edit/${p._id}">Edit</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>

                </div>
            </div>
        </div>
    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="/cosmoforms_demo/js/bootstrap.min.js"></script>

</html>