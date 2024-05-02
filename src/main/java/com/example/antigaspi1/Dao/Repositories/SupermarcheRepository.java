package com.example.antigaspi1.Dao.Repositories;

import com.example.antigaspi1.Dao.Entities.Supermarche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupermarcheRepository extends JpaRepository<Supermarche, Integer> {
    Supermarche findByNom(String name);
}
