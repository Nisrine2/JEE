package com.example.antigaspi1.Dao.Repositories;

import com.example.antigaspi1.Dao.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
