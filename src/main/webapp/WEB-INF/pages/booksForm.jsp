<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="cammon/navigation.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="books" content="rafael1886">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books details</title>
    <!-- Bootstrap CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                Book Details
            </h3>
        </div>
        <div class="panel-body">
            <form:form id="booksRegisterForm" cssClass="form-horizontal" modelAttribute="books" method="post" action="/book/saveBooks">

                <div class="form-group">
                    <div class="control-label col-xs-3"> <form:label path="title" >Title</form:label> </div>
                    <div class="col-xs-6">
                        <form:hidden path="id" value="${booksObject.id}"/>
                        <form:input cssClass="form-control" path="title" value="${booksObject.title}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertTitle" hidden="true">
                    <strong>Error!</strong> Enter title of the book.
                </div>

                <div class="form-group">
                    <form:label path="publicationDate" cssClass="control-label col-xs-3">Publication date</form:label>
                    <div class="col-xs-6">
                        <form:input cssClass="form-control" path="publicationDate" value="${booksObject.publicationDate}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertPublicationDate" hidden="true">
                    <strong>Error!</strong> Enter publication date of the book.
                </div>

                <div class="form-group">
                    <div class="control-label col-xs-3"><form:label path="category">Category</form:label></div>
                    <div class="col-xs-6">
                        <form:input cssClass="form-control" path="category" value="${booksObject.category}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertCategory" hidden="true">
                    <strong>Error!</strong> Enter category of the book.
                </div>

                <div class="form-group">
                    <div class="row">
                        <div class="col-xs-4">
                        </div>
                        <div class="col-xs-4">
                            <input type="submit" id="saveBooks" class="btn btn-primary" value="Save" onclick="return submitBooksForm();"/>
                            <div style="" class="btn btn-warning" align="right"><a href="/book/cancelBooks">Cancel</a> </div>
                        </div>
                        <div class="col-xs-4">
                        </div>
                    </div>
                </div>

            </form:form>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/functionBook.js"/>"></script>
</body>
</html>