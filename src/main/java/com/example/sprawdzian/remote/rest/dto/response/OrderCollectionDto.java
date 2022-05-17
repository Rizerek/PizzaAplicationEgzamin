package com.example.sprawdzian.remote.rest.dto.response;

import java.util.List;

public class OrderCollectionDto {
    private List<OrderDto> orders;

    public OrderCollectionDto() {
    }

    public OrderCollectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrers(List<OrderDto> orders) {
        this.orders = orders;
    }
}
