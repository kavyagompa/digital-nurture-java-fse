package com.library.service;


import com.library.repository.BookRepository;


public class BookService {


    private BookRepository bookRepository;


    private String message;



    // Constructor Injection

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }



    // Setter Injection

    public void setMessage(String message) {

        this.message = message;

    }



    public void display() {


        System.out.println("Book Service is working");

        System.out.println("Message: " + message);


        bookRepository.display();


    }

}