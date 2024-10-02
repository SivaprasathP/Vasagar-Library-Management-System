package com.vasagar.acess.librarianaccess.removeBook;

import com.vasagar.datalink.VasagarRepository;
import com.vasagar.dto.Book;

class RemoveBookViewModel {
    private RemoveBook removeBook;

    RemoveBookViewModel(RemoveBook removeBook) {
        this.removeBook=removeBook;
    }


    public void removeExistingBook(String removingBookTitle, String removingBookID, String removingBookISBN) {

        if(VasagarRepository.getInstance().removeBookFromDB(removingBookTitle,removingBookID,removingBookISBN)){
            removeBook.showSuccessfulMessage();
        }else{
            removeBook.showError();
        }
    }
}
