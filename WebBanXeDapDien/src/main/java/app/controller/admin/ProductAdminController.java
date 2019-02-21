package app.controller.admin;

import app.Utils.FileUtils;
import app.bean.Product;
import app.bean.ProductDetail;
import app.controller.client.ProductController;
import app.service.OrderService;
import app.service.ProductDetailsService;
import app.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/admin/products")
public class ProductAdminController {
    private static final Logger logger = Logger.getLogger(ProductAdminController.class);

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailsService productDetailsService;

    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    @ResponseBody
    public boolean newProducts(@RequestParam("file") MultipartFile file) {
        try {
            File saveFile = FileUtils.saveFile(file.getBytes(), "" + file.getOriginalFilename());
            return productService.saveProducts(FileUtils.ReadFileProducts(saveFile));
        } catch (Exception e) {
            logger.error(e);
            return false;
        }
    }

    @GetMapping("/{id}")
    public String show(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("product", productService.getProduct(id));
        model.addAttribute("productDetail", productDetailsService.getProductDetailbyProductId(id));
        return "EditProduct";
    }

    @PostMapping("/update")
    @ResponseBody
    public boolean update(Product product, ProductDetail productDetail) {
        logger.info(product);
        logger.info(productDetail);
        return productService.saveProduct(product, productDetail);
    }

    @GetMapping("")
    public String productsAdmin(Model model) {
        List<Product> products = productService.getProductListByPage(1, 24);
        model.addAttribute("products", products);
        return "ProductAdmin";
    }
}
