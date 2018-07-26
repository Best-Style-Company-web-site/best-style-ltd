package com.telerik.best_style_ltd.repositories;

import com.telerik.best_style_ltd.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements  UserRepository {
    private SessionFactory factory;

    @Autowired
    UserRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void addUser(User user) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            users = session.createQuery("from User").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        try (Session session = factory.openSession();) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }

    @Override
    public void removeUser(int id) {
        User user = null;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
