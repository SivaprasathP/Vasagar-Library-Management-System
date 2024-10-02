package com.vasagar.acess.librarianaccess.addUser;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.User;

class AddUserViewModel {
    private AddUser addUser;

    AddUserViewModel(AddUser addUser){
        this.addUser=addUser;
    }

    public void addNewUser(String userName, String userID, String userPassword) {
        User newUser=new User(userName,userID,userPassword);
        VasagarRepository.getInstance().addNewUserToDB(newUser);
    }
}
