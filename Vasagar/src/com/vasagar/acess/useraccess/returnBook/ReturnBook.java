package com.vasagar.acess.useraccess.returnBook;

import com.vasagar.dto.Book;
import com.vasagar.dto.User;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReturnBook {
    private ReturnBookViewModel returnBookViewModel;

    public ReturnBook(){
        returnBookViewModel=new ReturnBookViewModel(this);
    }


    public void init(User user) {
        getReturningBookDetails(user);
    }

    private void getReturningBookDetails(User user) {
        List<Book> borrowedBooksOfUser=user.getUserBorrowedBooks();
        if(borrowedBooksOfUser.size()==0){
            System.out.println("You didn't borrowed any book");
            return;
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Book Name that to be returned");
        String returningBookTitle=scanner.next();
        System.out.println("Enter the Book ISBN number that to be returned");
        String returningBookISBN=scanner.next();


        Book returningBook=returnBookViewModel.getReturningBook(user,returningBookTitle,returningBookISBN);

        if(returningBook==null){
            System.out.println("Please enter the valid details of the book that you want to return");
            getReturningBookDetails(user);
        }

        boolean isReturningBookSuccessFully=returnBookViewModel.returnBook(returningBook,user);

        if(isReturningBookSuccessFully){
            System.out.println("Book is returned successfully");
        }else{
            System.out.println("ERROR: This book does not exist");
        }
    }
}
