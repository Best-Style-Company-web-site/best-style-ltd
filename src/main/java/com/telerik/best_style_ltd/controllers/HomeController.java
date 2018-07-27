package com.telerik.best_style_ltd.controllers;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.services.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String createHomePage(Model model) {
        return "home";
    }


    @GetMapping("portfolio")
    public String createPortfolioPage(Model model) {
        return "portfolio";
    }
}
