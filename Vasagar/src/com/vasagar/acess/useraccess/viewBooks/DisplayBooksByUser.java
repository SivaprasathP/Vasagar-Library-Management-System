package com.vasagar.acess.useraccess.viewBooks;

import com.vasagar.acess.librarianaccess.displayBooks.DisplayBooks;

public class DisplayBooksByUser extends DisplayBooks{
    private DisplayBooksByUserViewModel displayBooksByUserViewModel;

    public DisplayBooksByUser(){
        displayBooksByUserViewModel=new DisplayBooksByUserViewModel(this);
    }
}
