package com.example.demo.strategy;

import java.math.BigDecimal;

public interface PromoteStrategy {
    BigDecimal doDiscount(BigDecimal price);
}
