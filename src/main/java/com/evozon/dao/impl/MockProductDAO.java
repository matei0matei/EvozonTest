package com.evozon.dao.impl;

import com.evozon.dao.ProductDAO;
import com.evozon.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockProductDAO implements ProductDAO {

    @Override
    public Product getById(int id) {

        return new Product(id, "mockCode", "mockName", new Date());
    }

    @Override
    public List<Product> getAll() {
        Product product1 = new Product(1, "mockCode1", "mockName1", new Date());
        Product product2 = new Product(2, "mockCode2", "mockName2", new Date());
        Product product3 = new Product(3, "mockCode3", "mockName3", new Date());
        Product product4 = new Product(4, "mockCode4", "mockName3", new Date());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        return products;
    }

    @Override
    public Product addProduct(Product product) {
        return product;
    }
}
