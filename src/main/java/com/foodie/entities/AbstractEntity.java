package com.foodie.entities;

import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public abstract class AbstractEntity extends AbstractInsertedEntity {

    private LocalDateTime updatedOn;
    private String updatedBy;

    @PreUpdate
    public void preUpdate() {
        updatedOn = LocalDateTime.now();
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
