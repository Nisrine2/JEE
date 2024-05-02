package com.example.antigaspi1.Dao.Repositories;

import com.example.antigaspi1.Dao.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    Restaurant findBynom(String name);
}