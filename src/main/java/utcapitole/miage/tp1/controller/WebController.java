package utcapitole.miage.tp1.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello/form")
    public String form() {
        return "redirect:/form-user.html";
    }

    @RequestMapping("form/entier")
    public String entier() {
        return "redirect:/entier.html";
    }

}
