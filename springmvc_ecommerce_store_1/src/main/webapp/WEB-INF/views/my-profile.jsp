<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<!-- <meta charset='utf-8'>  -->
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>COZA STORE | PROFILE</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/resources/client/images/icons/favicon.png"/>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css' rel='stylesheet'>
<link href='https://use.fontawesome.com/releases/v5.8.1/css/all.css' rel='stylesheet'>
<link href='' rel='stylesheet'>
<script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<!--===============================================================================================-->
<style>
body {
    background: rgb(99, 39, 120)
}
.form-control:focus {
    box-shadow: none;
    border-color: #BA68C8
}
.profile-button {
    background: rgb(99, 39, 120);
    box-shadow: none;
    border: none
}
.profile-button:hover {
    background: #682773
}
.profile-button:focus {
    background: #682773;
    box-shadow: none
}
.profile-button:active {
    background: #682773;
    box-shadow: none
}
.back:hover {
    color: #682773;
    cursor: pointer
}
.labels {
    font-size: 11px
}
.add-experience:hover {
    background: #BA68C8;
    color: #fff;
    cursor: pointer;
    border: solid 1px #BA68C8
}
.dobirth{
	display: flex;
}
.dobirth input {
	width: 17%;
	color: #495057;
	border: 1px solid #ced4da;
	border-radius: .25rem;
	padding: .375rem .375rem;
	text-align: center;
}
.dobirth option {
	line-height: 1.5;
	font-size: 1rem;
}
.error {
	color: red;
}
</style>
</head>
<body oncontextmenu='return false' class='snippet-body'>
<div class="container rounded bg-white mt-5 mb-5">
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5">
	            <img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg">
	            <span class="font-weight-bold">${user.userName }</span>
	            <span class="text-black-50">${user.email }</span>
	            <span> </span>
            </div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Thông tin cá nhân</h4>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">Họ</label><input type="text" class="form-control" placeholder="First name" value="${user.firstName }" readonly="readonly">
                    <form:errors path="firstName" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-6"><label class="labels">Tên</label><input type="text" class="form-control" value="${user.lastName }" placeholder="Last name" readonly="readonly">
                    <form:errors path="lastName" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">SĐT</label><input type="text" class="form-control" placeholder="Enter phone number" value="${user.phone }" readonly="readonly">
                    <form:errors path="phone" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-12"><label class="labels">Địa chỉ</label><input type="text" class="form-control" placeholder="Enter address line" value="${user.address }" readonly="readonly">
                    <form:errors path="address" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-12">
                    	<label class="labels">Ngày sinh (DD/MM/YYYY)</label><br>
                    	<div class="dobirth">
                    		<input type="text" class="form-control" placeholder="Day" value="${user.birthDay }" readonly="readonly"><input type="text" class="form-control" placeholder="Month" value="${user.birthMonth }" readonly="readonly"><input type="text" class="form-control" placeholder="Year" value="${user.birthYear }" readonly="readonly">
                    	</div>
                    </div>
                    <div class="col-md-12"><label class="labels">Email</label><input type="email" class="form-control" placeholder="Enter email" value="${user.email }" readonly="readonly">
                    <form:errors path="email" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><label class="labels">Quốc gia</label><input type="text" class="form-control" placeholder="Country" value="${user.country }" readonly="readonly">
                    <form:errors path="country" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-6"><label class="labels">Khu vực</label><input type="text" class="form-control" value="${user.state }" placeholder="State" readonly="readonly">
                    <form:errors path="state" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="mt-5 text-center">
	                <a class="btn btn-primary profile-button" href="${pageContext.request.contextPath }/updateUser?id=${user.userId }">Update Profile</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-3 py-5">
                <div style="display: flex; justify-content: flex-end!important;" class="d-flex justify-content-between align-items-center experience">
	                <a style="background-color: rgb(239, 239, 239); text-decoration: none; color: #222;" href="${pageContext.request.contextPath }/home" class="border px-3 p-1 add-experience"><i class="fas fa-hand-point-left"></i> &nbsp;Quay lại trang chủ</a>
                	<form action="logout" method="post">
                		<button class="border px-3 p-1 add-experience">&nbsp;Đăng xuất</button>
                	</form>
                </div>
                <br>
            </div>
        </div>
    </div>
</div>
<!--===============================================================================================-->
<script type='text/javascript' src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js'></script>
<script type='text/javascript' src=''></script>
<script type='text/javascript' src=''></script>
<script type='text/Javascript'></script>
<!--===============================================================================================-->
</body>
</html>