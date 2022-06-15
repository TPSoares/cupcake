package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;

abstract public class ToppingDecorator implements ICupcake {

    protected ICupcake icupcake;

    public ToppingDecorator(ICupcake icupcake) {
        this.icupcake = icupcake;
    }

    public String getName() {
        return this.icupcake.getName();
    }

    public double getPrice() {
        return this.icupcake.getPrice();
    }
}
