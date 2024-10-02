package com.vasagar.dto;

import com.vasagar.datalink.VasagarRepository;

public class Book {
    private String bookTitle;
    private String bookID;
    private String authorName;
    private String isbnNumber;
    private boolean isAvaiable;


    public Book(String bookTitle, String bookID, String authorName, String isbnNumber, boolean isAvaiable) {
        this.bookTitle = bookTitle;
        this.bookID = bookID;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
        this.isAvaiable = isAvaiable;

    }

    public Book(String bookTitle, String bookID, String authorName, String isbnNumber) {
        this.bookTitle = bookTitle;
        this.bookID = bookID;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
        this.isAvaiable = true;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        isAvaiable = avaiable;
    }

    @Override
    public String toString() {
        return "\nBook Title=" + bookTitle +
                "\nBook ID=" + bookID  +
                "\nAuthor Name=" + authorName +
                "\nISBN Number=" + isbnNumber +
                "\n"+(isAvaiable?"Available":"Not Available")+"\n";
    }
}
