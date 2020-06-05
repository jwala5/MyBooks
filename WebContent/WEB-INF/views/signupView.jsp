<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">

</head>
<body>
<nav>
<img src="./assets/download.png" alt="logo" >
<ul>
<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
<li><a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
</ul>
</nav>
<div class="welcome-back">GET READY FOR OXFORD</div>
<div class ="sub-text">Get Your dream college. Fall in love with the world.</div>
<img class="login-illustration" src="./assets/download 2.png" alt="image">
<div class="signup-form">
<div class="title">Sign Up</div>
<form action="${pageContext.request.contextPath}/signup" method="post">
<label class="label" for="email">Email</label>
<input type="text" name="email" id="email">
<label class="label" for="password">Password</label>
<input type="text" name="password" id="password">
<div class="password-hint">Must consist of atleast 8 characters,a symbol,an uppercase,a lowercase letter</div>
<label class="label" for="password">Confirm Password</label>
<input type="text" name="Confirm Password" id="password">
${message}
<button class="button" type="submit">Sign In</button>
</form>
</div>
</body>
</html>