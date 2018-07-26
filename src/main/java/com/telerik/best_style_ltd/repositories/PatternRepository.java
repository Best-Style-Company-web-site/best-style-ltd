package com.telerik.best_style_ltd.repositories;

import com.telerik.best_style_ltd.entities.Pattern;

import java.util.List;

public interface PatternRepository {

     void addPattern(Pattern p);
     void updatePattern(Pattern p);
     List<Pattern> listPattern();
     Pattern getPatternById(int id);
     void removePattern(int id);

}
