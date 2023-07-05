package com.example.demo.strategy;

import java.math.BigDecimal;

public class NoDiscountStrategy implements PromoteStrategy{
    @Override
    public BigDecimal doDiscount(BigDecimal price) {
        return price;
    }
}
