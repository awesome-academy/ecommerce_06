<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="ecommerce-widget">

    <div class="row">
        <div class="container">
            <h2 style="text-align: center"> Hoa Don Mua Hang </h2>
            <h5> Mã Hóa Đơn : <b>${order.id}</b></h5>

            <h5> Tên Khách hàng : <b>${order.customerName}</b></h5>

            <h5> Địa Chỉ : <b>${order.customerAdress}</b></h5>

            <h5>Ghi Chú : <b>${order.customerNote}</b></h5>

            <h5>Số Điện Thoại :<b>${order.customerPhoneNumber}</b></h5>

            <h5>Ngày Lập hóa Đơn : <b>${order.createdAt}</b></h5>


            <table class="table">

                <thead>
                <tr>
                    <th>
                        STT
                    </th>
                    <th>
                        Mã Sản Phẩm
                    </th>
                    <th>
                        Tên Sản Phẩm
                    </th>
                    <th>
                        Màu
                    </th>
                    <th>
                        Số Lương
                    </th>

                    <th>
                        Giá Tiền
                    </th>
                </tr>

                </thead>
                <tbody>
                <c:forEach items="${order.orderDetails}" var="orderDetails" varStatus="varStatus">
                    <tr>
                        <td>
                            <span>${varStatus.index}</span>
                        </td>
                        <td>
                            <span>${orderDetails.product.id}</span>
                        </td>
                        <td>
                            <span>${orderDetails.product.name}</span>
                        </td>
                        <td>
                            <span>${orderDetails.productColor.value}</span>
                        </td>
                        <td>
                            <span>${orderDetails.amount}</span>
                        </td>
                        <td>
                            <span class="tien">${orderDetails.price}</span>
                        </td>

                    </tr>
                </c:forEach>


                </tbody>


            </table>
            <h3> Tổng Tiền <b id="tongTien"> 1000000 </b></h3>

        </div>
    </div>

</div>