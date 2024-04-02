package com.example.tp4;

import com.example.tp4.dao.entities.Product;
import com.example.tp4.metier.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Tp4Application implements CommandLineRunner {

    @Autowired
    private ProductManager productManager;

    public static void main(String[] args) {
        SpringApplication.run(Tp4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "T-shirt", 299.0);
        Product product1 = new Product(null, "Jupe", 400.0);
        Product product2 = new Product(null, "Robe", 899.0);
        productManager.addproduct(product);
        productManager.addproduct(product1);
        productManager.addproduct(product2);

        System.out.println(productManager.GetAllProduct());

    }
}