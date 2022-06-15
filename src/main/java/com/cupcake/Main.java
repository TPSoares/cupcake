package com.cupcake;

import com.cupcake.interfaces.ICupcake;
import com.cupcake.models.Chocolate;
import com.cupcake.models.Cupcake;
import com.cupcake.models.Nuts;
import com.cupcake.models.Sugar;

public class Main {
    public static void main(String[] args) {

//      Create Cupcake
        ICupcake cupcake = new Cupcake("Cupcake", 10.0);
        System.out.println(cupcake.toString());
        ICupcake sugarAndNutsCake = new Nuts(new Sugar(cupcake));
        System.out.println(sugarAndNutsCake.toString());
        ICupcake threeTopsCake = new Sugar(new Nuts(new Chocolate(cupcake)));
        System.out.printf(threeTopsCake.toString());
    }
}
