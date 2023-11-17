<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
</head>
<body>
		<div class="container">
			<div class="row">
				<div class="col-8 offset-2">
						<div class="list-group">
  <a href="admindashboard" class="list-group-item list-group-item-action active" aria-current="true">
    Admin Dashboard
  </a>
  <a href="./showtickets" class="list-group-item list-group-item-action" style="background-color: #c0c0c0;">show existing Tickets</a>
  <a href="./ticket"  class="list-group-item list-group-item-action"style="background-color: #f0e3d7;">Create new Ticket</a>
  <a href="#" class="list-group-item list-group-item-action" style="background-color: #c0c0c0;">Edit Tickets</a>
    <a href="./useredit" class="list-group-item list-group-item-action" style="background-color:  #f0e3d7;">Show All Users</a>
  <!--<a class="list-group-item list-group-item-action disabled" aria-disabled="true">A disabled link item</a>  -->
</div>		
				</div>
			</div>
		</div>
<script
    	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
    	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
</body>
</html>