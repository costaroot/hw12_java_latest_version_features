package com.costaroot.service;

import com.costaroot.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void removeUser(User user);

    public void editUser(User user);

    public void showAll();
}
