package com.skrebtsov.eugeney.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Bland Coffee";
    }
    @Override
    public Double cost() {
        return 0.99;
    }
}
