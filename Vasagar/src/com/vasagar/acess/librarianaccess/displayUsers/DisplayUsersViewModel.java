package com.vasagar.acess.librarianaccess.displayUsers;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.User;

import java.util.List;

class DisplayUsersViewModel {
    private DisplayUsers displayUsers;

    DisplayUsersViewModel(DisplayUsers displayUsers) {
        this.displayUsers=displayUsers;
    }

    public List<User> getAllUsers() {
        return VasagarRepository.getInstance().getAllBooksFromDB();
    }
}
