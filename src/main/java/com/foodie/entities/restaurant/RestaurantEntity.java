package com.foodie.entities.restaurant;

import com.foodie.entities.AbstractEntity;
import com.foodie.entities.RecordStatus;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "restaurant")
public class RestaurantEntity extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "restaurantSequenceGenerator", sequenceName = "seq_restaurant", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurantSequenceGenerator")
    @Column(name = "restaurant_id", nullable = false)
    private Long restaurantId;

    @Column(name = "restaurant_uuid", nullable = false)
    private UUID restaurantUuid;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(name = "record_status")
    private RecordStatus recordStatus;

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public UUID getRestaurantUuid() {
        return restaurantUuid;
    }

    public void setRestaurantUuid(UUID restaurantUuid) {
        this.restaurantUuid = restaurantUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
}
