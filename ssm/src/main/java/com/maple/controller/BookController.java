package com.maple.controller;


import com.maple.domain.Book;
import com.maple.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableWebMvc
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        bookService.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public Book getId(@PathVariable Integer id) {
        return bookService.getId(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService  .getAll();
    }
}
