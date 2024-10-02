package com.vasagar.acess.librarianaccess.displayBooks;

import com.vasagar.dto.Book;

import java.util.List;
import java.util.ListIterator;

public class DisplayBooks {
    private DisplayBooksViewModel displayBooksViewModel;

    public DisplayBooks(){
        displayBooksViewModel=new DisplayBooksViewModel(this);
    }

    public void init() {
        displayAllBooks();
    }

    private void displayAllBooks() {
        System.out.println("Displaying All The Books");
        System.out.println("========================");
        List<Book> books=displayBooksViewModel.getBooks();
        ListIterator<Book> bookListIterator=books.listIterator();

        while(bookListIterator.hasNext()) {
            System.out.println(bookListIterator.next());
        }
        System.out.println("========================");
    }
}
