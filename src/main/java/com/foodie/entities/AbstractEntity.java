package com.foodie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity extends AbstractInsertedEntity {

    @Column(name = "updated_on", nullable = false)
    protected LocalDateTime updatedOn;
    @Column(name = "updated_by", nullable = false)
    protected String updatedBy;

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
