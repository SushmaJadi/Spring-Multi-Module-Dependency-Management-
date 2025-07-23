package com.example.Service;

import com.cleverbuilder.bookservice.Book;
import com.example.configuration.ModuleTwoBookConfiguration;
import com.example.model.ModuleTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleTwoService {

    @Autowired
    ModuleTwoBookConfiguration moduleTwoBookConfiguration;
    @Autowired
    private ModuleTwo moduleTwo;

    public ModuleTwo getElements() {

        moduleTwo.setElement1(insertElemnets().getID());
        moduleTwo.setElement2(insertElemnets().getTitle());
        System.out.println(moduleTwo);

        return moduleTwo;
    }

    private Book insertElemnets() {

        return moduleTwoBookConfiguration.bookInstance();
    }

}
