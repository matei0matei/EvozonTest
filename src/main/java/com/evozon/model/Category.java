package com.evozon.model;

import java.util.List;

public class Category {

    private int id;
    private String code;
    private List<Product> products;

    public Category() {
    }

    public Category(int id, String code, List<Product> products) {
        this.id = id;
        this.code = code;
        this.products = products;
    }
}
