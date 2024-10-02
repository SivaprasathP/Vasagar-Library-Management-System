package com.vasagar.acess.librarianaccess;

import com.vasagar.acess.librarianaccess.addBook.AddBook;
import com.vasagar.acess.librarianaccess.addUser.AddUser;
import com.vasagar.acess.librarianaccess.borrowedBooks.BorrowedBooks;
import com.vasagar.acess.librarianaccess.displayBooks.DisplayBooks;
import com.vasagar.acess.librarianaccess.displayUsers.DisplayUsers;
import com.vasagar.acess.librarianaccess.removeBook.RemoveBook;
import com.vasagar.acess.librarianaccess.removeUser.RemoveUser;
import com.vasagar.dto.User;

import java.util.Scanner;

public class LibrarianScreen {


    public LibrarianScreen(){

    }

    public void init(User loggedInUser) {
        displayChoices();
    }

    public void displayChoices() {
        Scanner scanner=new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1.Add Book \n2.Add User \n3.Remove Book \n4.Remove User \n5.View Books \n6.View Users \n7.View Borrowed Books Details \n8.Exit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();

            switch(choice){
                case 1:
                    AddBook addBook=new AddBook();
                    addBook.init();
                    break;
                case 2:
                    AddUser addUser=new AddUser();
                    addUser.init();
                    break;
                case 3:
                    RemoveBook removeBook=new RemoveBook();
                    removeBook.init();
                    break;
                case 4:
                    RemoveUser removeUser=new RemoveUser();
                    removeUser.init();
                    break;
                case 5:
                    DisplayBooks displayBooks=new DisplayBooks();
                    displayBooks.init();
                    break;
                case 6:
                    DisplayUsers displayUsers=new DisplayUsers();
                    displayUsers.init();
                    break;
                case 7:
                    BorrowedBooks borrowedBooks=new BorrowedBooks();
                    borrowedBooks.init();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Please enter a valid option");
            }
        }
    }

}
