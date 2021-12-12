package com.homework.daniel;

import com.homework.daniel.Exceptions.NotInStockException;
import com.homework.daniel.Model.BestSeller;
import com.homework.daniel.Model.Book;
import com.homework.daniel.Model.Storage;

import java.util.Arrays;

public class Main {
    static Book[] books = new Book[6];
    static int[] inStock = new int[6];

    public static void main(String[] args){
        BestSeller bestSeller = new BestSeller(1,"hand of god", 15,"best book",5);
        Storage storage = new Storage(books,inStock);
        Book book1 = new Book(1,"hand of god", 15);
        Book book2 = new Book(2,"game of thrones",14);
        Book book3 = new Book(3,"harry potter",22);
        Book book4 = new Book(4,"bible",12);
        Book book5 = new Book(5,"the Lord of the Rings",24);
        Book book6 = new Book(2,"pirates of the caribbean",23);
        storage.addBook(book1,5);
        storage.addBook(book2,6);
        storage.addBook(book3,8);
        storage.addBook(book4,4);
        storage.addBook(book5,2);
        storage.addBook(book6,0);
        System.out.println(Arrays.toString(books));
        System.out.println();
        storage.rentBook(book1); // rent some book
        System.out.println();
        System.out.println(Arrays.toString(inStock));
        storage.returnBook(book1); // return some book
        System.out.println();
        System.out.println(Arrays.toString(inStock));
        System.out.println();
        System.out.println("the amount of "+book4.getName()+" is : " +storage.getInStock(book4)); // print the amount of book
        System.out.println();
        storage.rentBook(book6); // try to rent book and catch exception book = 0 (out of stock)






    }
}
