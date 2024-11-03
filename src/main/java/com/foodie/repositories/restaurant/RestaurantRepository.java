package com.foodie.repositories.restaurant;

import com.foodie.entities.restaurant.RestaurantEntity;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class RestaurantRepository implements PanacheRepository<RestaurantEntity> {

    public Uni<RestaurantEntity> findRestaurantByUuid(UUID uuid) {
        return find("restaurantUuid", uuid).firstResult();
    }
}
