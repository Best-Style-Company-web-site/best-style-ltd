package com.telerik.best_style_ltd.config;

import com.telerik.best_style_ltd.entities.Pattern;
import com.telerik.best_style_ltd.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactorySession {

    @Bean
    public SessionFactory createSessionFactory(){
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Pattern.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

    }
}
