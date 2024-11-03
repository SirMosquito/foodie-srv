package com.foodie.mappers.restaurant;

import com.foodie.dto.restaurant.Restaurant;
import com.foodie.entities.restaurant.RestaurantEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class RestaurantMapper {
    public List<Restaurant> map(List<RestaurantEntity> restaurantEntities) {
        return restaurantEntities.stream()
                .map(this::map)
                .toList();
    }

    public Restaurant map(RestaurantEntity restaurantEntity) {
        return new Restaurant.Builder()
                .id(restaurantEntity.getRestaurantUuid())
                .name(restaurantEntity.getName())
                .address(restaurantEntity.getAddress())
                .recordStatus(restaurantEntity.getRecordStatus())
                .insertedBy(restaurantEntity.getInsertedBy())
                .insertedOn(restaurantEntity.getInsertedOn())
                .updatedBy(restaurantEntity.getUpdatedBy())
                .updatedOn(restaurantEntity.getUpdatedOn())
                .build();
    }

}
