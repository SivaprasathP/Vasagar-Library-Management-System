package com.vasagar.acess.useraccess.returnBook;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;
import com.vasagar.dto.User;

import java.util.ListIterator;

class ReturnBookViewModel {
    private ReturnBook returnBook;

    public ReturnBookViewModel(ReturnBook returnBook) {
        this.returnBook=returnBook;
    }




    public Book getReturningBook(User user,String returningBookTitle,String returningBookISBN) {
        ListIterator<Book> listIterator=user.getUserBorrowedBooks().listIterator();
        while(listIterator.hasNext()){
            Book currentBook=listIterator.next();
            if(currentBook.getBookTitle().equals(returningBookTitle) && currentBook.getIsbnNumber().equals(returningBookISBN)){
                listIterator.remove();
                return currentBook;
            }
        }
        return null;
    }

    public boolean returnBook(Book returningBook,User returningUser) {
        return VasagarRepository.getInstance().returnBookToDB(returningBook,returningUser);
    }
}
