<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
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
.dobirth select {
	color: #495057;
	border: 1px solid #ced4da;
	border-radius: .25rem;
	padding: .375rem .375rem;
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
                <form:form action="doUpdateUser" method="post" modelAttribute="user">
                <div class="row mt-2">
                	<form:input type="hidden" path="userId"/>
                	<form:input type="hidden" path="userName"/>
                	<form:input type="hidden" path="passWord"/>
                    <div class="col-md-6">
	                    <label class="labels">Họ</label>
	                    <form:input path="firstName" type="text" class="form-control" placeholder="First name"/>
	                    <form:errors path="firstName" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-6">
	                    <label class="labels">Tên</label>
	                    <form:input path="lastName" type="text" class="form-control" placeholder="Last name"/>
	                    <form:errors path="lastName" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12">
	                    <label class="labels">SĐT</label>
	                    <form:input path="phone" type="text" class="form-control" placeholder="Enter phone number"/>
	                    <form:errors path="phone" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-12">
	                    <label class="labels">Địa chỉ</label>
	                    <form:input path="address" type="text" class="form-control" placeholder="Enter address line"/>
	                    <form:errors path="address" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-12">
                    	<label class="labels">Ngày sinh</label><br>
                    	<div class="dobirth">
                    	<form:select path="birthDay">
							<form:option value="0">Day</form:option>
							<form:option value="1">1</form:option>
							<form:option value="2">2</form:option>
							<form:option value="3">3</form:option>
							<form:option value="4">4</form:option>
							<form:option value="5">5</form:option>
							<form:option value="6">6</form:option>
							<form:option value="7">7</form:option>
							<form:option value="8">8</form:option>
							<form:option value="9">9</form:option>
							<form:option value="10">10</form:option>
							<form:option value="11">11</form:option>
							<form:option value="12">12</form:option>
							<form:option value="13">13</form:option>
							<form:option value="14">14</form:option>
							<form:option value="15">15</form:option>
							<form:option value="16">16</form:option>
							<form:option value="17">17</form:option>
							<form:option value="18">18</form:option>
							<form:option value="19">19</form:option>
							<form:option value="20">20</form:option>
							<form:option value="21">21</form:option>
							<form:option value="22">22</form:option>
							<form:option value="23">23</form:option>
							<form:option value="24">24</form:option>
							<form:option value="25">25</form:option>
							<form:option value="26">26</form:option>
							<form:option value="27">27</form:option>
							<form:option value="28">28</form:option>
							<form:option value="29">29</form:option>
							<form:option value="30">30</form:option>
							<form:option value="31">31</form:option>
						</form:select>
						<form:select path="birthMonth">
							<form:option value="0">Month</form:option>
							<form:option value="1">1</form:option>
							<form:option value="2">2</form:option>
							<form:option value="3">3</form:option>
							<form:option value="4">4</form:option>
							<form:option value="5">5</form:option>
							<form:option value="6">6</form:option>
							<form:option value="7">7</form:option>
							<form:option value="8">8</form:option>
							<form:option value="9">9</form:option>
							<form:option value="10">10</form:option>
							<form:option value="11">11</form:option>
							<form:option value="12">12</form:option>
						</form:select>
						<form:select path="birthYear">
							<form:option value="0">Year</form:option>
							<form:option value="1980">1980</form:option>
							<form:option value="1981">1981</form:option>
							<form:option value="1982">1982</form:option>
							<form:option value="1983">1983</form:option>
							<form:option value="1984">1984</form:option>
							<form:option value="1985">1985</form:option>
							<form:option value="1986">1986</form:option>
							<form:option value="1987">1987</form:option>
							<form:option value="1988">1988</form:option>
							<form:option value="1989">1989</form:option>
							<form:option value="1990">1990</form:option>
							<form:option value="1991">1991</form:option>
							<form:option value="1992">1992</form:option>
							<form:option value="1993">1993</form:option>
							<form:option value="1994">1994</form:option>
							<form:option value="1995">1995</form:option>
							<form:option value="1996">1996</form:option>
							<form:option value="1997">1997</form:option>
							<form:option value="1998">1998</form:option>
							<form:option value="1999">1999</form:option>
							<form:option value="2000">2000</form:option>
							<form:option value="2001">2001</form:option>
							<form:option value="2002">2002</form:option>
							<form:option value="2003">2003</form:option>
							<form:option value="2004">2004</form:option>
							<form:option value="2005">2005</form:option>
							<form:option value="2006">2006</form:option>
							<form:option value="2007">2007</form:option>
							<form:option value="2008">2008</form:option>
							<form:option value="2009">2009</form:option>
							<form:option value="2010">2010</form:option>
							<form:option value="2011">2011</form:option>
							<form:option value="2012">2012</form:option>
							<form:option value="2013">2013</form:option>
							<form:option value="2014">2014</form:option>
							<form:option value="2015">2015</form:option>
							<form:option value="2016">2016</form:option>
							<form:option value="2017">2017</form:option>
							<form:option value="2018">2018</form:option>
							<form:option value="2019">2019</form:option>
							<form:option value="2020">2020</form:option>
							<form:option value="2021">2021</form:option>
							<form:option value="2022">2022</form:option>
						</form:select>
                    	</div>
                    </div>
                    <div class="col-md-12">
	                    <label class="labels">Email</label>
	                    <form:input path="email" type="email" class="form-control" placeholder="Enter email"/>
	                    <form:errors path="email" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6">
	                    <label class="labels">Quốc gia</label>
	                    <form:input path="country" type="text" class="form-control" placeholder="Country"/>
	                    <form:errors path="country" cssClass="error"></form:errors>
                    </div>
                    <div class="col-md-6">
	                    <label class="labels">Khu vực</label>
	                    <form:input path="state" type="text" class="form-control" placeholder="State"/>
	                    <form:errors path="state" cssClass="error"></form:errors>
                    </div>
                </div>
                <div class="mt-5 text-center">
	                <button class="btn btn-primary profile-button" type="submit">Save Profile</button>
                </div>
                </form:form>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-3 py-5">
                <div style="display: flex; justify-content: flex-end!important;" class="d-flex justify-content-between align-items-center experience">
                	<a style="background-color: rgb(239, 239, 239); text-decoration: none; color: #222;" href="${pageContext.request.contextPath }/home" class="border px-3 p-1 add-experience"><i class="fas fa-hand-point-left"></i> &nbsp;Quay lại trang chủ</a>
                </div>
                <br>
            </div>
        </div>
    </div>
</div>
<script type='text/javascript' src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js'></script>
<script type='text/javascript' src=''></script>
<script type='text/javascript' src=''></script>
<script type='text/Javascript'></script>
</body>
</html>