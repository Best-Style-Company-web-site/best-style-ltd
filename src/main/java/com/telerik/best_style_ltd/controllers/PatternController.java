package com.telerik.best_style_ltd.controllers;

import com.telerik.best_style_ltd.services.PatternService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patterns")
public class PatternController {
    private PatternService patternService;

    public PatternController(PatternService patternService) {
        this.patternService = patternService;
    }
}
