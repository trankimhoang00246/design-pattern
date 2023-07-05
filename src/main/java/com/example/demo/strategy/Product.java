package com.example.demo.strategy;

import java.math.BigDecimal;


public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private PromoteStrategy promoteStrategy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromoteStrategy() {
        return promoteStrategy.doDiscount(price);
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public Product() {
    }
}
