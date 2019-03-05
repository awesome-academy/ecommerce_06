<%@ page import="app.bean.Product" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="ecommerce-widget">
    <button id="themsanpham" class="btn-danger">Thêm sản phẩm</button>
    <input hidden id="file" type="file"/>

    <div class="row">
        <div class="container-fluid">
            <h2>danh sách sản phẩm </h2>

            <table class="table">
                <tbody>
                    <%
                        int num = 1;
                       List<Product>products = (List<Product>) request.getAttribute("products");
                        for(int i = 0; i < products.size(); i++) {
                          if(num == 1)
                              out.write("<tr>");%>
                <td><a href="/admin/products/<%=products.get(i).getId()%>"><img
                        style="cursor: pointer; position: relative"
                        src="/assets/images/products/<%=products.get(i).getMainPhoto()%>"></a>
                    <div style="position: absolute; margin-top: -20px; margin-left: 30px; background-color: #a3d133; border: #0b2e13 solid 1px ">
                        <ul>
                            <li style="list-style: none;text-decoration: none">Tên sản phẩm
                                : <%=products.get(i).getName()%>
                            </li>
                            <li style="list-style: none;text-decoration: none">Giá sản phẩm
                                : <%=products.get(i).getPrice()%>
                            </li>
                            <li style="list-style: none;text-decoration: none">Nhà Sản xuất
                                : <%=products.get(i).getSupplier().getName()%>
                            </li>
                        </ul>

                    </div>
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
        </div>

        </tbody>
        </table>
    </div>
</div>

</div>