package com.telerik.best_style_ltd.service;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactorySession {

    @Bean
    public SessionFactory createSessionFactory(){
        System.out.println("Session Factory created.");

        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Pattern.class)
                .buildSessionFactory();
    }
}
