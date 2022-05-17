package com.example.sprawdzian.remote.rest.dto.request;

import com.example.sprawdzian.remote.rest.dto.response.SizeDto;

import java.util.List;

public class AddPizzaDto {
    private Integer id;
    private String name;
    private List<SizeDto> sizes;

    public AddPizzaDto() {
    }

    public AddPizzaDto(Integer id, String name, List<SizeDto> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizeDto> sizes) {
        this.sizes = sizes;
    }
}
