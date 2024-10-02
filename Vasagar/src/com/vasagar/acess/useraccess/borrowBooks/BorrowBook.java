package com.vasagar.acess.useraccess.borrowBooks;

import com.vasagar.dto.User;

import java.util.Scanner;

public class BorrowBook {
    private BorrowBookViewModel borrowBookViewModel;

    public BorrowBook(){
        borrowBookViewModel=new BorrowBookViewModel(this);
    }

    public void init(User user) {
        getBorrowingBookDetails(user);
    }

    private void getBorrowingBookDetails(User user) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Book Name that to be borrowed");
        String borrowingBookTitle=scanner.next();
        System.out.println("Enter the Book ISBN number that to be borrowed");
        String borrowingBookISBN=scanner.next();

        int isBorrowed=borrowBookViewModel.borrowingBook(borrowingBookTitle,borrowingBookISBN,user);

        if(isBorrowed==1){
            System.out.println("Book Borrowed Successfully");
        }else if(isBorrowed==-1){
            System.out.println("Sorry it is already Borrowed by someone else");
        }else{
            System.out.println("ERROR: This book does not exist");
        }
        
    }
}
