package com.costaroot.service.impl;

import com.costaroot.dao.UserDao;
import com.costaroot.dao.impl.UserDaoImpl;
import com.costaroot.model.User;
import com.costaroot.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl userService = new UserServiceImpl();
    private UserDao userDao = UserDaoImpl.getInstance();

    private UserServiceImpl(){
    }

    public static UserServiceImpl getInstance(){
        return userService;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void removeUser(User user) {
        userDao.removeUser(user);
    }

    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Override
    public void showAll() {
        userDao.showAll();
    }
}
