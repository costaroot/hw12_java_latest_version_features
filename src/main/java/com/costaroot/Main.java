package com.costaroot;

import com.costaroot.menu.MainMenu;
import com.costaroot.model.User;
import com.costaroot.service.UserService;
import com.costaroot.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is future manage user app.");
        UserService userService = UserServiceImpl.getInstance();
        userService.showAll();
        userService.addUser(new User("dev","fifo",24));
        userService.showAll();
        userService.removeUser(new User("dev","fifo",24));
        userService.showAll();
        MainMenu panel =MainMenu.getMenuPanel();
        panel.show();
    }
}
