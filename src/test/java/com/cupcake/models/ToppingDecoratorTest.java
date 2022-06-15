package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingDecoratorTest {

    @Test
    void createCupcakeAndReturnNameAndPrice() {

        String name = "Regular cupcake";
        double price = 15.00;

        ICupcake cupcake = new Cupcake("Regular cupcake", 15.00);
        assertEquals(name, cupcake.getName());
        assertEquals(price, cupcake.getPrice());
    }

}