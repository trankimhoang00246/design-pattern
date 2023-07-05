package com.example.demo.decorator.base;

import com.example.demo.decorator.IMilkTea;
import com.example.demo.decorator.MilkTeaTopping;

public class WhiteBubble extends MilkTeaTopping {
    public WhiteBubble(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    public int cost() {
        return 3 + iMilkTea.cost();
    }
}
