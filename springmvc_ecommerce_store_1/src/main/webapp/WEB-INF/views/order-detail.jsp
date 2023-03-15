<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>COZA STORE'S MANAGEMENT PAGE | ORDER DETAIL</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="${pageContext.request.contextPath }/resources/admin/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/admin/css/magnific-popup.css">
<link href="${pageContext.request.contextPath }/resources/admin/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!--js-->
<script src="${pageContext.request.contextPath }/resources/admin/js/jquery-2.1.1.min.js"></script> 
<!--icons-css-->
<link href="${pageContext.request.contextPath }/resources/admin/css/font-awesome.css" rel="stylesheet"> 
<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
<link href='https://use.fontawesome.com/releases/v5.8.1/css/all.css' rel='stylesheet'>
<!--//skycons-icons-->
<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/resources/client/images/icons/favicon.png"/>
<style type="text/css">
.form-css {
 margin-left: 30px;
 width: 90%;
}
.form-css table {
 font-family: 'Carrois Gothic', sans-serif;
}
.main {
    border-collapse: separate !important;
    border-spacing: 0 11px !important
}
tr {
    border: 1px solid #eee
}
.head th {
    font-weight: 500
}
tr:nth-child(3) {
    border: solid thin
}
.form-check-input:focus {
    border-color: #8bbafe;
    outline: 0;
    box-shadow: none
}
.btn {
    height: 27px;
    line-height: 11px;
    color: #fff
}
.form-check-input {
    width: 1.15em;
    height: 1.15em;
    margin-top: 3px
}
.btn:focus {
    color: #fff;
    box-shadow: none !important
}
.order-color {
    color: blue
}
.paging-area {
 margin-top: 10px;
}
.go_back a {
	border: 1px solid #68AE00;
	border-radius: 3px;
	padding: 1px 5px 3px 1px;
	text-decoration: none;
	color: #68AE00;
	font-size: 20px;
}
.go_back a:hover {
	border: 1px solid #007bff;
	color: #007bff;
}
</style>
</head>
<body style="height: 796px;">
<div class="page-container">	
   <div class="left-content">
	   <div class="mother-grid-inner">
            <!--header start here-->
				<div class="header-main">
					<div class="header-left">
							<div class="logo-name">
								  <a href="${pageContext.request.contextPath }/admin">
									  <img style="margin-top: 15px;" id="logo" src="${pageContext.request.contextPath }/resources/client/images/icons/logo-01.png" alt="Logo"/>
								  </a> 								
							</div>
							<!--search-box-->
								<div class="search-box">
									<form action="">
										<input name="keyword" type="text" placeholder="Search...">	
										<input type="submit" value="">					
									</form>
								</div>
							<!--//end-search-box-->
							<div class="clearfix"> </div>
						 </div>
						 <div class="header-right">
							
							<!--notification menu end -->
							<div class="profile_details">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img style="width: 40px; height:40px; border-radius: 50%; margin-top: 5px;" src="${pageContext.request.contextPath }/resources/admin/images/avatar2.jpg" alt=""> </span> 
												<div class="user-name">
													<p>Đình Đức</p>
													<span>Administrator</span>
												</div>
												<i class="fa fa-angle-down lnr"></i>
												<i class="fa fa-angle-up lnr"></i>
												<div class="clearfix"></div>	
											</div>	
										</a>
										<ul class="dropdown-menu drp-mnu">
											<li> <a href="#"><i class="fa fa-cog"></i> Settings</a> </li> 
											<li> <a href="#"><i class="fa fa-user"></i> Profile</a> </li> 
											<li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
										</ul>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>				
						</div>
				     <div class="clearfix"> </div>	
				</div>
<!--heder end here-->
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		</script>
<!-- /script-for sticky-nav -->
<!--inner block start here-->
<div class="inner-block" style="height: 746px;">
    <div class="product-block">
    	<div class="pro-head">
    		<h2 style="font-weight: bold; margin: 1px 1px;">Chi tiết đặt hàng
    			<div style="font-size: 17px;" class="shop-menu pull-right">
					<ul class="nav navbar-nav">
						<li>
							<div class="go_back">
    							<a href="${pageContext.request.contextPath }/order-list"><i class="fas fa-hand-point-left"></i> Quay lại</a>
    						</div>
						</li>
					</ul>
				</div>
    		</h2>
    	</div>
    	<div class="form-css">
    		<table class="table table-borderless main">
        		<thead>
            		<tr class="head">
                		<th scope="col">ID</th>
                		<th scope="col"></th>
                		<th scope="col">Tên</th>
                		<th scope="col">Số lượng</th>
                		<th scope="col">Giá</th>
                		<th scope="col">Tổng</th>
            		</tr>
        		</thead>
        		<tbody>
        			<c:set var="total" value="0"></c:set>
					<c:forEach items="${listOrderDetail }" var="item">
					<c:set var="total" value="${total + item.products.productPrice * item.order_quantity }"></c:set>
            		<tr class="rounded bg-white">
                		<td style="margin-left: 20%;" class="order-color">${item.orderdetail_id }</td>
                		<td style="text-align: center;"><img style="width: 50px; height: 60px;" src="${pageContext.request.contextPath }/${item.products.image[0].path}" alt="IMG-PRODUCT"></td>
                		<td>${item.products.productName }</td>
                		<td class="d-flex align-items-center">${item.order_quantity }</td>
                		<td>${item.products.productPrice }</td>
                		<td>${item.products.productPrice * item.order_quantity } VND</td>
            		</tr>
            		</c:forEach>
            		<tr>
						<th colspan="5">Summary:</th>
						<th>${total } VDN</th>
					</tr>
            	</tbody>
        	</table>
    	</div>    	
    <div class="clearfix"> </div>
    </div>
</div>
<!--inner block end here-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/admin/js/nivo-lightbox.min.js"></script>
			<script type="text/javascript">
				$(document).ready(function(){
				    $('#nivo-lightbox-demo a').nivoLightbox({ effect: 'fade' });
				});
			</script>
<div class="copyrights">
</div>	
</div>
</div>
<!--slider menu-->
    <div class="sidebar-menu">
		  	<div class="logo"> <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="#"> <span id="logo" ></span> 
			  </a> </div>		  
		    <div class="menu">
		      <ul id="menu" >
		        <li id="menu-home" ><a href="${pageContext.request.contextPath }/admin"><i class="fa fa-tachometer"></i><span></span></a></li>
		        <li><a href="#"><i class="fa fa-shopping-cart"></i><span>E-Commerce</span><span class="fa fa-angle-right" style="float: right"></span></a>
		         	<ul id="menu-academico-sub" >
			            <li id="menu-academico-avaliacoes" ><a href="${pageContext.request.contextPath }/product-list">Danh sách sản phẩm</a></li>
			            <li id="menu-academico-boletim" ><a href="${pageContext.request.contextPath }/order-list">Danh sách đặt hàng</a></li>
			            <li><a href="${pageContext.request.contextPath }/user-list">Danh sách khách hàng</a></li>
		             </ul>
		        </li>
		        
		        <li id="menu-academico" ><a href="#"><i class="fa fa-file-text"></i><span>Trang</span><span class="fa fa-angle-right" style="float: right"></span></a>
		          <ul id="menu-academico-sub" >
		          	 <li id="menu-academico-boletim" ><a href="${pageContext.request.contextPath }/shop">Shop</a></li>
		            <li id="menu-academico-avaliacoes" ><a href="${pageContext.request.contextPath }/home">Home</a></li>		           
		          </ul>
		        </li>
		        <li><a href="#"><i class="fa fa-cog"></i><span>Hệ thống</span><span class="fa fa-angle-right" style="float: right"></span></a>
		         	 <ul id="menu-academico-sub" >
			            <li id="menu-academico-avaliacoes" ><a href="#">404</a></li>
			            <li id="menu-academico-boletim" ><a href="#">Trống</a></li>
		             </ul>
		        </li>
		      </ul>
		    </div>
	 </div>
	<div class="clearfix"> </div>
</div>
<!--slide bar menu end here-->
<script>
var toggle = true;
            
$(".sidebar-icon").click(function() {                
  if (toggle)
  {
    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
    $("#menu span").css({"position":"absolute"});
  }
  else
  {
    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
    setTimeout(function() {
      $("#menu span").css({"position":"relative"});
    }, 400);
  }               
                toggle = !toggle;
            });
</script>
<!--scrolling js-->
		<script src="${pageContext.request.contextPath }/resources/admin/js/jquery.nicescroll.js"></script>
		<script src="${pageContext.request.contextPath }/resources/admin/js/scripts.js"></script>
<!--//scrolling js-->
<script src="${pageContext.request.contextPath }/resources/admin/js/bootstrap.js"> </script>
<!-- mother grid end here-->
</body>
</html>