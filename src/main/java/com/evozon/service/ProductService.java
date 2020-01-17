package com.evozon.service;

import com.evozon.model.Product;

import java.util.List;

public interface ProductService {

    /*
     * Retrieves a product from the DB based on the id
     */
    Product getById(int id);

    /*
     * Retrieves all the products from the DB
     */
    List<Product> getAll();

    /*
     * Adds a new product to the DB
     */
    Product addProduct(Product product);
}
