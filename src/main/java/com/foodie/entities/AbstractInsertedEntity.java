package com.foodie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractInsertedEntity {

    @Column(name = "inserted_on", nullable = false, updatable = false)
    protected LocalDateTime insertedOn;
    @Column(name = "inserted_by", nullable = false, updatable = false)
    protected String insertedBy;

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
