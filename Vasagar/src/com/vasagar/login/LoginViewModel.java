package com.vasagar.login;

import com.vasagar.LoginListener;
import com.vasagar.acess.librarianaccess.LibrarianScreen;
import com.vasagar.acess.useraccess.UserScreen;
import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.User;


class LoginViewModel {
    private LoginListener loginListener;

    public LoginViewModel(LoginListener login) {
        this.loginListener=login;
    }

    public void validateUser(String userID,String userPassword){
        User loggedInUser= VasagarRepository.getInstance().validate(userID,userPassword);
        if(loggedInUser!=null){
            loginListener.loginSuccess(loggedInUser);
        }else{
            loginListener.loginFailed();
        }
    }


}
