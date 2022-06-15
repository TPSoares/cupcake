package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;

public class Nuts extends ToppingDecorator {
    private String name = "Nuts";
    private double price = .20;

    public Nuts(ICupcake icupcake) {
        super(icupcake);
    }

    public String getName() {
        return this.icupcake.getName().contains("with") ? this.icupcake.getName() + " and " + this.name : this.icupcake.getName() + " with " + this.name;
    }

    public double getPrice() {
        return this.icupcake.getPrice() + this.price;
    }

    @Override
    public String toString() {
        return getName() + " - R$ " + String.format("%.2f", getPrice());
    }
}
