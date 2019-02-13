package app.controller;

import app.bean.Product;
import app.bean.ProductColor;
import app.bean.ProductDetail;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerHome {
    private static final Logger logger = Logger.getLogger(ControllerHome.class);

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailsService productDetailsService;

    @GetMapping("/")
    public String home(Model model) {

        List<Product> products = productService.getProductListByPage(1, 24);

        model.addAttribute("productList", products);

        int count = productService.getPageCount();

        int pageCount = count / 24;

        if (count % 24 > 0)
            model.addAttribute("pageCount", pageCount + 1);
        else
            model.addAttribute("pageCount", pageCount);

        return "home";
    }


}
