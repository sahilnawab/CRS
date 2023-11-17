<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
</head>
<body>
<div class="container text-center">
<form action="./change" method="post">
  <fieldset>
    <legend>Edit User Role</legend>
    <div class="mb-3">
      <label for="disabledTextInput" class="form-label">Email</label>
      <input type="text" id="disabledTextInput" class="form-control"  value="${email}">
    </div>
  <div class="input-group mb-3">
  <label class="input-group-text" for="inputGroupSelect01"> Select Role</label>
  <select class="form-select" id="inputGroupSelect01">
    <option selected>Customer</option>
    <option name="Engineer"  value="Engineer">Engineer</option>
    <option  name="Manager"  value="Manager">Manager</option>
    <option  name="Customer"  value="Customer">Customer</option>
  </select>
</div>
     <button type="submit" class="btn btn-primary">Submit</button>
  </fieldset>
</form>


</div>





<script
    	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
    	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
</body>
</html>