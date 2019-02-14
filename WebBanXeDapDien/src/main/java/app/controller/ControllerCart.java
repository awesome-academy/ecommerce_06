package app.controller;

import app.bean.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.*;
import org.apache.log4j.Logger;

@Controller
public class ControllerCart {

    private static final Logger logger = Logger.getLogger(ControllerCart.class);

    @PostMapping(value = "/addtocart", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Cart> addTocart(Cart cart, HttpSession httpSession, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            logger.error(bindingResult.getFieldError().getField());

        }

        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");

        if (carts == null) {

            carts = new ArrayList<Cart>();

            carts.add(cart);

        } else {

            int index = carts.indexOf(cart);

            logger.info(index);

            if (index == -1)
                carts.add(cart);
            else
                carts.get(index).setQuantity(cart.getQuantity() + carts.get(index).getQuantity());

        }

        httpSession.setAttribute("cart", carts);

        return carts;
    }

    @PostMapping(value = "/deletecart", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Cart> deleteTocart(Cart cart, HttpSession httpSession, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            logger.info(bindingResult.getFieldError().getField());
        }


        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");

        if (carts == null)
            return null;

        int i = carts.indexOf(cart);

        if (i != -1) {
            carts.remove(i);
            httpSession.setAttribute("cart", carts);
        }
        return carts;
    }
}
