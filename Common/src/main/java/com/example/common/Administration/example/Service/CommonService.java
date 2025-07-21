package com.example.common.Administration.example.Service;

import com.cleverbuilder.bookservice.Book;
import com.example.common.Administration.example.model.CommonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
   private CommonModel commonModel;

    private Book book;

    public CommonModel getElements(){

        commonModel.setElement1(insertElemnets(book).getID());
        commonModel.setElement2(insertElemnets(book).getTitle());
        System.out.println(commonModel);

        return commonModel;
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
