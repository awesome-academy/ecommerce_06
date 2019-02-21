<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="content" class="site-content" tabindex="-1">
    <div class="container">
        <nav class="woocommerce-breadcrumb"><a href="home.html">Home</a><span class="delimiter"><i
                class="fa fa-angle-right"></i></span>My Account
        </nav><!-- .woocommerce-breadcrumb -->

        <div id="primary" class="content-area">
            <main id="main" class="site-main">
                <article id="post-8" class="hentry">

                    <div class="entry-content">
                        <div class="woocommerce">
                            <div class="customer-login-form">
                                <span class="or-text">or</span>

                                <div class="col2-set" id="customer_login">

                                    <div class="col-1">


                                        <h2>Login</h2>

                                        <form method="post" class="login" action="/login">

                                            <p class="before-login-text">Welcome back! Sign in to your account</p>

                                            <p class="form-row form-row-wide">

                                                <label for="username">Username or email address<span
                                                        class="required">*</span></label>
                                                <input type="text" class="input-text" name="email" id="username"
                                                       value=""/>
                                            </p>

                                            <p class="form-row form-row-wide">
                                                <label for="password">Password<span class="required">*</span></label>

                                                <input class="input-text" type="password" name="password"
                                                       id="password"/>
                                            </p>

                                            <p class="form-row">
                                                <input class="button" type="submit" value="Login" name="login">

                                                <label for="rememberme" class="inline"><input name="remember-me"
                                                                                              type="checkbox"
                                                                                              id="rememberme"
                                                                                              value="forever"/> Remember
                                                    me</label>
                                            </p>

                                            <p class="lost_password"><a href="login-and-register.html">Lost your
                                                password?</a></p>

                                        </form>


                                    </div><!-- .col-1 -->

                                    <div class="col-2">

                                        <h2>Register</h2>

                                        <form method="post" class="register" action="/registration">
                                            <c:if test="${result == false}">
                                                <p class="before-register-text" style="color: red">EMAIL CỦA BẠN KHÔNG
                                                    HỢP LỆ HOẶC ĐÃ TỒN TẠI </p>
                                            </c:if>
                                            <c:if test="${result == true}">

                                                <p class="before-register-text" style="color: red">WE SENT A PASSWORD TO
                                                    YOUR EMAIL .NOW, YOU CAN CHECK IT IN YOUR EMAIL</p>
                                            </c:if>


                                            <p class="form-row form-row-wide">
                                                <label for="reg_email">Email address<span
                                                        class="required">*</span></label>
                                                <input type="email" class="input-text" name="email" id="reg_email"
                                                       value=""/>
                                            </p>

                                            <p class="form-row"><input type="submit" class="button" name="register"
                                                                       value="Register"/></p>

                                            <div class="register-benefits">
                                                <h3>Sign up today and you will be able to :</h3>
                                                <ul>
                                                    <li>Speed your way through checkout</li>
                                                    <li>Track your orders easily</li>
                                                    <li>Keep a record of all your purchases</li>
                                                </ul>
                                            </div>

                                        </form>

                                    </div><!-- .col-2 -->

                                </div><!-- .col2-set -->

                            </div><!-- /.customer-login-form -->
                        </div><!-- .woocommerce -->
                    </div><!-- .entry-content -->

                </article><!-- #post-## -->

            </main><!-- #main -->
        </div><!-- #primary -->

    </div><!-- .col-full -->

</div>
<!-- #content -->
