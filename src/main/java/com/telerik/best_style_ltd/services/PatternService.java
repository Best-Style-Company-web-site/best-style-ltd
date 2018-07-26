package com.telerik.best_style_ltd.services;

import com.telerik.best_style_ltd.entities.Pattern;

import java.util.List;

public interface PatternService {

    void addPattern(Pattern p);
    void updatePattern(Pattern p);
    List<Pattern> listPatterns();
    Pattern getPatternById(int id);
    void removePattern(int id);
}
