package com.telerik.best_style_ltd.controllers;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.services.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/patterns")
public class PatternController {
    private PatternService patternService;

    @Autowired
    public PatternController(PatternService patternService) {
        this.patternService = patternService;
    }

    @RequestMapping(value = "/add",
    method = RequestMethod.POST)
    public void addPattern(@RequestBody Pattern pattern) {
        this.patternService.addPattern( pattern );
       // return "add:/";
    }
}
