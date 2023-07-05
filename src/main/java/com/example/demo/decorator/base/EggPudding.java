package com.example.demo.decorator.base;

import com.example.demo.decorator.IMilkTea;
import com.example.demo.decorator.MilkTeaTopping;

public class EggPudding extends MilkTeaTopping {
    public EggPudding(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    public int cost() {
        return 5 + iMilkTea.cost();
    }
}
