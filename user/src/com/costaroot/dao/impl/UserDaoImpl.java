package com.costaroot.dao.impl;

import com.costaroot.dao.UserDao;
import com.costaroot.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    // private static Map<User,Integer> users = new HashMap<>();
    private static UserDaoImpl userDao = new UserDaoImpl();
    private static Set<User> users = new HashSet<>();

    private UserDaoImpl() {
    }

    public static UserDaoImpl getInstance() {
        return userDao;
    }

    static {
        users.add(new User("Dmytro", "Kostiukevych", 27));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void editUser(User user) {
        System.out.println("This feature fix in future.");
    }

    @Override
    public void showAll() {
        System.out.println("-------------");
        users.
                stream().
                forEach(u -> System.out.println(u));
    }
}
