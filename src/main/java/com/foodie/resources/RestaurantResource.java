package com.foodie.resources;

import com.foodie.daos.restaurant.RestaurantRepository;
import com.foodie.entities.restaurant.RestaurantEntity;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/restaurant")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantResource {

    private final RestaurantRepository restaurantRepository;

    @Inject
    public RestaurantResource(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    @GET
    public Uni<List<RestaurantEntity>> getRestaurant() {
        return restaurantRepository.listAll();
    }
}
