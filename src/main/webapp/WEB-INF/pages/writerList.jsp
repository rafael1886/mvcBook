<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Writers </title>
    <!-- Bootstrap CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Lists of writers</b></div>
                <div align="right"><a href="/book/createWriter">Add new writer</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty writerList}">
                Empty Writers.
            </c:if>
            <c:if test="${not empty writerList}">
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Id</th>
                        <th>name</th>
                        <th>surname</th>
                        <th>Place of birth</th>
                        <th>Year of birth</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>

                    </thead>
                    <tbody>
                    <c:forEach items="${writerList}" var="a">
                        <tr>
                            <td><c:out value="${a.id}"/></td>
                            <td><c:out value="${a.name}"/></td>
                            <td><c:out value="${a.surname}"/></td>
                            <td><c:out value="${a.placeOfBirth}"/></td>
                            <td><c:out value="${a.yearOfBirth}"/></td>

                            <td><a href="/book/editWriter/${a.id}?id=${a.id}">Edit</a></td>
                            <td><a href="/book/deleteWriter?id=${a.id}">Delete</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/writer.js"/>"></script>
</body>
</html>