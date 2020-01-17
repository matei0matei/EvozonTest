package com.evozon.dao.impl;

import com.evozon.dao.ProductDAO;
import com.evozon.model.Category;
import com.evozon.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MockProductDAO implements ProductDAO {

    @Override
    public Product getById(int id) {
        Category category = new Category(1, "mockCategoryCode", new ArrayList<>());

        return new Product(id, "mockCode", category);
    }

    @Override
    public Product getByCategory(int id) {
        Category category = new Category(id, "mockCategoryCode", new ArrayList<>());

        return new Product(1, "mockCode", category);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }
}
