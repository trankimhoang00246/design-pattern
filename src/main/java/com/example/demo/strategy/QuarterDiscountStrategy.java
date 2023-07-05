package com.example.demo.strategy;

import java.math.BigDecimal;

public class QuarterDiscountStrategy implements PromoteStrategy{
    @Override
    public BigDecimal doDiscount(BigDecimal price) {
        BigDecimal num = new BigDecimal("0.25");
        return price.multiply(num);
    }
}
