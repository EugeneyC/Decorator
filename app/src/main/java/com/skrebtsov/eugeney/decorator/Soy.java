package com.skrebtsov.eugeney.decorator;

public class Soy extends CondimentDecarator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double cost() {
        return 0.30 + beverage.cost();
    }
}
