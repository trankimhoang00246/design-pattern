package com.example.demo.strategy;

import java.math.BigDecimal;

public class SeventyFiveDiscountStrategy implements PromoteStrategy{
    @Override
    public BigDecimal doDiscount(BigDecimal price) {
        BigDecimal num = new BigDecimal("0.75");
        return price.multiply(num);
    }
}
