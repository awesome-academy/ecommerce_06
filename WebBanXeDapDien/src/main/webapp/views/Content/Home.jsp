<%@ page import="java.text.DecimalFormat" %>
<%@ page import="app.Bean.Product" %>
<%@ page import="java.awt.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div id="content" class="site-content" tabindex="-1">
    <div class="container">
        <div id="primary" class="content-area">
            <main id="main" class="site-main">
                <div class="home-v3-slider">
                    <!-- ========================================== SECTION – HERO : END========================================= -->

                    <div id="owl-main" class="owl-carousel owl-inner-nav owl-ui-sm">

                        <div class="item" style="background-image: url(/assets/images/slider/xedienslider.jpg);">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div class="caption vertical-center text-left">
                                            <div class="hero-subtitle-v2 fadeInDown-1">
                                                shop to get what you loves
                                            </div>

                                            <div class="hero-2 fadeInDown-2">
                                                Timepieces that make a statement up to <strong>40% Off</strong>
                                            </div>

                                            <div class="hero-action-btn fadeInDown-3">
                                                <a href="single-product.html" class="big le-button ">Start Buying</a>
                                            </div>
                                        </div><!-- /.caption -->
                                    </div><!-- /.col -->
                                </div>
                            </div><!-- /.container -->
                        </div><!-- /.item -->

                        <div class="item" style="background-image: url(/assets/images/slider/xedien2slider.jpg);">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div class="caption vertical-center text-left">
                                            <div class="hero-subtitle-v2 fadeInDown-1">
                                                shop to get what you loves
                                            </div>

                                            <div class="hero-2 fadeInDown-2">
                                                Timepieces that make a statement up to <strong>40% Off</strong>
                                            </div>

                                            <div class="hero-action-btn fadeInDown-3">
                                                <a href="single-product.html" class="big le-button ">Start Buying</a>
                                            </div>
                                        </div><!-- /.caption -->
                                    </div>
                                </div>
                            </div><!-- /.container -->
                        </div><!-- /.item -->

                        <div class="item" style="background-image: url(/assets/images/slider/xedienslider.jpg);">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div class="caption vertical-center text-left">
                                            <div class="hero-subtitle-v2 fadeInDown-1">
                                                shop to get what you loves
                                            </div>

                                            <div class="hero-2 fadeInDown-2">
                                                Timepieces that make a statement up to <strong>40% Off</strong>
                                            </div>

                                            <div class="hero-action-btn fadeInDown-3">
                                                <a href="single-product.html" class="big le-button ">Start Buying</a>
                                            </div>
                                        </div><!-- /.caption -->
                                    </div>
                                </div>
                            </div><!-- /.container -->
                        </div><!-- /.item -->


                    </div><!-- /.owl-carousel -->

                    <!-- ========================================= SECTION – HERO : END ========================================= -->
                </div><!-- /.home-v1-slider -->

                <div class="home-v3-features-block animate-in-view fadeIn animated" data-animation="fadeIn">
                    <div class="features-list columns-5">
                        <div class="feature">
                            <div class="media">
                                <div class="media-left media-middle feature-icon">
                                    <i class="ec ec-transport"></i>
                                </div>
                                <div class="media-body media-middle feature-text">
                                    <strong>Free Delivery</strong> from $50
                                </div>
                            </div>
                        </div><!-- .feature -->

                        <div class="feature">
                            <div class="media">
                                <div class="media-left media-middle feature-icon">
                                    <i class="ec ec-customers"></i>
                                </div>
                                <div class="media-body media-middle feature-text">
                                    <strong>99% Positive</strong> Feedbacks
                                </div>
                            </div>
                        </div><!-- .feature -->

                        <div class="feature">
                            <div class="media">
                                <div class="media-left media-middle feature-icon">
                                    <i class="ec ec-returning"></i>
                                </div>
                                <div class="media-body media-middle feature-text">
                                    <strong>365 days</strong> for free return
                                </div>
                            </div>
                        </div><!-- .feature -->

                        <div class="feature">
                            <div class="media">
                                <div class="media-left media-middle feature-icon">
                                    <i class="ec ec-payment"></i>
                                </div>
                                <div class="media-body media-middle feature-text">
                                    <strong>Payment</strong> Secure System
                                </div>
                            </div>
                        </div><!-- .feature -->

                        <div class="feature">
                            <div class="media">
                                <div class="media-left media-middle feature-icon">
                                    <i class="ec ec-tag"></i>
                                </div>
                                <div class="media-body media-middle feature-text">
                                    <strong>Only Best</strong> Brands
                                </div>
                            </div>
                        </div><!-- .feature -->
                    </div><!-- .features-list -->
                </div><!-- .home-v3-features-block -->

                <div class="home-v3-ads-block animate-in-view fadeIn animated" data-animation=" animated fadeIn">
                    <div class="ads-block row">
                        <div class="ad col-xs-12 col-sm-6">
                            <div class="media">
                                <div class="media-left media-middle">
                                    <img data-echo="/assets/images/banner/cameras.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </div>
                                <div class="media-body media-middle">
                                    <div class="ad-text">
                                        Catch Hottest <strong>Deals</strong> in Cameras Category
                                    </div>
                                    <div class="ad-action">
                                        <a href="#">Shop now</a>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.col -->

                        <div class="ad col-xs-12 col-sm-6">
                            <div class="media">
                                <div class="media-left media-middle">
                                    <img data-echo="/assets/images/banner/DesktopPC.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </div>
                                <div class="media-body media-middle">
                                    <div class="ad-text">
                                        Tablets, Smartphones <br><strong>and more</strong>
                                    </div>
                                    <div class="ad-action">
                                        <a href="#"><span class="from"><span class="prefix">From</span><span
                                                class="value"><sup>$</sup>749</span><span
                                                class="suffix">99</span></span></a>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.col -->
                    </div><!-- /.row -->
                </div><!-- /.home-v3-ads-block -->

                <section class="products-carousel-tabs animate-in-view fadeIn animated" data-animation="fadeIn">
                    <h2 class="sr-only">Product Carousel Tabs</h2>
                    <ul class="nav nav-inline text-xs-left">
                        <li class="nav-item">
                            <a class="nav-link active" href="#tab-products-1" data-toggle="tab">Featured</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="#tab-products-2" data-toggle="tab">On Sale</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="#tab-products-3" data-toggle="tab">Top Rated</a>
                        </li>
                    </ul><!-- /.nav -->

                    <div class="tab-content">
                        <div class="tab-pane active" id="tab-products-1" role="tabpanel">
                            <section class="section-products-carousel">

                                <div class="home-v3-owl-carousel-tabs">

                                    <div class="woocommerce columns-4">
                                        <!-- dnah sach san phaam featured -->

                                        <c:forEach items="${productList}" var="product" varStatus="status">
                                            <c:if test="${status.index % 4 == 0 }">
                                                <div class="products owl-carousel home-v3-carousel-tabs products-carousel columns-4">

                                                <div class="product first">
                                                    <div class="product-outer">
                                                        <div class="product-inner">
                                                        <span class="loop-product-categories"><a
                                                                href="product-category.html"
                                                                rel="tag">${product.supplier.name}"</a></span>
                                                            <a href="/product/${product.id}">
                                                                <h3>${product.name}</h3>
                                                                <div class="product-thumbnail">
                                                                    <img src="/assets/images/blank.gif"
                                                                         data-echo="/assets/images/products/${product.mainPhoto}"
                                                                         class="img-responsive" alt="">
                                                                </div>
                                                            </a>

                                                            <div class="price-add-to-cart">
                                                                        <span class="price">
                                                                            <span class="electro-price">


                                                                                <ins><span
                                                                                        class="amount"><fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/> </span></ins>
                                                                                <del><span
                                                                                        class="amount"> <fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/></span></del>
                                                                                <span class="amount"> </span>
                                                                            </span>
                                                                        </span>
                                                                <a rel="nofollow" href="single-product.html"
                                                                   class="button add_to_cart_button">Add to cart</a>
                                                            </div><!-- /.price-add-to-cart -->


                                                        </div><!-- /.product-inner -->
                                                    </div><!-- /.product-outer -->
                                                </div>
                                                <!-- /.product -->
                                            </c:if>
                                            <c:if test="${status.index % 4 == 1}">
                                                <div class="product ">
                                                    <div class="product-outer">
                                                        <div class="product-inner">
                                                        <span class="loop-product-categories"><a
                                                                href="product-category.html"
                                                                rel="tag">${product.supplier.name}</a></span>
                                                            <a href="/product/${product.id}">
                                                                <h3>${product.name}</h3>
                                                                <div class="product-thumbnail">
                                                                    <img src="/assets/images/blank.gif"
                                                                         data-echo="/assets/images/products/${product.mainPhoto}"
                                                                         class="img-responsive" alt="">
                                                                </div>
                                                            </a>

                                                            <div class="price-add-to-cart">
                                                                        <span class="price">
                                                                            <span class="electro-price">
                                                                                <ins><span
                                                                                        class="amount">
                                                                                 <fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/>

                                                                                </span></ins>
                                                                                <del><span
                                                                                        class="amount"><a href="/product/${product.id}"></span></del>
                                                                                <span class="amount"> </span>
                                                                            </span>
                                                                        </span>
                                                                <a rel="nofollow" href="single-product.html"
                                                                   class="button add_to_cart_button">Add to cart</a>
                                                            </div><!-- /.price-add-to-cart -->

                                                        </div><!-- /.product-inner -->
                                                    </div><!-- /.product-outer -->
                                                </div>
                                                <!-- /.product -->

                                            </c:if>
                                            <c:if test="${status.index % 4 == 2}">

                                                <div class="product ">
                                                    <div class="product-outer">
                                                        <div class="product-inner">
                                                        <span class="loop-product-categories"><a
                                                                href="product-category.html"
                                                                rel="tag">${product.supplier.name}</a></span>
                                                            <a href="/product/${product.id}">
                                                                <h3>${product.name}</h3>
                                                                <div class="product-thumbnail">
                                                                    <img src="/assets/images/blank.gif"
                                                                         data-echo="/assets/images/products/${product.mainPhoto}"
                                                                         class="img-responsive" alt="">
                                                                </div>
                                                            </a>

                                                            <div class="price-add-to-cart">
                                                                        <span class="price">
                                                                            <span class="electro-price">
                                                                                <ins><span
                                                                                        class="amount"><fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/></span></ins>
                                                                                <del><span
                                                                                        class="amount"><fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/></span></del>
                                                                                <span class="amount"> </span>
                                                                            </span>
                                                                        </span>
                                                                <a rel="nofollow" href="single-product.html"
                                                                   class="button add_to_cart_button">Add to cart</a>
                                                            </div><!-- /.price-add-to-cart -->


                                                        </div><!-- /.product-inner -->
                                                    </div><!-- /.product-outer -->
                                                </div>
                                                <!-- /.product -->
                                            </c:if>
                                            <c:if test="${status.index % 4 == 3}">
                                                <div class="product last">
                                                    <div class="product-outer">
                                                        <div class="product-inner">
                                                        <span class="loop-product-categories"><a
                                                                href="product-category.html"
                                                                rel="tag">${product.supplier.name}</a></span>
                                                            <a href="/product/${product.id}">
                                                                <h3>${product.name}</h3>
                                                                <div class="product-thumbnail">
                                                                    <img src="/assets/images/blank.gif"
                                                                         data-echo="/assets/images/products/${product.mainPhoto}"
                                                                         class="img-responsive" alt="">
                                                                </div>
                                                            </a>

                                                            <div class="price-add-to-cart">
                                                                        <span class="price">
                                                                            <span class="electro-price">
                                                                                <ins><span
                                                                                        class="amount"><fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/></span></ins>
                                                                                <del><span
                                                                                        class="amount"><fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/></span></del>
                                                                                <span class="amount"> </span>
                                                                            </span>
                                                                        </span>
                                                                <a rel="nofollow" href="single-product.html"
                                                                   class="button add_to_cart_button">Add to cart</a>
                                                            </div><!-- /.price-add-to-cart -->


                                                        </div><!-- /.product-inner -->
                                                    </div><!-- /.product-outer -->
                                                </div>
                                                <!-- /.product -->
                                            </c:if>

                                            <c:if test="${status.index % 4 == 3 || status.last == true}">
                                                </div><!-- /.products -->
                                            </c:if>
                                        </c:forEach>
                                    </div>
                                </div>
                            </section>
                        </div><!-- /.tab-pane -->

                        <%--<div class="tab-pane" id="tab-products-2" role="tabpanel">--%>
                        <%--<section class="section-products-carousel">--%>
                        <%--<div class="home-v3-owl-carousel-tabs">--%>
                        <%--<div class="woocommerce columns-4">--%>
                        <%--<!-- danh sach san pham sale -->--%>
                        <%--<div class="products owl-carousel home-v3-carousel-tabs products-carousel columns-4">--%>

                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Audio Speakers</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Wireless Audio System Multiroom 360</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Thin EliteBook Revolve 810 G6</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Purple Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Red EliteBook Revolve 810 G2</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>White Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Smartphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Smartphone 6S 32GB LTE</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>
                        <%--</div><!-- /.products -->--%>
                        <%--<div class="products owl-carousel home-v3-carousel-tabs products-carousel columns-4">--%>

                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Audio Speakers</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Wireless Audio System Multiroom 360</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Thin EliteBook Revolve 810 G6</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/xedien.jpeg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Purple Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/5.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Red EliteBook Revolve 810 G2</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/2.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>White Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/6.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Smartphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Smartphone 6S 32GB LTE</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/4.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>
                        <%--</div><!-- /.products -->--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</section>--%>
                        <%--</div><!-- /.tab-pane -->--%>

                        <%--<div class="tab-pane" id="tab-products-3" role="tabpanel">--%>
                        <%--<section class="section-products-carousel">--%>
                        <%--<div class="home-v3-owl-carousel-tabs">--%>
                        <%--<div class="woocommerce columns-4">--%>
                        <%--<!-- danh sach san pham thih hanh -->--%>
                        <%--<div class="products owl-carousel home-v3-carousel-tabs products-carousel columns-4">--%>

                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html" rel="tag">Audio Speakers</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Wireless Audio System Multiroom 360</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/3.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Thin EliteBook Revolve 810 G6</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/1.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Purple Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/5.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Red EliteBook Revolve 810 G2</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/2.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>White Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/6.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Smartphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Smartphone 6S 32GB LTE</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/4.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>
                        <%--</div><!-- /.products -->--%>
                        <%--<div class="products owl-carousel home-v3-carousel-tabs products-carousel columns-4">--%>

                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html" rel="tag">Audio Speakers</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Wireless Audio System Multiroom 360</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/3.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Thin EliteBook Revolve 810 G6</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/1.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Purple Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/5.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product last">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Laptops</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Tablet Red EliteBook Revolve 810 G2</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/2.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product first">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Headphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>White Solo 2 Wireless</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/6.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span--%>
                        <%--class="amount"> $1,999.00</span></ins>--%>
                        <%--<del><span--%>
                        <%--class="amount">$2,299.00</span></del>--%>
                        <%--<span class="amount"> </span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>


                        <%--<div class="product ">--%>
                        <%--<div class="product-outer">--%>
                        <%--<div class="product-inner">--%>
                        <%--<span class="loop-product-categories"><a--%>
                        <%--href="product-category.html"--%>
                        <%--rel="tag">Smartphones</a></span>--%>
                        <%--<a href="single-product.html">--%>
                        <%--<h3>Smartphone 6S 32GB LTE</h3>--%>
                        <%--<div class="product-thumbnail">--%>
                        <%--<img src="/assets/images/blank.gif"--%>
                        <%--data-echo="/assets/images/products/4.jpg"--%>
                        <%--class="img-responsive" alt="">--%>
                        <%--</div>--%>
                        <%--</a>--%>

                        <%--<div class="price-add-to-cart">--%>
                        <%--<span class="price">--%>
                        <%--<span class="electro-price">--%>
                        <%--<ins><span class="amount"> </span></ins>--%>
                        <%--<span class="amount"> $1,999.00</span>--%>
                        <%--</span>--%>
                        <%--</span>--%>
                        <%--<a rel="nofollow" href="single-product.html"--%>
                        <%--class="button add_to_cart_button">Add to cart</a>--%>
                        <%--</div><!-- /.price-add-to-cart -->--%>

                        <%--<div class="hover-area">--%>
                        <%--<div class="action-buttons">--%>

                        <%--<a href="#" rel="nofollow" class="add_to_wishlist">--%>
                        <%--Wishlist</a>--%>

                        <%--<a href="compare.html" class="add-to-compare-link">--%>
                        <%--Compare</a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div><!-- /.product-inner -->--%>
                        <%--</div><!-- /.product-outer -->--%>
                        <%--</div><!-- /.product -->--%>
                        <%--</div><!-- /.products -->--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</section>--%>
                        <%--</div><!-- /.tab-pane -->--%>
                    </div><!-- /.tab-content -->
                </section><!-- /.products-carousel-tabs -->

                <!-- ----------------------------------------------------------------------------------------------------- -->
                <div class="row">
                    <div aria-label="Page navigation">
                        <ul class="pagination">
                            <%
                                int count = (int) request.getAttribute("pageCount");
                                for (int i = 1; i <= count; i++) {
                            %>
                            <li class="page-item"><a class="page-link"
                                                     href="/Featured/<%=i%>"><%=i%>
                            </a></li>
                            <%}%>
                        </ul>
                    </div>
                </div>
                <!-- ----------------------------------------------------------------------------------------------------- -->


                <section class="home-list-categories animate-in-view fadeIn animated" data-animation="fadeIn">
                    <header>
                        <h2 class="h1">Top Categories this Month</h2>
                    </header>
                    <ul class="categories">
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/1.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Smart Phones & Tablets</a>
                                    </h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/2.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Video Games & Consoles</a>
                                    </h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/3.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Gadgets</a></h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/4.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Home Entertainment</a>
                                    </h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/5.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Laptops & Computers</a>
                                    </h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                        <li class="category">
                            <div class="media">
                                <a class="media-left" href="product-category.html">
                                    <img data-echo="/assets/images/products/6.jpg" src="/assets/images/blank.gif"
                                         alt="">
                                </a><!-- /.media-left -->

                                <div class="media-body">
                                    <h4 class="media-heading"><a href="product-category.html">Accessories</a></h4>
                                    <ul class="sub-categories list-unstyled">
                                        <li class="cat-item">
                                            <a href="product-category.html">Accessories</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Chargers</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Powerbanks</a>
                                        </li>
                                        <li class="cat-item">
                                            <a href="product-category.html">Smartphones</a>
                                        </li>
                                    </ul>
                                </div><!-- /.media-body -->
                            </div><!-- /.media -->
                            <a class="see-all" href="#">See all</a>
                        </li>
                    </ul>
                </section>

            </main><!-- #main -->
        </div><!-- #primary -->
    </div><!-- .container -->
</div>
<!-- #content -->
