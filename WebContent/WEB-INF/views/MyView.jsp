<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My View</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">

</head>
<body>
<nav>
<img src="./assets/download.png" alt="logo" >
<ul>
<li><a href="${pageContext.request.contextPath}/book">Books</a></li>
<li><a href="${pageContext.request.contextPath}/extras">Extras</a></li>
</ul>
</nav>
<div class="welcome-back">Enter Your Details</div>
<div class ="sub-text">Please be thorough</div>
<img class="login-illustration" src="./assets/download3.jfif" alt="image">

<div class="blog-form">
<div class="title">Your Details</div>
<form action="${pageContext.request.contextPath}/myview" method="post">
<label class="label" for="name">Name</label>
<input type="text" name="name" id="name">
<label class="label" for="rollno">RollNo</label>
<input type="text" name="rollno" id="rollno">
<label class="label" for="address">Address</label>
<input type="text" name="address" id="address">
<div class="gender">
<label class="label" for="gender"><h5>Gender</h5></label>
<input type="radio" id="name" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="name" name="gender" value="female">
<label for="female">Female</label><br>
<input type="radio" id="name" name="gender" value="other">
<label for="other">Other</label>


</div>
<button class="button" type="submit">Submit</button>
</form>
</div>
</body>
</html>