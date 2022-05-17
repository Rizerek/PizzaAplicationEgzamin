package com.example.sprawdzian.remote.rest.dto.request;

public class PersonOrderDto {
    private String name;
    private String phone;
    private String adress;
    private Integer floor;

    public PersonOrderDto() {
    }

    public PersonOrderDto(String name, String phone, String adress, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
