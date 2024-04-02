package com.example.tp4.dao.repositories;

import com.example.tp4.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
