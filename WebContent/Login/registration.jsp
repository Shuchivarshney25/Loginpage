<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<script src="js/registration.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"><link>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.5/validator.min.js"></script>
</head>
<body>
     <div class="container">
     <h2> SIGN UP HERE</h2>
    <form data-toggle="validator" role="form" action="/Loginpage/registration" method="post" enctype="multipart/form-data">
       <div class="form-group">
          <label for="fname">FIRST NAME:</label>
          <input class="form-control" data-error="Please enter first name field." name="fname" placeholder=" FIRST NAME"  type="text" required />
          <div class="help-block with-errors"></div>
        </div>
       <div class="form-group">
      <label for="lname">LAST NAME:</label>
      <input class="form-control" data-error="Please enter last name field." name="lname" placeholder="LAST NAME"  type="text" required />
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label for="uname">USER NAME:</label>
      <input class="form-control"  pattern="^[_A-z0-9]{1,}$"  maxlength="15" data-error="Please enter User name field." name="uname" placeholder="USER NAME"  type="text" required />
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label for="emaiL">EMAIL-ID:</label>
      <input type="email" class="form-control" name="userid" placeholder="EMAIL" required>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label for="userpass">PASSWORD:</label>
      <input type="password" data-minlength="5" class="form-control" name="userpass" data-error="must enter minimum of 5 characters" placeholder="PASSWORD" required>
      <div class="help-block with-errors"></div>
    </div>
     <div class="form-group">
      <label for="photo">PORTRAIT PHOTO:</label>
      <input type="file" class="form-control" name="photo" placeholder="PASTE PHOTO" size="50">
      </div>
    <button type="submit" class="btn btn-default">Submit</button>
  	<div class="form-group">
       <span>Already registered!! <a href="http://localhost:8080/Loginpage/Login/Index.jsp">Login Here</a></span>
    </div>  
  </form>
</div>
</body>
</html>