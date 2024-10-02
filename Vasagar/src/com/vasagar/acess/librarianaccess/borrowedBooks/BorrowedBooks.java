package com.vasagar.acess.librarianaccess.borrowedBooks;

import com.vasagar.dto.Book;
import com.vasagar.dto.BorrowedBook;

import java.util.List;
import java.util.ListIterator;

public class BorrowedBooks {
    private BorrowedBooksViewModel borrowedBooksViewModel;

    public BorrowedBooks(){
        borrowedBooksViewModel=new BorrowedBooksViewModel(this);
    }

    public void init() {
        getBorrowedBookDetails();
    }

    private void getBorrowedBookDetails() {
        System.out.println("Displaying Borrowed Book Details");
        System.out.println("========================");
        List<BorrowedBook> borrowedBooks=borrowedBooksViewModel.getBorrowedBooks();

        ListIterator<BorrowedBook> borrowedBookListIterator=borrowedBooks.listIterator();
        while(borrowedBookListIterator.hasNext()){
            System.out.println(borrowedBookListIterator.next());
        }
        System.out.println("========================");
    }
}
