package com.vasagar.acess.librarianaccess.addBook;

import com.vasagar.dto.Book;

import java.util.Scanner;

public class AddBook {
    AddBookViewModel addBookViewModel;

    public AddBook(){
        addBookViewModel=new AddBookViewModel(this);
    }

    public void init() {
        this.getBookDetails();
    }

    public void getBookDetails() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Book Name:");
        String bookName=scanner.nextLine();



        System.out.println("Enter Book ID:");
        String bookID=scanner.nextLine();



        System.out.println("Enter Author Name:");
        String authorName=scanner.nextLine();



        System.out.println("Enter ISBN Number:");
        String isbnNumber=scanner.nextLine();


        addBookViewModel.addNewBook(bookName,bookID,authorName,isbnNumber);

//        scanner.close();
        System.out.println("Book added successfully");
    }


}
