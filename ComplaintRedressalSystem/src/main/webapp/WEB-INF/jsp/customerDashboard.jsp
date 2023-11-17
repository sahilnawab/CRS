<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>
<link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">GTPL</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="aboutus">About us</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Action
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="home">Logout</a>
          <a class="dropdown-item" href="support">Contact us</a>
         
        </div>
      </li>
    </ul>
  </div>
</nav>

<div class= "container" >
<div class="row "   >
<div class="col-9 offset-2" >
<h1  class="border border-primary" style="border-radius: 2px; padding: 2px;">Hello ${sessionScope.user.name.toUpperCase()} Welcome To Your Dashboard</h1>
<div class="list-group">
  <a href="customerDashboard" class="list-group-item list-group-item-action active" aria-current="true">
    Customer Dashboard
  </a>
  <a href="./showtickets" class="list-group-item list-group-item-action" style="background-color: #c0c0c0;">show existing Tickets</a>
  <a href="./ticket"  class="list-group-item list-group-item-action"style="background-color: #f0e3d7;">Create new Ticket</a>
  <a href="#" class="list-group-item list-group-item-action" style="background-color: #c0c0c0;">Edit Tickets</a>
  <!--<a class="list-group-item list-group-item-action disabled" aria-disabled="true">A disabled link item</a>  -->
</div>
</div>
  </div>
<p class="text text-danger">${ticket}</p>
</div>
<div class="container">
<div class="col-8 offset-2">
	<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Title</th>
      <th scope="col">Description</th>
      <th scope="col">Status</th>
    </tr>
  </thead>
  <tbody >
   <c:forEach items="${list}" var="ticket">
    <tr>

      <th scope="row">${ticket.id}</th>
      <td>${ticket.title}</td>
      <td>${ticket.description}</td>
<td style="color: green;" >${ticket.isActive}</td>
    </tr>
     </c:forEach>  
  </tbody>
</table>
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