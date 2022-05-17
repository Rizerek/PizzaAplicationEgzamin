package com.example.sprawdzian.data.entity.size;

import com.example.sprawdzian.data.entity.order_size.OrderSizeEntity;
import com.example.sprawdzian.data.entity.pizza.PizzaEntity;
import com.example.sprawdzian.domain.model.Size;
import com.example.sprawdzian.remote.rest.dto.response.SizeDto;

import javax.persistance.*;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "size")
    private Size size;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "pizza_id")
    private Integer pizzaId;
    @OneToMany(mappedBy = "size")
    private Set<SizeDto> orderSizes;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

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

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Set<SizeDto> getOrderSizes() {
        return orderSizes;
    }

    public void setOrderSizes(Set<SizeDto> orderSizes) {
        this.orderSizes = orderSizes;
    }

    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }


