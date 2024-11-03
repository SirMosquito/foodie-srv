package com.foodie.resources;

import com.foodie.dto.restaurant.Restaurant;
import com.foodie.mappers.restaurant.RestaurantMapper;
import com.foodie.repositories.restaurant.RestaurantRepository;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.UUID;

@Path("/restaurant")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantResource {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;

    @Inject
    public RestaurantResource(RestaurantRepository restaurantRepository,
                              RestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    @GET
    public Uni<List<Restaurant>> getRestaurant() {
        return restaurantRepository.listAll().map(restaurantMapper::map);
    }

    @GET
    @Path("/{uuid}")
    public Uni<Restaurant> getRestaurantById(@PathParam("uuid") UUID uuid) {
        return restaurantRepository.findRestaurantByUuid(uuid).map(restaurantMapper::map);
    }
}
