package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;

public class Cupcake implements ICupcake {

    private String name;
    private double price;

    public Cupcake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return getName() + " - R$ " + String.format("%.2f", getPrice());
    }
}
