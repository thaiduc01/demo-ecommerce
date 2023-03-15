<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>COZA STORE'S MANAGEMENT PAGE | UPDATE PRODUCT</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
	margin: 5px;
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
												<p>DINH DUC</p>
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
								Update Product
								<div style="font-size: 17px;" class="shop-menu pull-right">
									<ul class="nav navbar-nav">
										<li>
											<div class="go_back">
												<a href="${pageContext.request.contextPath }/product-list"><i
													class="fas fa-hand-point-left"></i> Go Back</a>
											</div>
										</li>
									</ul>
								</div>
							</h2>
						</div>
						<div class="form-css">
							<form:form action="doUpdateProduct" method="post"
								modelAttribute="product" enctype="multipart/form-data">
								<div>
									ID Sản phẩm:
									<form:input style="float: right; width: 60%;" path="productID"
										readonly="true" />
									<br>
								</div>
								<div>
									Tên sản phẩm:
									<form:input style="float: right; width: 60%;"
										path="productName" />
									<form:errors path="productName" cssClass="error"></form:errors>
									<br>
								</div>
								<div>
									Giá sản phẩm:
									<form:input style="float: right; width: 60%;"
										path="productPrice" />
									<form:errors path="productPrice" cssClass="error"></form:errors>
									<br>
								</div>
								<div>
									Giới tính:
									<!--<form:select style="float: right; width: 60%;" path="sex">
    						<form:option value="0">----------Select Sex----------</form:option>
    						<form:option value="1">---------------Male----------------</form:option>
    						<form:option value="2">--------------Female---------------</form:option>
    						</form:select>-->
									<form:radiobutton path="sex" value="1" />
									Nam
									<form:radiobutton path="sex" value="2" />
									Nữ
									<form:errors path="sex" cssClass="error"></form:errors>
									<br>
								</div>
								<div>
									Mô tả sản phẩm:
									<form:input style="float: right; width: 60%;"
										path="productDescription" />
									<form:errors path="productDescription" cssClass="error"></form:errors>
									<br>
								</div>
								<div>
									Danh mục:
									<form:select style="float: right; width: 60%;"
										path="category.categoryID">
										<form:option value="0">----------Select Category----------</form:option>
										<c:forEach items="${listCategory}" var="item">
											<form:option value="${item.categoryID }">${item.categoryName }</form:option>
										</c:forEach>
									</form:select>
									<br>
								</div>
								<div>
									Nhà cung cấp:
									<form:select style="float: right; width: 60%;"
										path="supplier.supplierID">
										<form:option value="0">----------Select Supplier----------</form:option>
										<c:forEach items="${listSupplier}" var="item">
											<form:option value="${item.supplierID }">${item.supplierName }</form:option>
										</c:forEach>
									</form:select>
									<br>
								</div>
								<div>
									Ảnh: <input type="file" name="multipartFile"
										multiple="multiple" /> <br>
								</div>
								<div>
									<input style="float: right;" class="nut-bam" type="submit"
										value="submit" />
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
				</a> <a href="#"> <span id="logo"></span>
				</a>
			</div>
			<div class="menu">
				<ul id="menu">
					<li id="menu-home"><a
						href="${pageContext.request.contextPath }/admin"><i
							class="fa fa-tachometer"></i><span>Dashboard</span></a></li>
					<li><a href="#"><i class="fa fa-shopping-cart"></i><span>E-Commerce</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a
								href="${pageContext.request.contextPath }/product-list">Product
									List</a></li>
							<li id="menu-academico-boletim"><a
								href="${pageContext.request.contextPath }/order-list">Order
									List</a></li>
							<li><a href="${pageContext.request.contextPath }/user-list">User
									List</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-map-marker"></i><span>Maps</span></a></li>
					<li><a href="#"><i class="fa fa-bar-chart"></i><span>Charts</span></a></li>
					<li><a href="#"><i class="fa fa-envelope"></i><span>Mailbox</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="#">Inbox</a></li>
							<li id="menu-academico-boletim"><a href="#">Compose
									email</a></li>
						</ul></li>
					<li id="menu-academico"><a href="#"><i
							class="fa fa-file-text"></i><span>Pages</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-boletim"><a
								href="${pageContext.request.contextPath }/shop">Shop</a></li>
							<li id="menu-academico-avaliacoes"><a
								href="${pageContext.request.contextPath }/home">Home</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-cog"></i><span>System</span><span
							class="fa fa-angle-right" style="float: right"></span></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="#">404</a></li>
							<li id="menu-academico-boletim"><a href="#">Blank</a></li>
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