package com.vasagar.acess.useraccess.displayBorrowedBooks;

import com.vasagar.dto.Book;
import com.vasagar.dto.User;

import java.util.List;

class DisplayBorrowedBookViewModel {
    private DisplayBorrowedBooks displayBorrowedBooks;

    public DisplayBorrowedBookViewModel(DisplayBorrowedBooks displayBorrowedBooks) {
        this.displayBorrowedBooks=displayBorrowedBooks;
    }

    public List<Book> getBorrowedBooksOfUser(User user) {
        return user.getUserBorrowedBooks();
    }
}
