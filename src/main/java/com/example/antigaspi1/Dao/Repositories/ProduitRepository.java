package com.example.antigaspi1.Dao.Repositories;

import com.example.antigaspi1.Dao.Entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Page<Produit> findByNomContains(String keyword, PageRequest of);
}
