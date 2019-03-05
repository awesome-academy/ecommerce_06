package app.controller.client;

import app.bean.Cart;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String checkout(HttpSession httpSession, Model model) {
        List<Cart> carts = (List<Cart>) httpSession.getAttribute("cart");
        model.addAttribute("carts", carts);
        return "checkout";
    }
}
