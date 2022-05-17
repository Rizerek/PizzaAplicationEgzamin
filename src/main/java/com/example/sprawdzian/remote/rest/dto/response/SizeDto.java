package com.example.sprawdzian.remote.rest.dto.response;


import com.example.sprawdzian.domain.model.Size;

import java.math.BigDecimal;

public class SizeDto {
    private Integer id;
    private Size size;
    private BigDecimal price;

    public SizeDto() {
    }

    public SizeDto(Integer id, Size size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
