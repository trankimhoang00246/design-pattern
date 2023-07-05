package com.example.demo.decorator;

public abstract class MilkTeaTopping implements IMilkTea {
    protected IMilkTea iMilkTea;

    public MilkTeaTopping(IMilkTea iMilkTea) {
        this.iMilkTea = iMilkTea;
    }

    public int cost() {
        return iMilkTea.cost();
    }
}
