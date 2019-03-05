package app.controller.admin;

import app.bean.Order;
import app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/orders")
public class OrderAdminController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{id}")
    public String showDetailOrder(@PathVariable("id") Integer id, Model model) {
        Order order = orderService.findOrderById(id);
        model.addAttribute("order", order);
        return "OrderDetailAdmin";
    }

    @GetMapping("")
    public String Order(Model model) {
        model.addAttribute("orders", orderService.findAll());
        return "orderAdmin";
    }

    @PostMapping(value = "/update", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public boolean updateOrder(Order order) {
        return orderService.update(order);
    }
}
