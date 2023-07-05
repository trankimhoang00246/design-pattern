package com.example.demo;

import com.example.demo.strategy.*;
import junit.framework.TestCase;

import java.math.BigDecimal;

public class TestStrategy extends TestCase {

    public void testPrintHello() {
        System.out.println("Hello" + "\n");
    }

    public void testPromoteStrategy() {
        Product product = new Product();

        product.setPrice(BigDecimal.valueOf(100));

        product.setPromoteStrategy(new NoDiscountStrategy());
        System.out.println(product.getPromoteStrategy() + "\n");

        product.setPromoteStrategy(new HalfDiscountStrategy());
        System.out.println(product.getPromoteStrategy() + "\n");

        product.setPromoteStrategy(new QuarterDiscountStrategy());
        System.out.println(product.getPromoteStrategy() + "\n");

        product.setPromoteStrategy(new SeventyFiveDiscountStrategy());
        System.out.println(product.getPromoteStrategy() + "\n");
    }
}
