package org.praktikum.buslovich.model;

import static org.praktikum.buslovich.model.constants.Discount.DEFAULT_DISCOUNT;

public class Meat extends Food {
    public Meat(int amount, double price) {
        this.isVegetarian = false;
        this.amount = amount;
        this.price = price;
    }

    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}