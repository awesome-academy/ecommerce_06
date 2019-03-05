package app.controller.client;

import app.bean.Supplier;

import java.util.List;

import app.service.SupplierService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SupplierController {
    private static final Logger logger = Logger.getLogger(SupplierController.class);

    @Autowired
    SupplierService supplierService;

    @GetMapping(value = "/supplier", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Supplier> supplier() {
        List<Supplier> suppliers = supplierService.findAll();
        return suppliers;
    }
}
