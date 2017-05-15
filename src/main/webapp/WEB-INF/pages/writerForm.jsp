<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="cammon/navigation.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="writer" content="rafael1886">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Writers details</title>
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
                Writers Details
            </h3>
        </div>
        <div class="panel-body">
            <form:form id="writerRegisterForm" cssClass="form-horizontal" modelAttribute="writer" method="post" action="/book/saveWriter">

                <div class="form-group">
                    <div class="control-label col-xs-3"><form:label path="name">Name</form:label></div>
                    <div class="col-xs-6">
                        <form:hidden path="id" value="${writerObject.id}"/>
                        <form:input cssClass="form-control" path="name" value="${writerObject.name}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertName" hidden="true">
                    <strong>Error!</strong> Enter name of the writer.
                </div>

                <div class="form-group">
                    <form:label path="surname" cssClass="control-label col-xs-3">Surname</form:label>
                    <div class="col-xs-6">
                        <form:input cssClass="form-control" path="surname" value="${writerObject.surname}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertSurname" hidden="true">
                    <strong>Error!</strong> Enter surname of the writer.
                </div>

                <div class="form-group">
                    <div class="control-label col-xs-3"><form:label path="placeOfBirth">Place of birth</form:label></div>
                    <div class="col-xs-6">
                        <form:input cssClass="form-control" path="placeOfBirth" value="${writerObject.placeOfBirth}"/>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertPlaceOfBirth" hidden="true">
                    <strong>Error!</strong> Enter place of brith.
                </div>

                <div class="form-group">
                    <div class="control-label col-xs-3"><form:label path="yearOfBirth">Years of birth</form:label></div>
                    <div class="col-xs-6">
                        <form:input cssClass="form-control" path="yearOfBirth" placeholder="YYYY-MM-DD" name="date"
                                    value="${writerObject.yearOfBirth}"/>
                    </div>
                    <div class="form-group"> <!-- Submit button -->
                        <button class="btn btn-primary " name="submit" type="submit">Submit</button>
                    </div>
                </div>
                <div class="alert alert-danger" id="alertYearOfBirth" hidden="true">
                    <strong>Error!</strong> Enter year of brith.
                </div>

                <div class="form-group">
                    <div class="row">
                        <div class="col-xs-4">
                        </div>
                        <div class="col-xs-4">
                            <input type="submit" id="saveWriter" class="btn btn-primary" value="Save" onclick="return submitWriterForm();"/>
                            <div style="" class="btn btn-warning" align="right"><a href="/book/cancelWriter">Cancel</a>
                            </div>
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

<script>
    $(document).ready(function(){
        var date_input=$('input[name="date"]'); //our date input has the name "date"
        var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
        date_input.datepicker({
            format: 'mm/dd/yyyy',
            container: container,
            todayHighlight: true,
            autoclose: true,
        })
    })
</script>