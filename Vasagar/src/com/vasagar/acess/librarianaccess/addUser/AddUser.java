package com.vasagar.acess.librarianaccess.addUser;

import java.util.Scanner;

public class AddUser {
    private AddUserViewModel addUserViewModel;

    public AddUser(){
        addUserViewModel=new AddUserViewModel(this);
    }

    public void init() {
        this.getUserDetails();
    }

    public void getUserDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter User Name:");
        String userName=scanner.next();
        System.out.println("Enter User ID:");
        String userID=scanner.next();
        System.out.println("Enter User Password");
        String userPassword=scanner.next();

        addUserViewModel.addNewUser(userName,userID,userPassword);

//        scanner.close();
    }


}
