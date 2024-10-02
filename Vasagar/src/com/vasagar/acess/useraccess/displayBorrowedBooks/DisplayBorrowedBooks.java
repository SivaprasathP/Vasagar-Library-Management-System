package com.vasagar.acess.useraccess.displayBorrowedBooks;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;
import com.vasagar.dto.User;

import java.util.List;

public class DisplayBorrowedBooks {
    private DisplayBorrowedBookViewModel displayBorrowedBookViewModel;

    public DisplayBorrowedBooks(){
        displayBorrowedBookViewModel=new DisplayBorrowedBookViewModel(this);
    }

    public void init(User user) {
        displayAllBorrowedBooks(user);
    }

    private void displayAllBorrowedBooks(User user) {
        List<Book> borrowedBooksByUser=displayBorrowedBookViewModel.getBorrowedBooksOfUser(user);

        System.out.println("Displaying Borrowed books of "+user.getUserName());
        System.out.println("========================");

        for(Book book:borrowedBooksByUser){
            System.out.println(book);
        }
        System.out.println("========================");
    }
}
