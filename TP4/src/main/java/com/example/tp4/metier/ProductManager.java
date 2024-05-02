package com.example.tp4.metier;

import com.example.tp4.dao.entities.Product;

import java.util.List;


public interface ProductManager {
    public Product addproduct(Product product);
    public Product updateproduct(Product product);
    public boolean deleteproduct(Product product);

    public List<Product> GetAllProduct();

}
