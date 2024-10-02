package com.vasagar.acess.librarianaccess.displayBooks;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;

import java.util.List;

class DisplayBooksViewModel {
    private DisplayBooks displayBooks;

    DisplayBooksViewModel(DisplayBooks displayBooks) {
        this.displayBooks=displayBooks;
    }

    public List<Book> getBooks() {
        return VasagarRepository.getInstance().getAllBooks();
    }
}
