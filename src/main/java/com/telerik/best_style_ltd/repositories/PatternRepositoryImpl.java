package com.telerik.best_style_ltd.repositories;

import com.telerik.best_style_ltd.entities.Pattern;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatternRepositoryImpl implements PatternRepository{
    private SessionFactory factory;

    @Autowired
    public PatternRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public void addPattern(Pattern pattern) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            pattern = new Pattern("Skirt", "Short", "42-48", "cotton", "Oksana Hristova", 10, 20);
            session.save( pattern );
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updatePattern(Pattern p) {

    }

    @Override
    public List<Pattern> listPatterns() {
        List<Pattern> patterns = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            patterns = session.createQuery("from Pattern").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return patterns;
    }

    @Override
    public Pattern getPatternById(int id) {
        Pattern pattern = null;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            pattern = session.get(Pattern.class, id);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pattern;
    }

    @Override
    public void removePattern(int id) {
        Pattern pattern = null;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            pattern = session.get(Pattern.class, id);
            session.delete( pattern );
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
