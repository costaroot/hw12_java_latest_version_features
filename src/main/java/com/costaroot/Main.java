package com.costaroot;

import com.costaroot.model.User;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is future manage user app.");
        User user = new User("Vasia","Nesterenko",23);
        System.out.println(user.toString());
    }
}
