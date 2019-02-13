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

            logger.info(bindingResult.getFieldError().getField());

        }

        List<Cart> cartList = (List<Cart>) httpSession.getAttribute("cart");

        if (cartList == null) {

            cartList = new ArrayList<Cart>();

            cartList.add(cart);

        } else {

            int index = cartList.indexOf(cart);

           logger.info(index);

            if (index == -1)
                cartList.add(cart);
            else
                cartList.get(index).setQuantity(cart.getQuantity() + cartList.get(index).getQuantity());

        }

        httpSession.setAttribute("cart", cartList);

        return cartList;
    }

    @PostMapping(value = "/deletecart", headers = {"Accept=text/xml, application/json"})
    @ResponseBody
    public List<Cart> deleteTocart(Cart cart, HttpSession httpSession, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            logger.info(bindingResult.getFieldError().getField());
        }

        List<Cart> cartList = (List<Cart>) httpSession.getAttribute("cart");

        if(cartList != null){

            int i = cartList.indexOf(cart);

            if(i != -1){
                cartList.remove(i);
                httpSession.setAttribute("cart", cartList);
            }

        }
        return cartList;
    }
}
