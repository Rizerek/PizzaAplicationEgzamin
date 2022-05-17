package com.example.sprawdzian.remote.rest.dto.request;

import com.example.sprawdzian.domain.model.OrderStatus;
import com.example.sprawdzian.remote.rest.dto.response.OrderStatusDto;

import java.util.List;

public class AddOrderDto {
    private Integer id;
    private List<PizzaOrderDto> orders;
    private PersonOrderDto person;
    private OrderStatusDto status;

    public AddOrderDto() {
    }

    public AddOrderDto(Integer id, List<PizzaOrderDto> orders, PersonOrderDto person, OrderStatusDto status) {
        this.id = id;
        this.orders = orders;
        this.person = person;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PizzaOrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<PizzaOrderDto> orders) {
        this.orders = orders;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public OrderStatusDto getStatus() {
        return status;
    }

    public void setStatus(OrderStatusDto status) {
        this.status = status;
    }
}
