package com.vasagar.acess.librarianaccess.addBook;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;

class AddBookViewModel {
    AddBook addBook;

    public AddBookViewModel(AddBook addBook){
        this.addBook=addBook;
    }

    public void addNewBook(String bookName, String bookID, String authorName, String isbnNumber) {
        Book newBook=new Book(bookName,bookID,authorName,isbnNumber);
        VasagarRepository.getInstance().addNewBookToDB(newBook);
    }
}
