package com.example.sprawdzian.remote.rest.dto.response;

import com.example.sprawdzian.domain.model.OrderStatus;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatus status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public OrderStatusDto() {
    }

    public OrderStatusDto(OrderStatus status, Date createdAt, Date updateAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.expectedAt = expectedAt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
