package com.vasagar.dto;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userID;
    private String userPassword;
    private boolean isAdmin;
    private List<Book> userBorrowedBooks;



    public User(String userName, String userID, String userPassword, boolean isAdmin) {
        this.userName = userName;
        this.userID = userID;
        this.userPassword = userPassword;
        this.isAdmin = isAdmin;
        this.userBorrowedBooks=new ArrayList<>();
    }

    public User(String userName, String userID, String userPassword) {
        this.userName = userName;
        this.userID = userID;
        this.userPassword = userPassword;
        this.isAdmin = false;
        this.userBorrowedBooks=new ArrayList<>();
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<Book> getUserBorrowedBooks() {
        return userBorrowedBooks;
    }

    public void setUserBorrowedBooks(List<Book> userBorrowedBooks) {
        this.userBorrowedBooks = userBorrowedBooks;
    }

    @Override
    public String toString() {
        return "\nUser Name=" + userName +
                "\nUser ID=" + userID +
                "\nAdmin=" +(isAdmin?"Yes":"No") +"\n";
    }

    public void addBorrowedBookToUser(Book book) {
        this.userBorrowedBooks.add(book);
    }
}
