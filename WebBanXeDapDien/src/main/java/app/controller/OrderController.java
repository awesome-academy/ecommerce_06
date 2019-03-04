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
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    private static final Logger logger = Logger.getLogger(OrderController.class);

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailsService productDetailsService;

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/orders/create", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public boolean createOrder(Order order, HttpSession httpSession, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.error(bindingResult.getFieldError().getField());
        }
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        if (order == null || carts == null) {
            return false;
        }
        List<OrderDetail> orderDetails = ObjectMapperUtils.orderDetailsMap(carts);
        order.setOrderDetails(orderDetails);
        if (orderService.save(order) != null)
            return true;
        return false;
    }

    @GetMapping("/admin/orders/show/{id}")
    public String showDetailOrder(@PathVariable("id") Integer id, Model model) {
        Order order = orderService.findOrderById(id);
        model.addAttribute("order", order);
        return "OrderDetailAdmin";
    }

    @GetMapping("/admin/order")
    public String Order(Model model) {
        model.addAttribute("orders", orderService.findAll());
        return "orderAdmin";
    }

    @PostMapping(value = "/admin/order/update", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public boolean updateOrder(Order order) {
        return orderService.update(order);
    }


}
