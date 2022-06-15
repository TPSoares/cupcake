package com.cupcake.models;

import com.cupcake.interfaces.ICupcake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupcakeTest {

    @Test
    void createCupcakeAndReturnNameAndPrice() {

        String name = "Regular cupcake";
        double price = 15.00;

        ICupcake cupcake = new Cupcake("Regular cupcake", 15.00);
        assertEquals(name, cupcake.getName());
        assertEquals(price, cupcake.getPrice());
    }

    @Test
    void createCupcakeWithTopping() {

        String cupcakeWithToppingName = "Regular cupcake with Chocolate";
        double cupcakeWithToppingPrice = 15.10;

        ICupcake cupcake = new Cupcake("Regular cupcake", 15.00);
        ICupcake cupcakeWithTopping = new Chocolate(cupcake);
        assertEquals(cupcakeWithToppingName, cupcakeWithTopping.getName());
        assertEquals(cupcakeWithToppingPrice, cupcakeWithTopping.getPrice());
    }

    @Test
    void createCupcakeWithMultipleToppings() {

        String cupcakeWithToppingName = "Regular cupcake with Chocolate and Nuts and Sugar";
        double cupcakeWithToppingPrice = 15.60;

        ICupcake cupcake = new Cupcake("Regular cupcake", 15.00);
        ICupcake cupcakeWithMultipleToppings = new Sugar(new Nuts( new Chocolate(cupcake)));
        assertEquals(cupcakeWithToppingName, cupcakeWithMultipleToppings.getName());
        assertEquals(cupcakeWithToppingPrice, cupcakeWithMultipleToppings.getPrice());
    }

    @Test
    void createCupcakeWithMultipleToppingsAndPrice() {

        String cupcakeWithToppingName = "Regular cupcake with Chocolate and Nuts and Sugar - R$ 15,60";

        ICupcake cupcake = new Cupcake("Regular cupcake", 15.00);
        ICupcake cupcakeWithMultipleToppings = new Sugar(new Nuts( new Chocolate(cupcake)));
        assertEquals(cupcakeWithToppingName, cupcakeWithMultipleToppings.toString());
    }

}