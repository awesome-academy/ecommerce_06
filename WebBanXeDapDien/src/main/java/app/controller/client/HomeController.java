package app.controller.client;

import app.bean.Product;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
        return "redirect:/page/1";
    }

    @GetMapping("/page/{pageNumber}")
    public String pageNumber(@PathVariable int pageNumber, Model model) {
        List<Product> products = productService.getProductListByPage(pageNumber, 24);
        model.addAttribute("products", products);
        int count = productService.getPageCount();
        model.addAttribute("pageCount", count % 24 > 0 ? (count / 24 + 1) : (count / 24));
        model.addAttribute("pageNumber", pageNumber);
        return "home";
    }
}
