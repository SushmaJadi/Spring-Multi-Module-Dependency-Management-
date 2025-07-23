package com.example.common.Administration.example.controller;

import com.example.common.Administration.example.Service.CommonService;
import com.example.common.Administration.example.model.CommonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/CommonModel")
public class CommonController {
    @Autowired
    CommonService commonService;
    @Autowired
    CommonModel commonModel;


    @RequestMapping(path = "/getElement", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonModel getElements() {
        commonModel = commonService.getElements();
        return commonModel;
    }
}
