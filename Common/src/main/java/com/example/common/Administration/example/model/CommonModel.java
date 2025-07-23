package com.example.common.Administration.example.model;

import org.springframework.stereotype.Component;

@Component

public class CommonModel {
    private String element1;
    private String element2;

    public CommonModel(String element1, String element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public CommonModel() {

    }

    public String getElement1() {
        return element1;
    }

    public void setElement1(String element1) {
        this.element1 = element1;
    }

    public String getElement2() {
        return element2;
    }

    public void setElement2(String element2) {
        this.element2 = element2;
    }

    @Override
    public String toString() {
        return "CommonModel{" + "element1='" + element1 + '\'' + ", element2='" + element2 + '\'' + '}';
    }
}
