package com.skrebtsov.eugeney.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
