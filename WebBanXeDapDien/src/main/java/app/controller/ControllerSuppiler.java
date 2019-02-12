package app.controller;

import app.bean.Supplier;
import java.util.List;
import app.service.SupplierService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerSuppiler {

    private static final Logger logger = Logger.getLogger(ControllerSuppiler.class);

    @Autowired
    SupplierService supplierService;

    @PostMapping(value = "/getsuppilers", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Supplier> getSuppliers() {
        List<Supplier> suppliers = supplierService.findAll();
        return suppliers;
    }
}
