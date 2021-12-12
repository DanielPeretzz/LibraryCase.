package com.homework.daniel.Exceptions;

import com.homework.daniel.Model.Book;

public class NotInStockException extends Exception{
    public Book book;

    public NotInStockException(String message, Book book) {
        super(message);
        this.book = book;
    }
}
