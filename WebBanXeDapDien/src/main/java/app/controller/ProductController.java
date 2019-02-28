package app.controller;

import app.Utils.FileUtils;
import app.Utils.ObjectMapperUtils;
import app.bean.Product;
import app.bean.ProductDetail;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.*;
import java.util.List;

@Controller
public class ProductController {
    private static final Logger logger = Logger.getLogger(ProductController.class);

    @Autowired
    ServletContext context;

    @Autowired
    ProductService productService;
    @Autowired
    ProductDetailsService productDetailsService;


    @GetMapping("/products/{id}")
    public String detailProduct(@PathVariable Integer id, Model model) {
        Product product = productService.getProduct(id);
        ProductDetail productDetail = productDetailsService.getProductDetailbyProductId(id);
        model.addAttribute("product", product);
        model.addAttribute("productDetail", productDetail);
        return "detail";
    }

    @PostMapping("/admin/addproduct")
    @ResponseBody
    public boolean addproduct(@RequestParam("file") MultipartFile file) {
        try {
            File saveFile = FileUtils.saveFile(file.getBytes(), "" + file.getOriginalFilename());
            return productService.saveProducts(FileUtils.ReadFileProducts(saveFile));
        } catch (Exception e) {
            logger.error(e);
            return false;
        }
    }

    @GetMapping("/admin/updateproduct/{id}")
    public String editProduct(Model model, @PathVariable("id") Integer id) {
        detailProduct(id, model);
        return "EditProduct";
    }

    @PostMapping("/admin/updateproduct")
    @ResponseBody
    public boolean update(Product product, ProductDetail productDetail) {
        logger.info(product);
        logger.info(productDetail);
        return  productService.saveProduct(product,productDetail);
    }

    @GetMapping("/admin/products")
    public String productsAdmin(Model model) {
        List<Product> products = productService.getProductListByPage(1, 24);
        model.addAttribute("products", products);
        return "ProductAdmin";
    }
}
