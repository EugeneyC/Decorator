package com.skrebtsov.eugeney.decorator;

public class Mocha extends CondimentDecarator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return 0.20 + beverage.cost();
    }
}
