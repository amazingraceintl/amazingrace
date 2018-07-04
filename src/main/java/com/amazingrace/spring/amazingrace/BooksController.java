package com.amazingrace.spring.amazingrace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        return Arrays.asList(new Book(22,"Mastering Spring Framework","Ajayi Damilola"));
    }

    @GetMapping("/school")
    public String school(){

        return "My school is university of ibadan";
    }
}
