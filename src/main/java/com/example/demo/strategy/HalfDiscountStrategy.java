package com.example.demo.strategy;

import java.math.BigDecimal;

public class HalfDiscountStrategy implements PromoteStrategy{
    @Override
    public BigDecimal doDiscount(BigDecimal price) {
        BigDecimal num = new BigDecimal("0.5");
        return price.multiply(num);
    }
}
