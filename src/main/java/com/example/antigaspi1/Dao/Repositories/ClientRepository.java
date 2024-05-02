package com.example.antigaspi1.Dao.Repositories;

import com.example.antigaspi1.Dao.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    List<Client> findBynom(String clientName);
}
