<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="js/jquery-1.11.0.min.js"></script>
<!--Custom-Theme-files-->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--start-menu-->
<script src="js/simpleCart.min.js"> </script>
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!--dropdown-->
<script src="js/jquery.easydropdown.js"></script>	
<script type="text/javascript">
	$(function() {
	
	    var menu_ul = $('.menu_drop > li > ul'),
	           menu_a  = $('.menu_drop > li > a');
	    
	    menu_ul.hide();
	
	    menu_a.click(function(e) {
	        e.preventDefault();
	        if(!$(this).hasClass('active')) {
	            menu_a.removeClass('active');
	            menu_ul.filter(':visible').slideUp('normal');
	            $(this).addClass('active').next().stop(true,true).slideDown('normal');
	        } else {
	            $(this).removeClass('active');
	            $(this).next().stop(true,true).slideUp('normal');
	        }
	    });
	
	});
</script>		
</head>
<body> 
	<!--top-header-->
	<div class="top-header">
		<div class="container">
			<div class="top-header-main">
				<div class="col-md-6 top-header-left">
					<div class="drop">
						<div class="box">
							<select tabindex="4" class="dropdown drop">
								<option value="" class="label">人民币 :</option>
								<option value="1">人民币</option>
								<option value="2">美元</option>
							</select>
						</div>
						<div class="box1">
							<select tabindex="4" class="dropdown">
								<option value="" class="label">中文简体 :</option>
								<option value="1">中文简体</option>
								<option value="2">中文繁体</option>
								<option value="3">英文</option>
							</select>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-6 top-header-left">
					<div class="cart box_1">
						<a href="checkout.html">
							 <div class="total">
								<span class="simpleCart_total"></span></div>
								<img src="images/cart-1.png" alt="" />
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">购物车</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--top-header-->
	<!--start-logo-->
	<div class="logo">
		<a href="index.html"><h1>淘小宝</h1></a>
	</div>
	<!--start-logo-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue"><li class="active"><a href="index.html">首页</a></li>
						<li class="grid"><a href="#">男士</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>店铺</h4>
										<ul>
											<li><a href="products.html">新品上市</a></li>
											<li><a href="products.html">开拓者</a></li>
											<li><a href="products.html">卡西欧</a></li>
											<li><a href="products.html">英纳格</a></li>
											<li><a href="products.html">CK</a></li>
											<li><a href="products.html">西铁城</a></li>
											<li><a href="products.html">阿玛尼</a></li>
											<li><a href="products.html">我的购物车</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>样式区</h4>
										<ul>
											<li><a href="products.html">鞋</a></li>
											<li><a href="products.html">手表</a></li>
											<li><a href="products.html">品牌</a></li>
											<li><a href="products.html">大衣</a></li>
											<li><a href="products.html">饰品</a></li>
											<li><a href="products.html">长裤</a></li>
										</ul>	
									</div>
									<div class="col1 me-one">
										<h4>品牌专区</h4>
										<ul>
											<li><a href="products.html">1元抢购</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
										</ul>		
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="#">女士</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>店铺</h4>
										<ul>
											<li><a href="products.html">新品上市</a></li>
											<li><a href="products.html">开拓者</a></li>
											<li><a href="products.html">卡西欧</a></li>
											<li><a href="products.html">英纳格</a></li>
											<li><a href="products.html">CK</a></li>
											<li><a href="products.html">西铁城</a></li>
											<li><a href="products.html">阿玛尼</a></li>
											<li><a href="products.html">我的购物车</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>样式区</h4>
										<ul>
											<li><a href="products.html">鞋</a></li>
											<li><a href="products.html">手表</a></li>
											<li><a href="products.html">品牌</a></li>
											<li><a href="products.html">大衣</a></li>
											<li><a href="products.html">饰品</a></li>
											<li><a href="products.html">长裤</a></li>
										</ul>	
									</div>
									<div class="col1 me-one">
										<h4>品牌专区</h4>
										<ul>
											<li><a href="products.html">1元抢购</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
										</ul>		
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="#">儿童</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>店铺</h4>
										<ul>
											<li><a href="products.html">新品上市</a></li>
											<li><a href="products.html">开拓者</a></li>
											<li><a href="products.html">卡西欧</a></li>
											<li><a href="products.html">英纳格</a></li>
											<li><a href="products.html">CK</a></li>
											<li><a href="products.html">西铁城</a></li>
											<li><a href="products.html">阿玛尼</a></li>
											<li><a href="products.html">我的购物车</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>样式区</h4>
										<ul>
											<li><a href="products.html">鞋</a></li>
											<li><a href="products.html">手表</a></li>
											<li><a href="products.html">品牌</a></li>
											<li><a href="products.html">大衣</a></li>
											<li><a href="products.html">饰品</a></li>
											<li><a href="products.html">长裤</a></li>
										</ul>	
									</div>
									<div class="col1 me-one">
										<h4>品牌专区</h4>
										<ul>
											<li><a href="products.html">1元抢购</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
											<li><a href="products.html">xx旗舰店</a></li>
										</ul>		
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="typo.html">博客</a>
						</li>
						<li class="grid"><a href="contact.html">联系我们</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--bottom-header-->
	<!--start-breadcrumbs-->
	<div class="breadcrumbs">
		<div class="container">
			<div class="breadcrumbs-main">
				<ol class="breadcrumb">
					<li><a href="index.html">首页</a></li>
					<li class="active">商品详情</li>
				</ol>
			</div>
		</div>
	</div>
	<!--end-breadcrumbs-->
	<!--start-single-->
	<div class="single contact">
		<div class="container">
			<div class="single-main">
				<div class="col-md-9 single-main-left">
				<div class="sngl-top">
					<div class="col-md-5 single-top-left">	
						<div class="flexslider">
							  <ul class="slides">
								<li data-thumb="images/s-1.jpg">
									<div class="thumb-image"> <img src="images/s-1.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li>
								<li data-thumb="images/s-2.jpg">
									 <div class="thumb-image"> <img src="images/s-2.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li>
								<li data-thumb="images/s-3.jpg">
								   <div class="thumb-image"> <img src="images/s-3.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li> 
							  </ul>
						</div>
						<!-- FlexSlider -->
						<script src="js/imagezoom.js"></script>
						<script defer src="js/jquery.flexslider.js"></script>
						<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

						<script>
						// Can also be used with $(document).ready()
						$(window).load(function() {
						  $('.flexslider').flexslider({
							animation: "slide",
							controlNav: "thumbnails"
						  });
						});
						</script>
					</div>	
					<div class="col-md-7 single-top-right">
						<div class="single-para simpleCart_shelfItem">
						<h2>${watch.watchName}</h2>
							<div class="star-on">
								<ul class="star-footer">
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
									</ul>
							</div>
							<h5 class="item_price">价格： ${watch.price}</h5>
							<p>全是傲娇的品牌，只卖呆萌的价格，速来抢购</p>
							<div class="available">
								<ul>
									<li>颜色
										<select>
										<option>白色</option>
										<option>黑色</option>
										<option>深黑色</option>
										<option>红色</option>
									</select></li>
								<li class="size-in">表号<select>
									<option>L</option>
									<option>XL</option>
									<option>XXL</option>
									<option>S</option>
									<option>SL</option>
								</select></li>
							</ul>
						</div>
							<a href="../addShop?watchName=${watch.watchName}&img=${watch.img }&price=${watch.price}&quantity=1" class="add-cart item_add">ADD TO CART</a>
						</div>
					</div>
				</div>
			</div>
				<div class="col-md-3 single-right">
					<div class="w_sidebar">
						<section  class="sky-form">
							<h4>Brand</h4>
							<div class="row1 row2 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>所有配件</label>
								</div>
								<div class="col col-4">								
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>女式手表</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>儿童手表</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>男士腕表</label>			
								</div>
							</div>
						</section>
						<section  class="sky-form">
							<h4>品牌</h4>
							<div class="row1 row2 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>kurtas</label>
								</div>
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>泰坦</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>苏宁</label>
									<label class="checkbox"><input type="checkbox" name="checkbox" ><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>奏鸣曲</label>									
								</div>
							</div>
						</section>
						<section class="sky-form">
							<h4>颜色选择</h4>
								<ul class="w_nav2">
									<li><a class="color1" href="#"></a></li>
									<li><a class="color2" href="#"></a></li>
									<li><a class="color3" href="#"></a></li>
									<li><a class="color4" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
									<li><a class="color12" href="#"></a></li>
									<li><a class="color13" href="#"></a></li>
									<li><a class="color14" href="#"></a></li>
									<li><a class="color15" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
								</ul>
						</section>
						<section class="sky-form">
							<h4>优惠</h4>
								<div class="row1 row2 scroll-pane">
									<div class="col col-4">
										<label class="radio"><input type="radio" name="radio" checked=""><i></i>60 % 以上</label>
										<label class="radio"><input type="radio" name="radio"><i></i>50 % 以上</label>
										<label class="radio"><input type="radio" name="radio"><i></i>40 % 以上</label>
									</div>
									<div class="col col-4">
										<label class="radio"><input type="radio" name="radio"><i></i>30 % 以上</label>
										<label class="radio"><input type="radio" name="radio"><i></i>20 % 以上</label>
										<label class="radio"><input type="radio" name="radio"><i></i>10 % 以上</label>
									</div>
							</div>						
						</section>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>