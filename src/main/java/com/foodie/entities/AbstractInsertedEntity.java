package com.foodie.entities;

import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public abstract class AbstractInsertedEntity {

    private LocalDateTime insertedOn;
    private String insertedBy;

    @PrePersist
    public void prePersist() {
        insertedOn = LocalDateTime.now();
    }

    public LocalDateTime getInsertedOn() {
        return insertedOn;
    }

    public void setInsertedOn(LocalDateTime insertedOn) {
        this.insertedOn = insertedOn;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }
}
