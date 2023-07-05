package com.example.demo.decorator.base;

import com.example.demo.decorator.IMilkTea;
import com.example.demo.decorator.MilkTeaTopping;

public class Bubble extends MilkTeaTopping {
    public Bubble(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    public int cost() {
        return 7 + iMilkTea.cost();
    }
}
