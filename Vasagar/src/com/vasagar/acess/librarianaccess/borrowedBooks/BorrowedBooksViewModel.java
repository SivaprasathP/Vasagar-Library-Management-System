package com.vasagar.acess.librarianaccess.borrowedBooks;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;
import com.vasagar.dto.BorrowedBook;

import java.util.List;

class BorrowedBooksViewModel {
    private BorrowedBooks borrowedBooks;

    BorrowedBooksViewModel(BorrowedBooks borrowedBooks) {
        this.borrowedBooks=borrowedBooks;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return VasagarRepository.getInstance().getBorrowedBooksFromDB();
    }
}
