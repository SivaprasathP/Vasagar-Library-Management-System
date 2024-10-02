package com.vasagar.acess.librarianaccess.removeBook;

import java.util.Scanner;

public class RemoveBook {
    private RemoveBookViewModel removeBookViewModel;

    public RemoveBook(){
        removeBookViewModel=new RemoveBookViewModel(this);
    }

    public void init() {
        this.getRemovingBookDetails();
    }


    public void getRemovingBookDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Title of Removing Book: ");
        String removingBookTitle=scanner.next();
        System.out.println("Enter the ID of Removing Book: ");
        String removingBookID=scanner.next();
        System.out.println("Enter the ISBN number of Removing Book: ");
        String removingBookISBN=scanner.next();

        removeBookViewModel.removeExistingBook(removingBookTitle,removingBookID,removingBookISBN);

//        scanner.close();
    }

    public void showError() {
        System.out.println("ERROR: This Book does not exists");
    }

    public void showSuccessfulMessage() {
        System.out.println("Book Removed Successfully");
    }
}
