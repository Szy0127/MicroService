package com.web.bookauthor.controller;


import com.web.bookauthor.entity.Book;

import com.web.bookauthor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("getAuthorByName")
    public String getBookByID(
            @RequestParam("name") String name
    ){
        return bookService.getAuthorByName(name);
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }



}
