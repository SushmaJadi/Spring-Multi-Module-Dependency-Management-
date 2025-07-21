package com.example.Service;

import com.cleverbuilder.bookservice.Book;
import com.example.model.ModuleTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleTwoService {

    @Autowired
   private ModuleTwo moduleTwo;

    private Book book;

    public  ModuleTwo getElements(){

        moduleTwo.setElement1(insertElemnets(book).getID());
        moduleTwo.setElement2(insertElemnets(book).getTitle());
        System.out.println(moduleTwo);

        return moduleTwo;
    }

    private Book insertElemnets(Book book){
        book.setID("01");
        book.setAuthor("Author1");
        book.setTitle("Element01");
        book.setID("02");
        book.setAuthor("Author2");
        book.setTitle("Element02");
        return book;
    }

}
