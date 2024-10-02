package com.vasagar.acess.useraccess.borrowBooks;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.User;

class BorrowBookViewModel {
    private BorrowBook borrowBook;

    BorrowBookViewModel(BorrowBook borrowBook) {
        this.borrowBook=borrowBook;
    }

    public int borrowingBook(String borrowingBookTitle, String borrowingBookISBN, User user) {
        return VasagarRepository.getInstance().borrowingBookFromDB(borrowingBookTitle,borrowingBookISBN,user);
    }
}
