package com.homework.daniel.Model;


import com.homework.daniel.Exceptions.NotInStockException;

public class Storage {
    Book[] books = new Book[6];
    int[] inStock = new int[6];

    public Storage(Book[] books, int[] inStock) {
        this.books = books;
        this.inStock = inStock;
    }

    public void addBook(Book newBook, int amount) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books[i] = newBook;
                inStock[i] = amount;
                return;
            }
        }

    }

    public void rentBook(Book book) {
        try {
            for (int i = 0; i < books.length; i++) {
                if (inStock[i] == 0) {
                    inStock[i] = 0;
                    throw new NotInStockException("this book : " + book.getName() + " is out of stock", book);

                } else if (books[i] == book) {
                    inStock[i] -= 1;
                    System.out.println(book.getName() + " rent Successfully Enjoy! , don't forget to return the book.");
                    return;
                }
            }
        }
        catch (Exception e){
            System.out.println("En error received : " + e );
        }

    }

    public void returnBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                inStock[i] += 1;
                System.out.println(book.getName() + " was returned thank you ");
                return;
            }
            else {
                System.out.println("we don't have this book in stock");
                return;
            }
        }

    }

    public int getInStock(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                return inStock[i];

            }
        }
        return 0;
    }
}
