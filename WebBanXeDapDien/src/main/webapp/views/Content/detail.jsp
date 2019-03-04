<%@ page import="java.text.DecimalFormat" %>
<%@ page import="app.bean.Product" %>
<%@ page import="app.bean.Color" %>
<%@ page import="app.bean.ProductColor" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.function.Consumer" %>
<%@ page import="java.io.IOException" %>

<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
           prefix="tilesx" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="cf" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi_VN" itemscope="itemscope" itemtype="http://schema.org/WebPage">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Đức Mạnh&#8211; Xe Cực Rẻ </title>

    <spring:url value="/assets/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/assets/css/fontawesome.min.css" var="fontawesome"/>
    <spring:url value="/assets/css/animate.min.css" var="animate"/>
    <spring:url value="/assets/css/fontelectro.css" var="fontelectro"/>
    <spring:url value="/assets/css/owlcarousel.css" var="owlcarousel"/>
    <spring:url value="/assets/css/style.css" var="style"/>
    <spring:url value="/assets/css/colors/yellow.css" var="yellow"/>

    <spring:url value="/assets/js/bootstrap.min.js" var="bootstrapJs"/>
    <spring:url value="/assets/js/jquery.min.js" var="jquery"/>
    <spring:url value="/assets/js/tether.min.js" var="tether"/>
    <spring:url value="/assets/js/bootstrap-hover-dropdown.min.js" var="bootstraphoverdropdown"/>
    <spring:url value="/assets/js/owl.carousel.min.js" var="owlcarouselminjs"/>
    <spring:url value="/assets/js/echo.min.js" var="echominjs"/>
    <spring:url value="/assets/js/wow.min.js" var="wowminjs"/>
    <spring:url value="/assets/js/jquery.easing.min.js" var="jqueryeasingminjs"/>
    <spring:url value="/assets/js/jquery.waypoints.min.js" var="jquerywaypointsminjs"/>
    <spring:url value="/assets/js/electro.js" var="electrojs"/>
    <spring:url value="/assets/js/cart.js" var="cartjs"/>
    <spring:url value="/assets/images/fav-icon.png" var="favicon"/>


    <link rel="stylesheet" type="text/css" href="${bootstrapCss}" media="all"/>
    <link rel="stylesheet" type="text/css" href="${fontawesome}" media="all"/>
    <link rel="stylesheet" type="text/css" href="${animate}" media="all"/>

    <link rel="stylesheet" type="text/css" href="${fontelectro}" media="all"/>
    <link rel="stylesheet" type="text/css" href="${owlcarousel}" media="all"/>
    <link rel="stylesheet" type="text/css" href="${style}" media="all"/>
    <link rel="stylesheet" type="text/css" href="${yellow}" media="all"/>

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,700italic,800,800italic,600italic,400italic,300italic'
          rel='stylesheet' type='text/css'>

    <link rel="shortcut icon" href="/assets/images/fav-icon.png">
</head>

<body class="single-product full-width">
<div id="fb-root"></div>
<script async defer src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v3.2"></script>
<div id="page" class="hfeed site">
    <a class="skip-link screen-reader-text" href="#site-navigation">Skip to navigation</a>
    <a class="skip-link screen-reader-text" href="#content">Skip to content</a>

    <div class="top-bar">
        <div class="container">
            <nav>
                <ul id="menu-top-bar-left" class="nav nav-inline pull-left animate-dropdown flip">
                    <li class="menu-item animate-dropdown"><a title="Welcome to Worldwide Electronics Store" href="#">Welcome
                        to Worldwide Electronics Store</a></li>
                </ul>
            </nav>

            <nav>
                <ul id="menu-top-bar-right" class="nav nav-inline pull-right animate-dropdown flip">
                    <li class="menu-item animate-dropdown"><a title="Store Locator" href="#"><i
                            class="ec ec-map-pointer"></i>Store Locator</a></li>
                    <li class="menu-item animate-dropdown"><a title="Track Your Order" href="track-your-order.html"><i
                            class="ec ec-transport"></i>Track Your Order</a></li>
                    <li class="menu-item animate-dropdown"><a title="Shop" href="shop.html"><i
                            class="ec ec-shopping-bag"></i>Shop</a></li>
                    <li class="menu-item animate-dropdown"><a title="My Account" href="my-account.html"><i
                            class="ec ec-user"></i>My Account</a></li>
                </ul>
            </nav>
        </div>
    </div><!-- /.top-bar -->

    <tiles:insertAttribute name="header"/>



    <div id="content" class="site-content" tabindex="-1">
        <div class="container">

            <nav class="woocommerce-breadcrumb">
                <a href="home.html">Home</a>

                <span class="delimiter"><i class="fa fa-angle-right"></i></span>
                <a href="product-category.html">${product.supplier.name}</a>
                <span class="delimiter"><i class="fa fa-angle-right"></i>
                        </span>${product.name}
            </nav><!-- /.woocommerce-breadcrumb -->

            <div id="primary" class="content-area">
                <main id="main" class="site-main">

                    <div class="product">

                        <div class="single-product-wrapper">
                            <div class="product-images-wrapper">
                                <span class="onsale">Sale!</span>
                                <div id="mainImage" class="images electro-gallery" data-images="${product.mainPhoto}">
                                    <div class="thumbnails-single owl-carousel">
                                        <c:forEach items="${product.images}" var="image">

                                            <a href="images/single-product/s1-1.jpg" class="zoom" title=""
                                               data-rel="prettyPhoto[product-gallery]"><img
                                                    src="/assets/images/blank.gif"
                                                    data-echo="/assets/images/products/${image.link}"
                                                    class="wp-post-image"
                                                    alt=""></a>
                                        </c:forEach>
                                    </div><!-- .thumbnails-single -->

                                    <div class="thumbnails-all columns-5 owl-carousel">
                                        <c:forEach items="${product.images}" var="image">

                                            <a href="/assets/images/products/${image.link}" class="first"
                                               title=""><img src="/assets/images/blank.gif"
                                                             data-echo="/assets/images/products/${image.link}"
                                                             class="wp-post-image" alt=""></a>
                                        </c:forEach>
                                    </div><!-- .thumbnails-all -->
                                </div><!-- .electro-gallery -->
                            </div><!-- /.product-images-wrapper -->

                            <div class="summary entry-summary">

                                        <span class="loop-product-categories">
                                            <a href="product-category.html" rel="tag">${product.supplier.name}</a>
                                        </span><!-- /.loop-product-categories -->

                                <h1 itemprop="name" id="productName" class="product_title entry-title">${product.name}</h1>

                                <div class="woocommerce-product-rating">
                                    <div class="star-rating" title="Rated 4.33 out of 5">
                                                <span style="width:86.6%">
                                                    <strong itemprop="ratingValue" class="rating">4.33</strong>
                                                    out of <span itemprop="bestRating">5</span>				based on
                                                    <span itemprop="ratingCount" class="rating">3</span>
                                                    customer ratings
                                                </span>
                                    </div>

                                    <a href="#reviews" class="woocommerce-review-link">(<span itemprop="reviewCount"
                                                                                              class="count">3</span>
                                        customer reviews)</a>
                                </div><!-- .woocommerce-product-rating -->

                                <div class="brand">
                                    <a href="product-category.html">
                                        <img src="/assets/images/single-product/brand.png" alt="Gionee"/>
                                    </a>
                                </div><!-- .brand -->

                                <div class="availability in-stock">Availablity: <span>In stock</span></div>
                                <!-- .availability -->

                                <hr class="single-product-title-divider"/>


                                <div itemprop="description">
                                    <ul>
                                        <li>Motor: ${productDetail.motor}(w)</li>
                                        <li>Tốc độ: ${productDetail.speed}(km/h)</li>
                                        <li>Quãng đường tối đa :${productDetail.maximumDistance}(km)</li>
                                        <li>Trọng lượng an toàn :${productDetail.safeWeight}(KG)</li>
                                        <li>Trong lượng xe :${productDetail.weight}(KG)</li>
                                        <li>thời gian sạc:${productDetail.chargingTime}h</li>

                                        <li>chiều dài x chiều rộng x chiều cao : ${productDetail.longs}
                                            x ${productDetail.wide} x ${productDetail.hight}</li>
                                        <li>bảo hành acquy : ${productDetail.warrantyBattery} năm</li>
                                        <li>bảo hành motor : ${productDetail.warrantyMotor} năm</li>
                                        <li>Phụ kiện đi kèm : ${productDetail.accessoriesIncluded}</li>
                                    </ul>


                                    <p><strong>SKU</strong>: ${product.id}</p>
                                </div><!-- .description -->

                                <div itemprop="offers" itemscope itemtype="http://schema.org/Offer">

                                    <p class="price"><span class="electro-price"><ins><span id="amount"
                                            class="amount" data-value="${product.price}">
                                <fmt:formatNumber value="${product.price}" type="currency" pattern="###,###,### VND"/>

                                    </span></ins> <del><span
                                            class="amount">  <fmt:formatNumber value="${product.price}" type="currency"
                                                                               pattern="###,###,### VND"/></span></del></span>
                                    </p>

                                    <meta itemprop="price" content="1215"/>
                                    <meta itemprop="priceCurrency" content="USD"/>
                                    <link itemprop="availability" href="http://schema.org/InStock"/>

                                </div><!-- /itemprop -->

                                <form id="form_cart" class="variations_form cart" method="post">

                                    <table class="variations">
                                        <tbody>
                                        <tr>
                                            <td class="label"><label>Color</label></td>
                                            <td class="value">
                                                <select id="color" value=""  name="attribute_pa_color">
                                                    <option value="" >Choose an option</option>
                                                    <c:forEach items="${product.productColors}" var="productsColors">
                                                        <option value="${productsColors.color.value}">${productsColors.color.value}</option>
                                                    </c:forEach>
                                                </select>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>


                                    <div class="single_variation_wrap">
                                        <div class="woocommerce-variation single_variation"></div>
                                        <div class="woocommerce-variation-add-to-cart variations_button">
                                            <div class="quantity">
                                                <label>Quantity:</label>
                                                <input type="number" name="quantity" value="1" title="Qty"
                                                       class="input-text qty text"/>
                                            </div>
                                            <button id="btn-submit-cart" type="submit"
                                                    class="single_add_to_cart_button button">Add to cart
                                            </button>
                                            <input type="hidden" name="product_id" value=" ${product.id}"/>
                                            <input type="hidden" name="variation_id" class="variation_id" value="0"/>
                                        </div>
                                    </div>
                                </form>
                                <script src="https://apis.google.com/js/platform.js" async defer></script>
                                <g:plus action="share"></g:plus>
                                <div class="fb-share-button" data-href="https://localhost:8080/products/2" data-layout="button_count" data-size="small" data-mobile-iframe="true"><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fplugins%2F&amp;src=sdkpreparse" class="fb-xfbml-parse-ignore">Chia sẻ</a></div>
                            </div><!-- .summary -->
                        </div><!-- /.single-product-wrapper -->


                    </div><!-- /.product -->

                </main><!-- /.site-main -->
            </div><!-- /.content-area -->
        </div><!-- /.container -->
    </div><!-- /.site-content -->


    <footer id="colophon" class="site-footer">
        <tiles:insertAttribute name="footer"/>
    </footer>

</div><!-- #page -->

<script type="text/javascript" src="${jquery}"></script>
<script type="text/javascript" src="${tether}"></script>
<script type="text/javascript" src="${bootstrapJs}"></script>
<script type="text/javascript" src="${bootstraphoverdropdown}"></script>
<script type="text/javascript" src="${owlcarouselminjs}"></script>
<script type="text/javascript" src="${echominjs}"></script>
<script type="text/javascript" src="${wowminjs}"></script>
<script type="text/javascript" src="${jqueryeasingminjs}"></script>
<script type="text/javascript" src="${jquerywaypointsminjs}"></script>
<script type="text/javascript" src="${electrojs}"></script>
<script type="text/javascript" src="${cartjs}"></script>

</body>
</html>
