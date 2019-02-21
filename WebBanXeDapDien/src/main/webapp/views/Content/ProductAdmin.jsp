<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="ecommerce-widget">

    <div class="row">
        <div class="col-8">
            <h2>danh sách sản phẩm </h2>

            <table class="table">
                <thead>
                <tr>
                    <th>Ảnh</th>
                    <th>Tên Sản phẩm</th>
                    <th> Giá</th>
                    <th>Nhà sản xuất</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td><img src="/assets/images/products/${product.mainPhoto}"></td>
                        <td>${product.name}</td>
                        <td>${product.price}</td>
                        <td>${product.supplier.name}</td>
                        <td>
                            <button class="btn btn-info "> Edit</button>
                        </td>

                        <td>
                            <button class="btn btn-info "> Delete </button>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>

</div>