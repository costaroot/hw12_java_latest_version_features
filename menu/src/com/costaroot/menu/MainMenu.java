package com.costaroot.menu;

public class MainMenu {
    private final String [] mainMenuPanel = {"1.Show all users",
            "2.Add user",
            "3.Edit user",
            "4.Remove user",
            "5.Exit"
            };
    private static MainMenu menu = new MainMenu();

    private MainMenu(){
    }

    public static MainMenu getMenuPanel(){
        return menu;
    }

    public void show(){
        for (String me:mainMenuPanel) {
            System.out.println(me);
        }
    }
}
