package com.example.tp4.metier;

import com.example.tp4.dao.entities.Product;
import com.example.tp4.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductManager{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addproduct(Product product) {
        if (product.getPrice() > 0) {
            return productRepository.save(product);
        } else {
            System.out.println("le prix n'est pas valide");
            return null;
        }


    }
    @Override
    public Product updateproduct(Product product) {
        return null;
    }
    @Override
    public boolean deleteproduct(Product product)
    {
        return false;
    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepository.findAll();
    }


}
