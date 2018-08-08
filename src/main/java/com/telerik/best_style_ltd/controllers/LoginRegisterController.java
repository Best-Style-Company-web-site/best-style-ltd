package com.telerik.best_style_ltd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/best_style")
public class LoginRegisterController {

    @GetMapping()
    public String createHomePage(Model model) {
        model.addAttribute("view","login_and_register_tabbed_form");
        return "login_and_register_tabbed_form";
    }


    @GetMapping("portfolio")
    public String createPortfolioPage(Model model) {
        return "portfolio";
    }
}
