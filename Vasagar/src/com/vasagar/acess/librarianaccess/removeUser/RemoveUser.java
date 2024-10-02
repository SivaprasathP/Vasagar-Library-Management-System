package com.vasagar.acess.librarianaccess.removeUser;

import java.util.Scanner;

public class RemoveUser {
    private RemoveUserViewModel removeUserViewModel;

    public RemoveUser(){
        removeUserViewModel=new RemoveUserViewModel(this);
    }

    public void init() {
        getRemovingUserDetails();
    }

    private void getRemovingUserDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter UserID that to be removed:");
        String userID=scanner.next();
        System.out.println("Enter UserName that to be removed:");
        String userName=scanner.next();

        removeUserViewModel.removeUser(userID,userName);

        scanner.close();
    }


    public void showSuccessfullMessage() {
        System.out.println("User Removed Successfully");
    }

    public void showError() {
        System.out.println("ERROR: This User does not exists");
    }
}
