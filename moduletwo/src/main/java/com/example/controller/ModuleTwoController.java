package com.example.controller;

import com.cleverbuilder.bookservice.Book;
import com.example.Service.ModuleTwoService;
import com.example.model.ModuleTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/moduleTwo")
public class ModuleTwoController {

    @Autowired
    ModuleTwo moduleTwo;
    ModuleTwoService moduleTwoService;

    @GetMapping("/getElement")
    public ModuleTwo getElements() {
        moduleTwo = moduleTwoService.getElements();
        return moduleTwo;
    }
}
