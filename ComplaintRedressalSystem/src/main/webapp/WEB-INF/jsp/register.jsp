<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
    
</head>
<body>
<div class="container" style="text-align: center; padding: 2rem;" >

<div class="row">
<div class="col-md-9 offset-1">
<h1>Register</h1>
	<form action="/createuser" method="post" class="form-group">
		<input class="form-control" type="text" name="name" placeholder="Enter name" required>		<br>	
	<input class="form-control" type="email" name="email" placeholder="Enter email" required>	<br>
	<input class="form-control" type="password" name="password" placeholder="Enter password" required>
	<br><button type="submit" class="btn btn-primary" >Register</button>
</form>
<a href="home">Already a user? </a>
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