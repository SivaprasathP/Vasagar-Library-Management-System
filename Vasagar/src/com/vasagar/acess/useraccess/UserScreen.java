package com.vasagar.acess.useraccess;

import com.vasagar.acess.librarianaccess.displayBooks.DisplayBooks;
import com.vasagar.acess.useraccess.borrowBooks.BorrowBook;
import com.vasagar.acess.useraccess.displayBorrowedBooks.DisplayBorrowedBooks;
import com.vasagar.acess.useraccess.returnBook.ReturnBook;
import com.vasagar.dto.User;

import java.util.Scanner;

public class UserScreen {
    public void init(User user){
        displayChoices(user);
    }

    private void displayChoices(User user) {
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("1.View Book \n2.View Borrowed Books \n3.Borrow Book \n4.Return Book \n5.Exit");
            System.out.println("Enter your choice");

            int choice=scanner.nextInt();
            switch(choice) {
                case 1:
                    DisplayBooks displayBooks = new DisplayBooks();
                    displayBooks.init();
                    break;
                case 2:
                    DisplayBorrowedBooks displayBorrowedBooks=new DisplayBorrowedBooks();
                    displayBorrowedBooks.init(user);
                    break;
                case 3:
                    BorrowBook borrowBook=new BorrowBook();
                    borrowBook.init(user);
                    break;
                case 4:
                    ReturnBook returnBook=new ReturnBook();
                    returnBook.init(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter a valid option");
            }
        }

    }
}
