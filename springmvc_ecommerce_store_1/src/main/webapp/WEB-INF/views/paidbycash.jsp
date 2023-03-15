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
<title>COZA STORE | CHECKOUT</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/resources/client/images/icons/favicon.png"/>
<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>
<link href='https://use.fontawesome.com/releases/v5.8.1/css/all.css' rel='stylesheet'>
<script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<!--===============================================================================================-->
<style>
body {
    background: #f9f9f9;
}
.rounded {
    border-radius: 1rem
}
.nav-pills .nav-link {
    color: #555
}
.nav-pills .nav-link.active {
    color: white
}
input[type="radio"] {
    margin-right: 5px
}
.bold {
    font-weight: bold
}
.customer-info {
	box-sizing: border-box;
	border-radius: 3px;
	padding: .75rem 1.25rem;
	width: 538px;
	background-color: rgba(0,0,0,.03);
}
.customer-info legend {
	font-size: 1.4em;
	font-weight: 600;
	border-bottom: 1px solid rgba(0,0,0,0.1);
	color: #f74877;
}
.customer-info td {
	font-size: 15.5px;
	color: #212529;
	font-weight: 500;
}
.customer-info select {
	float: right;
	width: 350px;
	color: #79818a;
	border: 1px solid rgba(0,0,0,.15);
	font-size: 1.1em;
	border-radius: .25rem;
}
.customer-info label {
	margin-top: 6px;
	line-height: 1.466667;
}
.customer-info input {
	float: right;
	width: 350px;
	border: 1px solid rgba(0,0,0,.15);
	padding: .375rem .75rem;
	margin: 8px 0px 5px;
	border-radius: .25rem;
}
.nut-bam-checkout {
	border: 0.5px solid #717fe0;
	font-size: 15px;
	font-weight: 400;
	line-height: 1.466667;
	color: #fff;
	text-transform: uppercase;
	background-color: #717fe0;
	transition: 0.4s;
}
.nut-bam-checkout:hover {
	background-color: #fff;
	border: 1px solid #717fe0;
	color: #717fe0;
	transition: 0.4s;
}
.choose-payment {
 	text-align: center;
 	font-size: 1.4em;
 	color: #f74877;
 	font-weight: 600;
 	border-bottom: 1px solid rgba(0,0,0,0.1);
 	margin-bottom: 18px;
}
.choose-option {
	border: 1px solid rgba(0,0,0,0.1);
	border-radius: .35rem;
}
.order-details {
	border: 1px solid rgba(0,0,0,.125);
	background-color: #f9f9f9;
	border-radius: 3px;
	width: 350px;
	margin-right: 30px;
}
.order-details div a {
	color: black;
}
.order-details img {
	width: 70px;
	height: 90px;
}
.order-details ul {
	list-style-type: none;
}
.cart-mini {
	display: flex;
}
.product-name {
	padding: 15px 15px 15px 0;
	width: 200px;
}
.go_back a {
	border: 1px solid #222;
	border-radius: 3px;
	padding: 1px 5px 3px 1px;
	text-decoration: none;
	color: #222;
}
.go_back a:hover {
	border: 1px solid #007bff;
	color: #007bff;
}
</style>
</head>
<body oncontextmenu='return false' class='snippet-body'>
    <div class="container py-5">
    	<div class="go_back">
    		<a href="${pageContext.request.contextPath }/shoping-cart"><i class="fas fa-hand-point-left"></i> Quay lại giỏ hàng</a>
    	</div>
    <!-- For demo purpose -->
    <div class="row mb-4">
        <div class="col-lg-8 mx-auto text-center" >
        	<a>
        		<span class="display-6" style="font-size: 40px; font-weight: 650; text-shadow: 2px 0 0 #fff, -2px 0 0 #fff, 0 2px 0 #fff, 0 -2px 0 #fff, 1px 1px #fff, -1px -1px 0 #fff, 1px -1px 0 #fff, -1px 1px 0 #fff;">
        		COZA</span>
        		<span style="width: 10px;">  </span>
        		<span style="font-size: 40px; font-weight: 400; text-shadow: 2px 0 0 #fff, -2px 0 0 #fff, 0 2px 0 #fff, 0 -2px 0 #fff, 1px 1px #fff, -1px -1px 0 #fff, 1px -1px 0 #fff, -1px 1px 0 #fff;">
        		STORE</span>
        	</a>
            <h1  ></h1><h1 ></h1>
        </div>
    </div> <!-- End -->
    <div class="row">
        <div class="col-lg-6 mx-auto">
        <form action="doCash" method="post">
            <div class="card " >
            	<div class="customer-info">
					<fieldset>
						<legend><i style="margin-right: 4px;" class="fa fa-user"></i>Thông tin khách hàng</legend>
							<table>
								<tr>
									<td style="width: 150px;">Tên khách hàng<span style="color: red;">*</span></td>
									<td><input type="text" name="customerName" placeholder="Your full name" required="required"/></td>
								</tr>
								<tr>
									<td style="width: 150px;">SĐT<span style="color: red;">*</span></td>
									<td><input type="text" name="customerPhone" placeholder="Your phone number" required="required"/></td>
								</tr>
								<tr>
									<td style="width: 150px;">Địa chỉ<span style="color: red;">*</span></td>
									<td><input type="text" name="customerAddress" placeholder="Your address" required="required"/></td>
								</tr>
								<tr>
									<td style="width: 150px;">Email<span style="color: red;">*</span></td>
									<td><input type="text" name="customerEmail" placeholder="Your email" required="required"/></td>
								</tr>
							</table>
					</fieldset>
				</div>
                <div class="card-header">
                	<h4 class="choose-payment">Phương thức thanh toán</h4>
                	<div class="choose-option">
                    <div class="bg-white shadow-sm pt-4 pl-2 pr-2 pb-2">
                        <!-- Credit card form tabs -->
                        <ul role="tablist" class="nav bg-light nav-pills rounded nav-fill mb-3">
                            <li class="nav-item"> <i style="padding-top: 10px; color: #495057;" class="fas fa-lock"></i> </li>
                            <li class="nav-item"> <i style="padding-top: 10px; color: #495057;" class="fas fa-lock"></i> </li>
                            <li class="nav-item" style="background-color: #007bff; border-radius: .25rem;"> <a data-toggle="pill" href="#net-banking" class="nav-link" style=" color: #fff;"> <i class="fas fa-dollar-sign"></i> Thanh toán khi giao hàng</a> </li>
                        </ul>
                    </div> 
                    </div>
                    <!-- End -->
                    <!-- Credit card form content -->
                    <div class="tab-content">
                    </div> 
                    <!-- End -->
                    <div id="net-banking" class="tab-pane fade pt-3"></div>
                    <div class="form-group">
                       <p> <button type="submit" class="btn btn-primary "><i class="fas fa-dollar-sign"></i> Đặt hàng</button> </p>
                    </div>
                    <!-- End -->
                </div>
            </div>
            </form>
        </div>
        <!-- Order Details -->
        <div class="order-details">
        	<div style="background-color: #e1e1e5; height: 50px;">
        		<h4 style="text-align: center; padding-top: 10px; text-transform: uppercase;font-weight: 300;">Chi tiết đặt hàng</h4>
        	</div>
        	<div class="">
				<ul style="margin: 0; padding: 0;" class="">
				<c:set var="total" value="0"></c:set>
				<c:forEach items="${sessionScope.cart }" var="item">
				<c:set var="total" value="${total + item.products.productPrice * item.order_quantity }"></c:set>
					 <li>
					 	<div class="cart-mini">
					 		<div class="header-cart-item-img">
								<img style="margin: 15px;" src="${pageContext.request.contextPath }/${item.products.image[0].path}" alt="IMG-PRODUCT">
							</div>
							<div class="product-name">
								<span>Tên:</span>
								<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04">
									 ${item.products.productName }
								</a>
								<br>
								<span>Số lượng:</span>
								<span class="header-cart-item-info">
									${item.order_quantity } 
								</span>
								<br>
								<span>Giá:</span>
								<span>
									${item.products.productPrice } VND
								</span>
							</div>
					   </div>
					</li>
				</c:forEach>
				</ul>
			</div>
			<div class="w-full">
				<div class="total" style="margin-left: 15px;">
					Tổng: ${total } VND
				</div>
			</div>
        </div>
    </div>
    </div>
<!--===============================================================================================-->    
<script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>
<script type='text/javascript' src=''></script>
<script type='text/javascript' src=''></script>
<script type='text/Javascript'>$(function() {
$('[data-toggle="tooltip"]').tooltip()
})</script>
</body>
</html>