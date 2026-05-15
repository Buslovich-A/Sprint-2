package org.praktikum.buslovich.model;

import static org.praktikum.buslovich.model.constants.Colour.RED;
import static org.praktikum.buslovich.model.constants.Discount.DEFAULT_DISCOUNT;
import static org.praktikum.buslovich.model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    public double getDiscount() {
        if (RED.equals(colour)) {
            return RED_APPLE_DISCOUNT;
        }
            return DEFAULT_DISCOUNT;
    }
}