package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;

public class Chocolate extends ToppingDecorator {
    private String name = "Chocolate";
    private double price = .10;

    public Chocolate(ICupcake icupcake) {
        super(icupcake);
    }

    public String getName() {
        return this.icupcake.getName().contains(" with ") ? this.icupcake.getName() + " and " + this.name : this.icupcake.getName() + " with " + this.name;
    }

    public double getPrice() {
        return this.icupcake.getPrice() + this.price;
    }

    @Override
    public String toString() {
        return getName() + " - R$ " + String.format("%.2f", getPrice());
    }
}
