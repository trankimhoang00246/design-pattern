package com.example.demo;

import com.example.demo.decorator.MilkTea;
import com.example.demo.decorator.base.Bubble;
import com.example.demo.decorator.base.EggPudding;
import com.example.demo.decorator.base.WhiteBubble;
import junit.framework.TestCase;

public class TestDecorator extends TestCase {
    public void testMilk() {

        System.out.println("Milk tea: "+ new MilkTea().cost());

        System.out.println("Milk tea full topping: "+ new Bubble(new EggPudding(new WhiteBubble(new MilkTea()))).cost());

        System.out.println("Milk tea egg-while: "+ new EggPudding(new WhiteBubble(new MilkTea())).cost());

    }
}
