<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>COZA STORE'S MANAGEMENT PAGE | ADD PRODUCT</title>
<meta charset ="ISO-8859-1" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="keywords"
	content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link
	href="${pageContext.request.contextPath }/resources/admin/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/admin/css/magnific-popup.css">
<link
	href="${pageContext.request.contextPath }/resources/admin/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<!--js-->
<script
	src="${pageContext.request.contextPath }/resources/admin/js/jquery-2.1.1.min.js"></script>
<!--icons-css-->
<link
	href="${pageContext.request.contextPath }/resources/admin/css/font-awesome.css"
	rel="stylesheet">
<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Carrois+Gothic'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Work+Sans:400,500,600'
	rel='stylesheet' type='text/css'>
<!--//skycons-icons-->
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath }/resources/client/images/icons/favicon.png" />
<style type="text/css">
.form-css {
	margin-left: 30px;
}


.form-css div {
	width: 40%;
	margin: -22px;
	padding: 5px;
}

.nut-bam {
	font-size: 13px;
	color: white;
	height: 36px;
	width: 100px;
	line-height: 1;
	text-transform: uppercase;
	font-weight: bold;
	border-radius: 23px;
	border-color: #68AE00;
	background-color: #68AE00;
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

.error {
	color: red;
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
							<a href="${pageContext.request.contextPath }/admin"> <img
								style="margin-top: 15px;" id="logo"
								src="${pageContext.request.contextPath }/resources/client/images/icons/logo-01.png"
								alt="Logo" />
							</a>
						</div>
						<!--search-box-->
						<div class="search-box">
							<form>
								<input type="text" placeholder="Search..." required="required">
								<input type="submit" value="">
							</form>
						</div>
						<!--//end-search-box-->
						<div class="clearfix"></div>
					</div>
					<div class="header-right">
						<div class="profile_details_left">
							<!--notifications of menu start -->
							<ul class="nofitications-dropdown">
								<li class="dropdown head-dpdn"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false"><i class="fa fa-envelope"></i><span
										class="badge">3</span></a>
									<ul class="dropdown-menu">
										<li>
											<div class="notification_header">
												<h3>You have 3 new messages</h3>
											</div>
										</li>
										<li><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p4.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li class="odd"><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p2.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p3.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li>
											<div class="notification_bottom">
												<a href="#">See all messages</a>
											</div>
										</li>
									</ul></li>
								<li class="dropdown head-dpdn"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false"><i class="fa fa-bell"></i><span
										class="badge blue">3</span></a>
									<ul class="dropdown-menu">
										<li>
											<div class="notification_header">
												<h3>You have 3 new notification</h3>
											</div>
										</li>
										<li><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p5.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li class="odd"><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p6.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li><a href="#">
												<div class="user_img">
													<img
														src="${pageContext.request.contextPath }/resources/admin/images/p7.png"
														alt="">
												</div>
												<div class="notification_desc">
													<p>Lorem ipsum dolor</p>
													<p>
														<span>1 hour ago</span>
													</p>
												</div>
												<div class="clearfix"></div>
										</a></li>
										<li>
											<div class="notification_bottom">
												<a href="#">See all notifications</a>
											</div>
										</li>
									</ul></li>
								<li class="dropdown head-dpdn"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false"><i class="fa fa-tasks"></i><span
										class="badge blue1">9</span></a>
									<ul class="dropdown-menu">
										<li>
											<div class="notification_header">
												<h3>You have 8 pending task</h3>
											</div>
										</li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Database update</span><span
														class="percentage">40%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar yellow" style="width: 40%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Dashboard done</span><span
														class="percentage">90%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar green" style="width: 90%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Mobile App</span><span
														class="percentage">33%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar red" style="width: 33%;"></div>
												</div>
										</a></li>
										<li><a href="#">
												<div class="task-info">
													<span class="task-desc">Issues fixed</span><span
														class="percentage">80%</span>
													<div class="clearfix"></div>
												</div>
												<div class="progress progress-striped active">
													<div class="bar  blue" style="width: 80%;"></div>
												</div>
										</a></li>
										<li>
											<div class="notification_bottom">
												<a href="#">See all pending tasks</a>
											</div>
										</li>
									</ul></li>
							</ul>
							<div class="clearfix"></div>
						</div>
						<!--notification menu end -->
						<div class="profile_details">
							<ul>
								<li class="dropdown profile_details_drop"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false">
										<div class="profile_img">
											<span class="prfil-img"><img
												style="width: 40px; height: 40px; border-radius: 50%; margin-top: 5px;"
												src="${pageContext.request.contextPath }/resources/admin/images/avatar2.jpg"
												alt=""> </span>
											<div class="user-name">
												<p>Đình Đức</p>
												<span>Administrator</span>
											</div>
											<i class="fa fa-angle-down lnr"></i> <i
												class="fa fa-angle-up lnr"></i>
											<div class="clearfix"></div>
										</div>
								</a>
									<ul class="dropdown-menu drp-mnu">
										<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
										<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
										<li><a href="#"><i class="fa fa-sign-out"></i> Logout</a>
										</li>
									</ul></li>
							</ul>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--heder end here-->
				<!-- script-for sticky-nav -->
				<script>
					$(document).ready(function() {
						var navoffeset = $(".header-main").offset().top;
						$(window).scroll(function() {
							var scrollpos = $(window).scrollTop();
							if (scrollpos >= navoffeset) {
								$(".header-main").addClass("fixed");
							} else {
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
							<h2 style="font-weight: bold;">
								Thêm Sản Phẩm
								<div style="font-size: 17px;" class="shop-menu pull-right">
									<ul class="nav navbar-nav">
										<li>
											<div class="go_back">
												<a href="${pageContext.request.contextPath }/product-list"><i
													class="fas fa-hand-point-left"></i> Quay lại</a>
											</div>
										</li>
									</ul>
								</div>
							</h2>
						</div>
						<div class="form-css">
							<form:form action="doAddProduct" method="post"
								modelAttribute="product" enctype="multipart/form-data">
								<div>
								<form:errors path="productName" cssClass="error"></form:errors>
									<p>Tên Sản Phẩm:
									<form:input style="float: right; width: 60%;"
										path="productName" /></p>
									
									<br />
								</div>
								<div>
								<form:errors path="productPrice" cssClass="error"></form:errors>
									<p>Giá Sản Phẩm:
									<form:input style="float: right; width: 60%;"
										path="productPrice" /></p>
									
									<br />
								</div>
								<div>
								<form:errors path="sex" cssClass="error"></form:errors>
									<p>Giới Tính:
									<!--<form:select style="float: right; width: 60%;" path="sex">
										<form:option value="0">Giới tính</form:option>
										<form:option value="1">Nam</form:option>
										<form:option value="2">Nữ</form:option>
									</form:select>-->
									<form:radiobutton path="sex" value="1" />
									Nam
									<form:radiobutton path="sex" value="2" />
									Nữ</p>
									
									
									<br />
								</div>
								<div>
								<form:errors path="productDescription" cssClass="error"></form:errors>
									<p>Mô Tả Sản Phẩm:
									<form:input style="float: right; width: 60%;"
										path="productDescription" /></p>
									
									<br />
								</div>
								<div>
								<p>
									Danh Mục:
									<form:select style="float: right; width: 60%;"
										path="category.categoryID">
										<form:option value="0">Danh sách danh mục</form:option>
										<c:forEach items="${listCategory}" var="item">
											<form:option value="${item.categoryID }">${item.categoryName }</form:option>
										</c:forEach>
									</form:select></p>
									<form:errors path="category" cssClass="error"></form:errors>
									<br />
								</div>
								<div>
								<p>
									Nhà Cung Cấp:
									<form:select style="float: right; width: 60%;"
										path="supplier.supplierID">
										<form:option value="0">Danh sách nhà cung cấp</form:option>
										<c:forEach items="${listSupplier}" var="item">
											<form:option value="${item.supplierID }">${item.supplierName }</form:option>
										</c:forEach>
									</form:select></p>
									<form:errors path="supplier" cssClass="error"></form:errors>
									<br />
								</div>
								<div>
								<p>
									Ảnh: <input type="file" name="multipartFile"
										multiple="multiple" /></p>
									<br />
								</div>
								<div>
								<p>
									<input style="float: right;" class="nut-bam" type="submit"
										value="submit" /></p>
								</div>
							</form:form>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<!--inner block end here-->
				<script type="text/javascript"
					src="${pageContext.request.contextPath }/resources/admin/js/nivo-lightbox.min.js"></script>
				<script type="text/javascript">
					$(document).ready(function() {
						$('#nivo-lightbox-demo a').nivoLightbox({
							effect : 'fade'
						});
					});
				</script>
				<div class="copyrights"></div>
			</div>
		</div>
		<!--slider menu-->
		<div class="sidebar-menu">
			<div class="logo">
				<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
				</a> <a href="${pageContext.request.contextPath }/home"> <span
					id="logo"></span>
				</a>
			</div>
			<div class="menu">
				<ul id="menu">
					<li id="menu-home"><a
						href="${pageContext.request.contextPath }/admin"><i
							class="fa fa-tachometer"></i><span>Bảng chi tiết</span></a></li>
					<li><a href="#"><i class="fa fa-shopping-cart"></i><span>E-Commerce</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a
								href="${pageContext.request.contextPath }/product-list">Danh
									Sách Sản Phẩm</a></li>
							<li id="menu-academico-boletim"><a
								href="${pageContext.request.contextPath }/order-list">Danh
									Sách Đặt Hàng</a></li>
							<li><a href="${pageContext.request.contextPath }/user-list">Danh
									Sách Khách Hàng</a></li>
						</ul></li>

					<li id="menu-academico"><a href="#"><i
							class="fa fa-file-text"></i><span>Trang</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-boletim"><a
								href="${pageContext.request.contextPath }/shop">Shop</a></li>
							<li id="menu-academico-avaliacoes"><a
								href="${pageContext.request.contextPath }/home">Trang Chủ</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-cog"></i><span>Hệ
								thống</span><span class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="#">404</a></li>
							<li id="menu-academico-boletim"><a href="#">Trống</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<!--slide bar menu end here-->
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}
					toggle = !toggle;
				});
	</script>
	<!--scrolling js-->
	<script
		src="${pageContext.request.contextPath }/resources/admin/js/jquery.nicescroll.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/admin/js/scripts.js"></script>
	<!--//scrolling js-->
	<script
		src="${pageContext.request.contextPath }/resources/admin/js/bootstrap.js">
		
	</script>
	<!-- mother grid end here-->
</body>
</html>