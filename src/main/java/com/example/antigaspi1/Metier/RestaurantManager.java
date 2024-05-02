package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RestaurantManager {
    public Optional<Restaurant> getRestaurantById(int id);
    Restaurant getRestaurantByName(String name);
    public List<Restaurant> getAllRestaurants();
    public Restaurant addRestaurant(Restaurant restaurant);
    public Restaurant updateRestaurant(Restaurant restaurant);
    public boolean deleteRestaurant(Restaurant restaurant);

}
