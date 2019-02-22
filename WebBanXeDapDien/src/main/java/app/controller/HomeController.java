package app.controller;

import app.bean.Product;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    private static final Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailsService productDetailsService;

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = productService.getProductListByPage(1, 24);
        model.addAttribute("products", products);
        int count = productService.getPageCount();
        int pageCount = count / 24;
        if (count % 24 > 0)
            model.addAttribute("pageCount", pageCount + 1);
        else
            model.addAttribute("pageCount", pageCount);

        return "home";
    }

    @PostMapping("/search")
    public String search(String name, int suppiler, Model model) {
        List<Product> products = productService.getProductByNameAndSuppilerId(name, suppiler);
        model.addAttribute("products", products);
        model.addAttribute("pageCount", 0);
        return "home";
    }


}
