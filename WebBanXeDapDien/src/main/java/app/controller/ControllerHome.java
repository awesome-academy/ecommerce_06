package app.controller;

import app.Bean.ProductDetails;
import app.Bean.Products;
import app.Bean.ProductsColors;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.function.Consumer;

@Controller
public class ControllerHome {
    private static final Logger logger = Logger.getLogger(ControllerHome.class);

    @Autowired
    ProductService productService;
    @Autowired
    ProductDetailsService productDetailsService;

    @GetMapping("/")
    public String home(Model model) {
        List<Products> productList = productService.getProductListByPage(1, 24);
        model.addAttribute("productList", productList);
        int count = productService.getPageCount();
        int pageCount = count / 24;
        if (count % 24 > 0)
            model.addAttribute("pageCount", pageCount + 1);
        return "home";
    }


    @GetMapping("/product/{id}")
    public String detailProduct(@PathVariable Integer id, Model model) {
        Products product = productService.getProduct(id);
        ProductDetails productDetailbyProductId = productDetailsService.getProductDetailbyProductId(id);
        model.addAttribute("product", product);
        model.addAttribute("productDetail", productDetailbyProductId);
        product.getProductsColors().forEach(new Consumer<ProductsColors>() {
            @Override
            public void accept(ProductsColors productsColors) {
                logger.info(productsColors);
            }
        });
        return "detail";
    }
}
