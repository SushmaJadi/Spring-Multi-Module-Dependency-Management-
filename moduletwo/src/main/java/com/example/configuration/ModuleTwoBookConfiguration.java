package com.example.configuration;

import com.cleverbuilder.bookservice.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModuleTwoBookConfiguration {
    Book book;

    @Bean
    public Book bookInstance() {
        book = new Book();

        book.setID("01");
        book.setAuthor("Author1");
        book.setTitle("Element01");

        return book;
    }


}
