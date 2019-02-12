package app.controller;

import app.bean.Product;
import app.bean.ProductColor;
import app.bean.ProductDetail;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.function.Consumer;

@Controller
public class ControllerDetailProduct {

    @Autowired
    ProductService productService;
    @Autowired
    ProductDetailsService productDetailsService;


    @GetMapping("/products/{id}")
    public String detailProduct(@PathVariable Integer id, Model model) {

        Product product = productService.getProduct(id);

        ProductDetail productDetailbyProductId = productDetailsService.getProductDetailbyProductId(id);

        model.addAttribute("product", product);

        model.addAttribute("productDetail", productDetailbyProductId);

        return "detail";
    }

}
