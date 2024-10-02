package com.vasagar.login;

import com.vasagar.LoginListener;
import com.vasagar.acess.librarianaccess.LibrarianScreen;
import com.vasagar.acess.useraccess.UserScreen;
import com.vasagar.dto.Librarian;
import com.vasagar.dto.User;

import java.util.Scanner;


public class Login implements LoginListener {
    private LoginViewModel loginViewModel;
    public Login() {
        loginViewModel=new LoginViewModel(this);
    }

    public void userLogin() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter User ID:");
        String userId=scanner.next();

        System.out.println("Enter User Password");
        String userPassword=scanner.next();

        loginViewModel.validateUser(userId,userPassword);
    }

    public void showError() {
        System.out.println("User does not exists");
        System.out.println("Please enter a valid UserID and Password");
        userLogin();
    }

    @Override
    public void loginSuccess(User loggedInUser) {
        if(loggedInUser.isAdmin()){
            LibrarianScreen librarianScreen=new LibrarianScreen();
            librarianScreen.init(loggedInUser);
        }else{
            UserScreen userScreen=new UserScreen();
            userScreen.init(loggedInUser);
        }
    }

    @Override
    public void loginFailed() {
        System.out.println("Please enter a valid User Id and Password");
    }
}
