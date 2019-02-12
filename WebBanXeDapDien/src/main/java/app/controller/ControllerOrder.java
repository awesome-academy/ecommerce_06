package app.controller;

import app.Utils.ObjectMapperUtils;
import app.bean.Cart;
import app.bean.Order;
import app.bean.OrderDetail;
import app.service.OrderService;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
public class ControllerOrder {

    private static final Logger logger = Logger.getLogger(ControllerOrder.class);

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailsService productDetailsService;

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/addorder", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public boolean addOrder(Order order, HttpSession httpSession, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.error(bindingResult.getFieldError().getField());
        }
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        if (order == null || carts == null) {
            return false;
        }
        order.setCreatedAt(new Timestamp(new Date().getTime()));
        List<OrderDetail> orderDetails = ObjectMapperUtils.orderDetailsMap(carts);
        order.setOrderDetails(orderDetails);
        if (orderService.save(order) != null)
            return true;
        return false;
    }

}
