<%@ page import="app.bean.Product" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="ecommerce-widget">

    <div class="row">
        <div class="container-fluid">
            <h2>danh sách sản phẩm </h2>

            <table class="table">
                <%--<thead>--%>
                <%--<tr>--%>
                <%--<th>Ảnh</th>--%>
                <%--<th>Tên Sản phẩm</th>--%>
                <%--<th> Giá</th>--%>
                <%--<th>Nhà sản xuất</th>--%>
                <%--<th>Edit</th>--%>
                <%--<th>Delete</th>--%>
                <%--</tr>--%>
                <%--</thead>--%>
                <tbody>
                <%--<c:forEach items="${products}" var="product">--%>
                    <%
                        int num = 1;
                       List<Product>products = (List<Product>) request.getAttribute("products");
                        for(int i = 0; i < products.size(); i++) {
                          if(num == 1)
                              out.write("<tr>");%>
                <td><a href=""><img style="cursor: pointer" src="/assets/images/products/<%=products.get(i).getMainPhoto()%>"></a>
                    <div style="text-align: center">
                        <span><%=products.get(i).getName()%></span>
                    </div>

                </td>
                    <%
                        if(num == 4 || num == products.size()-1){
                            out.write("</tr>");
                             num =1;
                         }
                        else{
                            num++;
                        }
                        }
                        %>

                <%--<td><img src="/assets/images/products/${product.mainPhoto}"></td>--%>


                <%--<td>${product.name}</td>--%>
                <%--<td>${product.price}</td>--%>
                <%--<td>${product.supplier.name}</td>--%>
                <%--<td>--%>
                <%--<button class="btn btn-info "> Edit</button>--%>
                <%--</td>--%>

                <%--<td>--%>
                <%--<button class="btn btn-info "> Delete </button>--%>
                <%--</td>--%>

                <%--</c:forEach>--%>

        </div>

        </tbody>
        </table>
    </div>
</div>

</div>