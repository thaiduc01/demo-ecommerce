<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>COZA STORE | LOGIN</title>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/resources/client/images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link href='https://use.fontawesome.com/releases/v5.8.1/css/all.css' rel='stylesheet'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/client/css/login.css">
<!--===============================================================================================-->
<style type="text/css">
.go_back a {
	border: 1px solid #222;
	border-radius: 3px;
	padding: 1px 5px 3px 1px;
	text-decoration: none;
	color: #222;
}
.go_back a:hover {
	border: 1px solid #FF4B2B;
	color: #FF4B2B;
	font-weight: 300;
}
.do-flex {
	display: flex;
	justify-content: flex-start;
	width: 845px;
}
</style>
</head>
<body>
<div class="do-flex">
	<div class="go_back">
    	<a href="${pageContext.request.contextPath }/home"><i class="fas fa-hand-point-left"></i> Quay lại trang chủ</a>
	</div>
</div>
<div>
	<a>
       <span class="display-6" style="font-size: 40px; font-weight: 650; text-shadow: 2px 0 0 #fff, -2px 0 0 #fff, 0 2px 0 #fff, 0 -2px 0 #fff, 1px 1px #fff, -1px -1px 0 #fff, 1px -1px 0 #fff, -1px 1px 0 #fff;">
       COZA</span>
       <span style="width: 10px;">  </span>
       <span style="font-size: 40px; font-weight: 400; text-shadow: 2px 0 0 #fff, -2px 0 0 #fff, 0 2px 0 #fff, 0 -2px 0 #fff, 1px 1px #fff, -1px -1px 0 #fff, 1px -1px 0 #fff, -1px 1px 0 #fff;">
       STORE</span>
    </a>
</div>
<h2>Sign In / Up Form</h2>
<span style="color: #FF4B2B;font-size: 15px; margin-bottom: 20px;">
	${message }
	${notification }
</span>
<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form:form id="regForm" modelAttribute="user" action="doRegistration" method="post">
			<h1>Create Account</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your email for registration</span>
			<form:input path="userName" name="username" id="username" placeholder="Username" required="required"></form:input>
			<form:password path="passWord" name="password" id="password" placeholder="Password" required="required"></form:password>
			<form:input type="email" path="email" name="email" id="email" placeholder="Email" required="required"></form:input>
			<form:button id="register" onclick="matchPassword" name="register">Sign Up</form:button>
		</form:form>
	</div>
	<div class="form-container sign-in-container">
		<form:form action="doLogin" method="post" modelAttribute="user">
			<h1>Sign in</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your account</span>
			<input type="text" name="username" placeholder="Username" required="required" autofocus/>
			<input type="password" name="password" placeholder="Password" required="required"/>
			<a href="#">Forgot your password?</a>
			<button type="submit">Sign In</button>
		</form:form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Hello, Friend!</h1>
				<p>Enter your personal details and start journey with us</p>
				<button class="ghost" id="signUp">Sign Up</button>
			</div>
		</div>
	</div>
</div>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath }/resources/client/js/login.js"></script>
<!--===============================================================================================-->
</body>
</html>