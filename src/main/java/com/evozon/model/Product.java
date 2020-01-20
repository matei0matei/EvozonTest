package com.evozon.model;

import java.util.Date;

public class Product {

    private int id;
    private String code;
    private String name;
    private Date creationDate;

    public Product() {
    }

    public Product(int id, String code, String name, Date creationDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
