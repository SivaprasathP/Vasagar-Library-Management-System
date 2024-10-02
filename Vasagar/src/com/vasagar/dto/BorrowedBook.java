package com.vasagar.dto;

public class BorrowedBook {
    private Book borrowedBook;
    private User borrowedUser;
    private String borrowedDate;
    private String returnDate;

    public BorrowedBook(Book borrowedBookName, User borrowedUserName, String borrowedDate, String returnDate) {
        this.borrowedBook = borrowedBookName;
        this.borrowedUser = borrowedUserName;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public User getBorrowedUser() {
        return borrowedUser;
    }

    public void setBorrowedUser(User borrowedUser) {
        this.borrowedUser = borrowedUser;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "\nBook Name=" + borrowedBook.getBookTitle() +
                "\nBook ID="+ borrowedBook.getBookID()+
                "\nUser Name=" + borrowedUser.getUserName() +
                "\nUser ID="+ borrowedUser.getUserID()+
                "\nBorrowed Date=" + borrowedDate +
                "\nReturn Date=" + returnDate +"\n";
    }
}
