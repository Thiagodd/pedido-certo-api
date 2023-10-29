package com.thiagodd.pedidocertoapi.domain.model.enumerated;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public enum OrderStatus {

    CREATED("Created"),
    CONFIRMED("Confirmed", CREATED),
    DELIVERED("Delivered", CONFIRMED),
    CANCELED("Canceled", DELIVERED);

    @Getter
    private final String description;

    private final List<OrderStatus> previousStatus;

    OrderStatus(String description, OrderStatus... previousStatus) {
        this.description = description;
        this.previousStatus = Arrays.asList(previousStatus);
    }


    @Override
    public String toString() {
        return name();
    }

    public boolean cannotChangeTo(OrderStatus newStatus) {
        return !newStatus.previousStatus.contains(this);
    }

    public boolean canChangeTo(OrderStatus newStatus) {
        return !cannotChangeTo(newStatus);
    }

    public boolean isCanceled() {
        return this == OrderStatus.CANCELED;
    }

    public boolean isFinished(){
        return this == OrderStatus.CANCELED || this == OrderStatus.DELIVERED;
    }
}
