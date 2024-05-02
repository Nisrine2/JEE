package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Restaurant;
import com.example.antigaspi1.Dao.Repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RestaurantManagerService implements RestaurantManager {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Optional<Restaurant> getRestaurantById(int id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public Restaurant getRestaurantByName(String name) {
        return restaurantRepository.findBynom(name);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public boolean deleteRestaurant(Restaurant restaurant) {
        try{
            restaurantRepository.delete(restaurant);
            return true;
        }catch (Exception exception){
            return false;
        }
    }
}

