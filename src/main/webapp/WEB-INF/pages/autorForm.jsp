<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="rafael">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Autorzy szczegoly</title>
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
        Employee Details
      </h3>
    </div>
    <div class="panel-body">
      <form:form id="autorRegisterForm" cssClass="form-horizontal" modelAttribute="autor" method="post" action="/saveAutor">

        <div class="form-group">
          <div class="control-label col-xs-3"> <form:label path="imie" >Imię</form:label> </div>
          <div class="col-xs-6">
            <form:hidden path="id" value="${autorObject.id}"/>
            <form:input cssClass="form-control" path="imie" value="${autorObject.imie}"/>
          </div>
        </div>

        <div class="form-group">
          <form:label path="nazwisko" cssClass="control-label col-xs-3">Nazwisko</form:label>
          <div class="col-xs-6">
            <form:input cssClass="form-control" path="nazwisko" value="${autorObject.nazwisko}"/>
          </div>
        </div>

        <div class="form-group">
          <div class="control-label col-xs-3"><form:label path="miejsceUrodzenia">Miejsce urodzenia</form:label></div>
          <div class="col-xs-6">
            <form:input cssClass="form-control" path="miejsceUrodzenia" value="${autorObject.miejsceUrodzenia}"/>
          </div>
        </div>

        <div class="form-group">
          <div class="control-label col-xs-3"><form:label path="rokUrodzenia">Rok urodzenia</form:label></div>
          <div class="col-xs-6">
            <form:input cssClass="form-control" path="rokUrodzenia" value="${autorObject.rokUrodzenia}"/>
          </div>
        </div>

        <div class="form-group">
          <div class="row">
            <div class="col-xs-4">
            </div>
            <div class="col-xs-4">
              <input type="submit" id="saveAutor" class="btn btn-primary" value="Save" onclick="return submitAutorForm();"/>
              <div style="" class="btn " align="right"><a href="/anulujAutor">Anuluj</a></div>
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
<script src="<c:url value="/resources/js/autor.js"/>"></script>

</body>
</html>