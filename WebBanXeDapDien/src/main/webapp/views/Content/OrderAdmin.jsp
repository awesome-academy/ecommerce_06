<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="ecommerce-widget">

    <div class="row">
        <div class="container">
            <h2>Basic Table</h2>
            <p>The .table class adds basic styling (light padding and only horizontal dividers) to a
                table:</p>
            <table class="table">
                <thead>
                <tr>

                    <th>Mã Hóa Đơn</th>
                    <th>Tên Khach Hàng</th>
                    <th> Địa Chỉ</th>
                    <th>Ghi Chú</th>
                    <th>Số Điện Thoại</th>
                    <th>Ngày Lập</th>
                    <th>Tình Trạng</th>
                    <th>Chi Tiêt</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${orders}" var="order">
                    <tr>
                        <td>${order.id}</td>
                        <td>${order.customerName}</td>
                        <td>${order.customerAdress}</td>
                        <td>${order.customerNote}</td>
                        <td>${order.customerPhoneNumber}</td>
                        <td>${order.createdAt}</td>
                        <td>
                            <c:if test="${order.status == 'chưa xác nhận'}">
                                <input data-id="${order.id}" class="checkBoxStatus" type="checkbox">
                            </c:if>
                            <c:if test="${order.status == 'xác nhận'}">
                                <input data-id="${order.id}" class="checkBoxStatus" type="checkbox" checked>
                            </c:if>
                        </td>
                        <td>
                            <button class="btn btn-info "><a href="/admin/orders/${order.id}"> Chi Tiết </a>
                            </button>

                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>

</div>