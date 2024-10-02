package com.vasagar.datalink;

import com.vasagar.dto.Book;
import com.vasagar.dto.BorrowedBook;
import com.vasagar.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VasagarRepository {
    private User loggedInUser;
    private static VasagarRepository vasagarRepository;

    private List<User> users=new ArrayList<User>(){{
        add(new User("Admin","111","123",true));
        add(new User("Arun","01","1234",false));
    }};

    private List<Book> books=new ArrayList<Book>(){{
        add(new Book("Java","1","Brain","123A",false));
    }};

    private List<BorrowedBook> borrowedBooks=new ArrayList<>(){{
        add(new BorrowedBook(books.get(0),users.get(1),"1-1-24","5-5-24"));
        users.get(1).addBorrowedBookToUser(books.get(0));
    }};

    private VasagarRepository(){

    }

    public static VasagarRepository getInstance(){
        if(vasagarRepository==null){
            vasagarRepository=new VasagarRepository();
        }
        return vasagarRepository;
    }

    public User validate(String userID,String userPassword){
        for(User user:this.users){
            if(user.getUserID().equals(userID) && user.getUserPassword().equals(userPassword)){
                vasagarRepository.loggedInUser=user;
                return user;
            }
        }

        return null;
    }

    public void addNewBookToDB(Book newBook){
        books.add(newBook);
    }

    public void addNewUserToDB(User newUser) {
        users.add(newUser);
    }


    public boolean removeBookFromDB(String removingBookTitle, String removingBookID, String removingBookISBN) {
        ListIterator<Book> listIterator= books.listIterator();
        while(listIterator.hasNext()){
            Book book=listIterator.next();
            if(removingBookID.equals(book.getBookID()) && removingBookTitle.equals(book.getBookTitle()) && removingBookISBN.equals(book.getIsbnNumber())){
                listIterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeUserFromDB(String removingUserID, String removingUserName) {
        ListIterator<User> listIterator= users.listIterator();
        while(listIterator.hasNext()){
            User user=listIterator.next();
            if(removingUserID.equals(user.getUserID()) && removingUserName.equals(user.getUserName())){
                listIterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<User> getAllBooksFromDB() {
        return users;
    }

    public int borrowingBookFromDB(String borrowingBookTitle, String borrowingBookISBN,User user) {
        ListIterator<Book> listIterator= books.listIterator();
        while(listIterator.hasNext()){
            Book book=listIterator.next();
            if(borrowingBookTitle.equals(book.getBookTitle()) && borrowingBookISBN.equals(book.getIsbnNumber())){
                if(book.isAvaiable()){
                    user.getUserBorrowedBooks().add(book);
                    book.setAvaiable(false);
                    return 1;
                }else{
                    return -1;
                }

            }
        }
        return 0;
    }

    public List<BorrowedBook> getBorrowedBooksFromDB() {
        return borrowedBooks;
    }

    public boolean returnBookToDB(Book returningBook,User returningUser) {
        for(Book book:books){
            if(returningBook.getBookTitle().equals(book.getBookTitle()) && returningBook.getIsbnNumber().equals(book.getIsbnNumber())){
                book.setAvaiable(true);
            }
        }

        ListIterator<BorrowedBook> borrowedBookListIterator=borrowedBooks.listIterator();
        while(borrowedBookListIterator.hasNext()){
            BorrowedBook borrowedBook=borrowedBookListIterator.next();
            boolean isBorrowedBookAvailable=returningBook.getBookTitle().equals(borrowedBook.getBorrowedBook().getBookTitle()) && returningBook.getIsbnNumber().equals(borrowedBook.getBorrowedBook().getIsbnNumber());
            //boolean isBorrowedUserAvailable=returningUser.getUserID().equals(borrowedBook.getBorrowedUser().getUserID()) && returningUser.getUserName().equals(borrowedBook.getBorrowedUser().getUserName());

            if(isBorrowedBookAvailable){
                borrowedBookListIterator.remove();
                return true;
            }
        }

        return false;
    }
}
