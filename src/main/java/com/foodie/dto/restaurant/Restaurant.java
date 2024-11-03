package com.foodie.dto.restaurant;

import com.foodie.entities.RecordStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class Restaurant {
    private UUID id;
    private String name;
    private String address;
    private RecordStatus recordStatus;
    private String insertedBy;
    private LocalDateTime insertedOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }

    public LocalDateTime getInsertedOn() {
        return insertedOn;
    }

    public void setInsertedOn(LocalDateTime insertedOn) {
        this.insertedOn = insertedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", recordStatus=" + recordStatus +
                ", insertedBy='" + insertedBy + '\'' +
                ", insertedOn=" + insertedOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }


    public static final class Builder {
        private UUID id;
        private String name;
        private String address;
        private RecordStatus recordStatus;
        private String insertedBy;
        private LocalDateTime insertedOn;
        private String updatedBy;
        private LocalDateTime updatedOn;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder recordStatus(RecordStatus recordStatus) {
            this.recordStatus = recordStatus;
            return this;
        }

        public Builder insertedBy(String insertedBy) {
            this.insertedBy = insertedBy;
            return this;
        }

        public Builder insertedOn(LocalDateTime insertedOn) {
            this.insertedOn = insertedOn;
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
            return this;
        }

        public Restaurant build() {
            Restaurant restaurant = new Restaurant();
            restaurant.setId(id);
            restaurant.setName(name);
            restaurant.setAddress(address);
            restaurant.setRecordStatus(recordStatus);
            restaurant.setInsertedBy(insertedBy);
            restaurant.setInsertedOn(insertedOn);
            restaurant.setUpdatedBy(updatedBy);
            restaurant.setUpdatedOn(updatedOn);
            return restaurant;
        }
    }
}
