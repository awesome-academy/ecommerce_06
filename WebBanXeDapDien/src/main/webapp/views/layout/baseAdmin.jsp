    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8" %>
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
        <!doctype html>
        <html lang="en">

        <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <spring:url value="/assets/assets/vendor/bootstrap/css/bootstrap.min.css" var="bootstrap"/>
        <spring:url value="/assets/assets/libs/css/style.css" var="style"/>

        <spring:url value="/assets/assets/vendor/fonts/fontawesome/css/fontawesome-all.css" var="fontawesome-all"/>
        <spring:url value="/assets/assets/vendor/charts/chartist-bundle/chartist.css" var="chartist"/>
        <spring:url value="/assets/assets/vendor/charts/morris-bundle/morris.css" var="morris"/>
        <spring:url value="/assets/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css"
                    var="materialdesignicons"/>
        <spring:url value="/assets/assets/vendor/charts/c3charts/c3.css" var="c3"/>
        <spring:url value="/assets/assets/vendor/fonts/flag-icon-css/flag-icon.min.css" var="flagicon"/>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="">
        <link href="${bootstrap}" rel="stylesheet">
        <link rel="stylesheet" href="${style}">
        <link rel="stylesheet" href="${fontawesome-all}">
        <link rel="stylesheet" href="${chartist}">
        <link rel="stylesheet" href="${morris}">
        <link rel="stylesheet" href="${materialdesignicons}">
        <link rel="stylesheet" href="${c3}">
        <link rel="stylesheet" href="${flagicon}">
        <title>Concept - Bootstrap 4 Admin Dashboard Template</title>
        </head>

        <body>
        <!-- ============================================================== -->
        <!-- main wrapper -->
        <!-- ============================================================== -->
        <div class="dashboard-main-wrapper">
        <!-- ============================================================== -->
        <!-- navbar -->
        <!-- ============================================================== -->
        <div class="dashboard-header">
        <nav class="navbar navbar-expand-lg bg-white fixed-top">
        <a class="navbar-brand" href="index.html">Concept</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto navbar-right-top">
        <li class="nav-item">
        <div id="custom-search" class="top-search-bar">
        <input class="form-control" type="text" placeholder="Search..">
        </div>
        </li>
        <li class="nav-item dropdown notification">
        <a class="nav-link nav-icons" href="#" id="navbarDropdownMenuLink1" data-toggle="dropdown"
        aria-haspopup="true" aria-expanded="false"><i class="fas fa-fw fa-bell"></i> <span
        class="indicator"></span></a>
        <ul class="dropdown-menu dropdown-menu-right notification-dropdown">
        <li>
        <div class="notification-title"> Notification</div>
        <div class="notification-list">
        <div class="list-group">
        <a href="#" class="list-group-item list-group-item-action active">
        <div class="notification-info">
        <div class="notification-list-user-img"><img
        src="/assets/assets/images/avatar-2.jpg" alt=""
        class="user-avatar-md rounded-circle"></div>
        <div class="notification-list-user-block"><span
        class="notification-list-user-name">Jeremy Rakestraw</span>accepted
        your invitation to join the team.
        <div class="notification-date">2 min ago</div>
        </div>
        </div>
        </a>
        <a href="#" class="list-group-item list-group-item-action">
        <div class="notification-info">
        <div class="notification-list-user-img"><img
        src="/assets/assets/images/avatar-3.jpg" alt=""
        class="user-avatar-md rounded-circle"></div>
        <div class="notification-list-user-block"><span
        class="notification-list-user-name">John Abraham </span>is now
        following you
        <div class="notification-date">2 days ago</div>
        </div>
        </div>
        </a>
        <a href="#" class="list-group-item list-group-item-action">
        <div class="notification-info">
        <div class="notification-list-user-img"><img
        src="/assets/assets/images/avatar-4.jpg" alt=""
        class="user-avatar-md rounded-circle"></div>
        <div class="notification-list-user-block"><span
        class="notification-list-user-name">Monaan Pechi</span> is
        watching your main repository
        <div class="notification-date">2 min ago</div>
        </div>
        </div>
        </a>
        <a href="#" class="list-group-item list-group-item-action">
        <div class="notification-info">
        <div class="notification-list-user-img"><img
        src="/assets/assets/images/avatar-5.jpg" alt=""
        class="user-avatar-md rounded-circle"></div>
        <div class="notification-list-user-block"><span
        class="notification-list-user-name">Jessica Caruso</span>accepted
        your invitation to join the team.
        <div class="notification-date">2 min ago</div>
        </div>
        </div>
        </a>
        </div>
        </div>
        </li>
        <li>
        <div class="list-footer"><a href="#">View all notifications</a></div>
        </li>
        </ul>
        </li>
        <li class="nav-item dropdown connection">
        <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
        aria-haspopup="true" aria-expanded="false"> <i class="fas fa-fw fa-th"></i> </a>
        <ul class="dropdown-menu dropdown-menu-right connection-dropdown">
        <li class="connection-list">
        <div class="row">
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img src="/assets/assets/images/github.png"
        alt="">
        <span>Github</span></a>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img
        src="/assets/assets/images/dribbble.png"
        alt=""> <span>Dribbble</span></a>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img src="/assets/assets/images/dropbox.png"
        alt="">
        <span>Dropbox</span></a>
        </div>
        </div>
        <div class="row">
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img
        src="/assets/assets/images/bitbucket.png"
        alt=""> <span>Bitbucket</span></a>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img
        src="/assets/assets/images/mail_chimp.png"
        alt=""><span>Mail chimp</span></a>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
        <a href="#" class="connection-item"><img src="/assets/assets/images/slack.png"
        alt="">
        <span>Slack</span></a>
        </div>
        </div>
        </li>
        <li>
        <div class="conntection-footer"><a href="#">More</a></div>
        </li>
        </ul>
        </li>
        <li class="nav-item dropdown nav-user">
        <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown"
        aria-haspopup="true" aria-expanded="false"><img src="/assets/assets/images/avatar-1.jpg"
        alt=""
        class="user-avatar-md rounded-circle"></a>
        <div class="dropdown-menu dropdown-menu-right nav-user-dropdown"
        aria-labelledby="navbarDropdownMenuLink2">
        <div class="nav-user-info">
        <h5 class="mb-0 text-white nav-user-name">John Abraham </h5>
        <span class="status"></span><span class="ml-2">Available</span>
        </div>
        <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>${pageContext.request.userPrincipal.name}</a>

        <a class="dropdown-item" href="#"><i class="fas fa-cog mr-2"></i>Setting</a>
        <a class="dropdown-item" href="#"><i class="fas fa-power-off mr-2"></i>Logout</a>
        </div>
        </li>
        </ul>
        </div>
        </nav>
        </div>
        <!-- ============================================================== -->
        <!-- end navbar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- left sidebar -->
        <!-- ============================================================== -->
        <div class="nav-left-sidebar sidebar-dark">
        <div class="menu-list">
        <nav class="navbar navbar-expand-lg navbar-light">
        <a class="d-xl-none d-lg-none" href="#">Dashboard</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav flex-column">
        <li class="nav-divider">
        Menu
        </li>
        <li class="nav-item ">
        <a  href="/admin/products">
        <spring:message code="admin.product" text="default"/>
        </a>
        </li>
        <li class="nav-item ">
        <a  href="/admin/orders">
        <spring:message code="admin.order" text="default"/>
        </a>
        </li>
        <li class="nav-item ">
        <a  href="/admin/supplier"/>
        <spring:message code="admin.supplier" text="default"/>
        </a>
        </li>


        </ul>
        </div>
        </nav>
        </div>
        </div>
        <!-- ============================================================== -->
        <!-- end left sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- wrapper -->
        <!-- ============================================================== -->
        <div class="dashboard-wrapper">
        <div class="dashboard-ecommerce">
        <div class="container-fluid dashboard-content ">
        <!-- ============================================================== -->
        <!-- pageheader -->
        <!-- ============================================================== -->
        <div class="row">
        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
        <div class="page-header">
        <h2 class="pageheader-title">E-commerce Dashboard Template </h2>
        <p class="pageheader-text">Nulla euismod urna eros, sit amet scelerisque torton lectus vel
        mauris facilisis faucibus at enim quis massa lobortis rutrum.</p>
        <div class="page-breadcrumb">
        <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a>
        </li>
        <li class="breadcrumb-item active" aria-current="page">E-Commerce Dashboard
        Template
        </li>
        </ol>
        </nav>
        </div>
        </div>
        </div>
        </div>
        <!-- ============================================================== -->
        <!-- end pageheader -->
        <!-- ============================================================== -->
        <tiles:insertAttribute name="body"/>
        </div>
        </div>
        <!-- ============================================================== -->
        <!-- footer -->
        <!-- ============================================================== -->
        <div class="footer">
        <div class="container-fluid">
        <div class="row">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
        Copyright © 2018 Concept. All rights reserved. Dashboard by <a href="https://colorlib.com/wp/">Colorlib</a>.
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
        <div class="text-md-right footer-links d-none d-sm-block">
        <a href="javascript: void(0);">About</a>
        <a href="javascript: void(0);">Support</a>
        <a href="javascript: void(0);">Contact Us</a>
        </div>
        </div>
        </div>
        </div>
        </div>
        <!-- ============================================================== -->
        <!-- end footer -->
        <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- end wrapper -->
        <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- end main wrapper -->
        <!-- ============================================================== -->
        <!-- Optional JavaScript -->
        <!-- jquery 3.3.1 -->
        <spring:url value="/assets/assets/vendor/jquery/jquery-3.3.1.min.js" var="jquery"/>

        <spring:url value="/assets/assets/vendor/bootstrap/js/bootstrap.bundle.js" var="bootstrapjs"/>
        <spring:url value="/assets/assets/vendor/slimscroll/jquery.slimscroll.js" var="slimscrolljs"/>
        <spring:url value="/assets/assets/libs/js/main-js.js" var="mainjs"/>
        <spring:url value="/assets/assets/vendor/charts/chartist-bundle/chartist.min.js" var="chartistjs"/>
        <spring:url value="/assets/assets/vendor/charts/sparkline/jquery.sparkline.js" var="sparklinejs"/>
        <spring:url value="/assets/assets/vendor/charts/morris-bundle/raphael.min.js" var="raphaeljs"/>
        <spring:url value="/assets/assets/vendor/charts/morris-bundle/morris.js" var="morrisjs"/>
        <spring:url value="/assets/assets/vendor/charts/c3charts/c3.min.js" var="c3js"/>
        <spring:url value="/assets/assets/vendor/charts/c3charts/d3-5.4.0.min.js" var="d3js"/>
        <spring:url value="/assets/assets/vendor/charts/c3charts/C3chartjs.js" var="C3chartjs"/>
        <spring:url value="/assets/assets/libs/js/dashboard-ecommerce.js" var="ecommercejs"/>


        <script src="${jquery}"></script>
        <!-- bootstap bundle js -->
        <script src="${bootstrapjs}"></script>
        <!-- slimscroll js -->
        <script src="${slimscrolljs}"></script>

        <!-- chart chartist js -->
        <script src="${chartistjs}"></script>
        <script src="${sparklinejs}"></script>
        <!-- morris js -->
        <script src="${raphaeljs}"></script>
        <script src="${morrisjs}"></script>
        <!-- chart c3 js -->
        <script src="${c3js}"></script>
        <script src="${d3js}"></script>
        <script src="${C3chartjs}"></script>
        <script src="${ecommercejs}"></script>
        <!-- main js -->
        <script src="${mainjs}"></script>
        </body>

        </html>