package com.evozon.service.impl;

import com.evozon.dao.ProductDAO;
import com.evozon.model.Product;
import com.evozon.service.ProductService;

import java.util.List;

public class DefaultProductService implements ProductService {

    private ProductDAO productDAO;

    @Override
    public Product getById(int id) {
        return productDAO.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productDAO.addProduct(product);
    }
}
