package app.controller;

import app.service.OrderService;
import app.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AdminController {

    private static final Logger logger = Logger.getLogger(AdminController.class);

    @Autowired
    OrderService orderService;
    @Autowired
    ProductService productService;

    @GetMapping("/admin/dashboard")
    public String homeAdmin() {
        return "DashBoard";
    }

    @GetMapping(value = "/admin/revenue", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public String revenue() {
        int[] revenue = orderService.getRevenue();
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(revenue);
        } catch (JsonProcessingException e) {
            logger.error(e);
        }
        return json;
    }

}