package com.library.controller;


import java.util.List;


import org.springframework.web.bind.annotation.*;


import com.library.entity.Book;
import com.library.repository.BookRepository;



@RestController
@RequestMapping("/books")
public class BookController {


    private BookRepository bookRepository;



    public BookController(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }



    // Get all books

    @GetMapping
    public List<Book> getAllBooks(){

        return bookRepository.findAll();

    }



    // Get book by id

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){

        return bookRepository.findById(id).orElse(null);

    }



    // Add book

    @PostMapping
    public Book addBook(@RequestBody Book book){

        return bookRepository.save(book);

    }



    // Update book

    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable int id,
            @RequestBody Book book){


        book.setId(id);

        return bookRepository.save(book);

    }



    // Delete book

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){


        bookRepository.deleteById(id);

        return "Book deleted successfully";

    }


}