package com.evozon.dao.impl;

import com.evozon.dao.ProductDAO;
import com.evozon.model.Category;
import com.evozon.model.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class DefaultProductDAO implements ProductDAO {

    //The methods must be implemented

    @Override
    public Product getById(int id) {
        throw new NotImplementedException();
    }

    @Override
    public Product getByCategory(int id) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getAll() {
        throw new NotImplementedException();
    }

    @Override
    public Product addProduct(Product product) {
        throw new NotImplementedException();
    }
}
