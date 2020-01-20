package com.evozon.controller;

import com.evozon.model.Product;
import com.evozon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable int id, Model model) {
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        Product createdProduct = productService.addProduct(product);
        model.addAttribute("product", createdProduct);
        return "product";
    }

}
