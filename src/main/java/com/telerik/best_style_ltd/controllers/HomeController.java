package com.telerik.best_style_ltd.controllers;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.services.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/home")
public class HomeController {

    @GetMapping("/")
    public String createHomePage() {
        return "home";
    }
}
