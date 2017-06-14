<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/index.js"></script>
</head>
<body>
	<div class="container">
		<section id="content">
		<form action="/Loginpage/login" method="post">
			<h1>LOGIN</h1>
			<div>
				<input type="text" placeholder="UserID" required="" id="userid" name="userid"/>
			</div>
			<div>
				<input type="password" placeholder="Password" required="" id="userpass" name ="userpass"/>
			</div>
			<div>
				<input type="submit" value="Login" /> <a href="#">Lost your
					password?</a> <a href="http://localhost:8080/Loginpage/Login/registration.jsp">Register</a>
			</div>
		</form>
		<!-- form -->
		<div class="button">

		</div>
		<!-- button --> </section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html>