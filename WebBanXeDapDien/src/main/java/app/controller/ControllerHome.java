package app.controller;

import app.Bean.Products;
import app.service.ProductService;
import app.service.impl.ProductServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ControllerHome {
    private static final Logger logger = Logger.getLogger(ControllerHome.class);

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String home(Model model){
        List<Products> productList = productService.getProductListByPage(1,24);
        model.addAttribute("productList",productList);
        long countPage =  (productService.getPageCount()/24);
        if(countPage%24 > 0)
        model.addAttribute("pageCount",countPage+1);
        logger.info(productService.getPageCount());

        return "home";
    }
//    @GetMapping("/Featured/{id}")
//    public String home(Model model, @PathVariable int id){
//        List<Products> productList = productService.getProductListByPage(id,24);
//        model.addAttribute("productList",productList);
//        long countPage =  (productService.getPageCount()/24);
//
//        return "home";
//    }
}
