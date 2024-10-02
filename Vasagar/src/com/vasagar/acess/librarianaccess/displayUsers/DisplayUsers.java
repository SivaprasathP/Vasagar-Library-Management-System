package com.vasagar.acess.librarianaccess.displayUsers;

import com.vasagar.dto.User;

import java.util.List;
import java.util.ListIterator;

public class DisplayUsers {
    private DisplayUsersViewModel displayUsersViewModel;

    public DisplayUsers(){
        displayUsersViewModel=new DisplayUsersViewModel(this);
    }

    public void init() {
        displayUsers();
    }

    private void displayUsers() {
        System.out.println("Displaying All Users");
        System.out.println("========================");
        List<User> users=displayUsersViewModel.getAllUsers();
        ListIterator<User> userListIterator=users.listIterator();

        while(userListIterator.hasNext()){
            System.out.println(userListIterator.next());
        }
        System.out.println("========================");
    }
}
