package app.controller.client;

import app.bean.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

import org.apache.log4j.Logger;

@Controller
public class CartController {
    private static final Logger logger = Logger.getLogger(CartController.class);

    @PostMapping(value = "/cart/create", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Cart> create(Cart cart, HttpSession httpSession, BindingResult bindingResult) {
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
                carts.get(index).setQuantity((short) (cart.getQuantity() + carts.get(index).getQuantity()));
        }
        httpSession.setAttribute("cart", carts);
        return carts;
    }

    @GetMapping(value = "/cart", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Cart> Cart(HttpSession httpSession) {
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        return carts;
    }

    @PostMapping(value = "/cart/delete", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public boolean delete(Cart cart, HttpSession httpSession, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            logger.info(bindingResult.getFieldError().getField());
        }
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");

        if (carts == null)
            return false;
        int i = carts.indexOf(cart);
        if (i != -1) {
            carts.remove(i);
            httpSession.setAttribute("cart", carts);
            return true;
        }
        return false;
    }

    @GetMapping("/carts")
    public String cart(HttpSession httpSession, Model model) {
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        model.addAttribute("carts", carts);
        return "cart";
    }

    @PostMapping("/cart/update")
    @ResponseBody
    public boolean update(Cart cart, HttpSession httpSession, BindingResult bindingResult) {
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        if (carts == null)
            return false;
        int index = carts.indexOf(cart);

        if (index != -1) {
            carts.get(index).setQuantity(cart.getQuantity());
            return true;
        }
        return false;
    }
}
