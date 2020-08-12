package com.costaroot.dao.impl;

import com.costaroot.dao.UserDao;
import com.costaroot.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {
    private static Map<User,Integer> users = new HashMap<>();
    private static UserDaoImpl userDao = new UserDaoImpl();
    private static int id = 0;

    private UserDaoImpl() {
    }

    public static UserDaoImpl getInstance(){
        return userDao;
    }
    static {
        users.put(new User("admin","admin",0),id);
        id++;
    }

    @Override
    public void addUser(User user) {
        users.put(user,id);
        id++;
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
        users.keySet().
                stream().
                forEach(u-> System.out.println(u));
    }
}
