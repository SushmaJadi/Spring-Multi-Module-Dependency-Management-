package com.example.common.Administration.example.Service;

import com.cleverbuilder.bookservice.Book;
import com.example.common.Administration.example.configuration.BookCommonsConfiguration;
import com.example.common.Administration.example.model.CommonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
    BookCommonsConfiguration bookCommonsConfiguration;
    @Autowired
    private CommonModel commonModel;

    public CommonModel getElements() {

        commonModel.setElement1(insertElemnets().getID());
        commonModel.setElement2(insertElemnets().getTitle());

        return commonModel;
    }

    private Book insertElemnets() {
        return bookCommonsConfiguration.getInstance();
    }

}
