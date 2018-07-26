package com.telerik.best_style_ltd.services;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.repositories.PatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class PatternServiceImpl implements PatternService{
  private PatternRepository patternRepository;

  @Autowired
    public PatternServiceImpl(PatternRepository patternRepository) {
        this.patternRepository = patternRepository;
    }

    @Override
    public void addPattern(Pattern p) {
     patternRepository.addPattern( p );
    }

    @Override
    public void updatePattern(Pattern p) {

    }

    @Override
    public List<Pattern> listPatterns() {
        return null;
    }

    @Override
    public Pattern getPatternById(int id) {
        return null;
    }

    @Override
    public void removePattern(int id) {

    }
}
