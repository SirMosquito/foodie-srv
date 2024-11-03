package com.foodie.daos.restaurant;

import com.foodie.entities.restaurant.RestaurantEntity;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestaurantRepository implements PanacheRepository<RestaurantEntity> {
}
