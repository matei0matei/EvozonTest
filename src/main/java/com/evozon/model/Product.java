package com.evozon.model;

public class Product {

    private int id;
    private String code;
    private Category category;

    public Product() {
    }

    public Product(int id, String code, Category category) {
        this.id = id;
        this.code = code;
        this.category = category;
    }

}
