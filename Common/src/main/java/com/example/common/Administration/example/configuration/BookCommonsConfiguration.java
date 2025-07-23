package com.example.common.Administration.example.configuration;

import com.cleverbuilder.bookservice.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BookCommonsConfiguration {

    Book book;

    @Bean
    public Book getInstance() {
        book = new Book();

        book.setID("02");
        book.setAuthor("Author2");
        book.setTitle("Element02");
        return book;
    }

}
