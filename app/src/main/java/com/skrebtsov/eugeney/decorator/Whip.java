package com.skrebtsov.eugeney.decorator;

public class Whip extends CondimentDecarator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double cost() {
        return 0.10 + beverage.cost();
    }
}
