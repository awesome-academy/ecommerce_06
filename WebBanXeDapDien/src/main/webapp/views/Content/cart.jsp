<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
           prefix="tilesx" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="cf" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content" class="site-content" tabindex="-1">
    <div class="container">

        <nav class="woocommerce-breadcrumb"><a href="home.html">Home</a><span class="delimiter"><i class="fa fa-angle-right"></i></span>Cart</nav>

        <div id="primary" class="content-area">
            <main id="main" class="site-main">
                <article class="page type-page status-publish hentry">
                    <header class="entry-header"><h1 itemprop="name" class="entry-title">Cart</h1></header><!-- .entry-header -->

                    <form>

                        <table class="shop_table shop_table_responsive cart">
                            <thead>
                            <tr>
                                <th class="product-remove">&nbsp;</th>
                                <th class="product-thumbnail">&nbsp;</th>
                                <th class="product-name">Product</th>
                                <th class="product-name">Color</th>
                                <th class="product-price">Price</th>
                                <th class="product-quantity">Quantity</th>
                                <th class="product-subtotal">Total</th>
                            </tr>
                            </thead>
                            <tbody>
                              <c:forEach items="${carts}"  var="cart">
                            <tr class="cart_item" data-id="${cart.productId}" data-color="${cart.productColor}" data-price="${cart.productPrice}">

                                <td class="product-remove">
                                    <a class="remove xoaGioHang" style="cursor: pointer">×</a>
                                </td>

                                <td class="product-thumbnail">
                                    <a href="single-product.html"><img width="180" height="180" src="/assets/images/products/${cart.urlImage}" alt=""></a>
                                </td>

                                <td data-title="Product" class="product-name">
                                    <a href="single-product.html">${cart.productName}</a>
                                </td>
                                <td data-title="Color" class="product-color">
                                    <a href="single-product.html">${cart.productColor}</a>
                                </td>

                                <td data-title="Price"  class="product-price">
                                    <span class="amount">
                                         <fmt:formatNumber value="${cart.productPrice}" type="currency" pattern="###,###,### VND"/>
                                    </span>
                                </td>

                                <td data-title="Quantity" class="product-quantity">
                                    <div class="quantity buttons_added">
                                        <input type="number" class="soLuong" size="4"  value="${cart.quantity}"  max="29" min="0" step="1">
                                    </div>
                                </td>

                                <td data-title="Total" class="product-subtotal">
                                    <span class="amount" data-title="total"  ><fmt:formatNumber value="${cart.productPrice * cart.quantity}" type="currency" pattern="###,###,### VND"/></span>
                                </td>
                            </tr>
                              </c:forEach>
                            <tr>
                                <td class="actions" colspan="6">

                                    <div class="wc-proceed-to-checkout">

                                        <a class="checkout-button button alt wc-forward" href="/checkout">Proceed to Checkout</a>
                                    </div>

                                    <input type="hidden" value="1eafc42c5e" name="_wpnonce"><input type="hidden" value="/electro/cart/" name="_wp_http_referer">
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </form>

                </article>
            </main><!-- #main -->
        </div><!-- #primary -->
    </div><!-- .container -->
</div><!-- #content -->