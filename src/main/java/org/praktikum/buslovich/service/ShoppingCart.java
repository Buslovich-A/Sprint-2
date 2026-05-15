package org.praktikum.buslovich.service;
import org.praktikum.buslovich.model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getAmountWithoutDiscount() {
        double amountWithoutDiscount = 0;

        for (Food food : foods) {
            amountWithoutDiscount += (food.getAmount() * food.getPrice());
        }
        return amountWithoutDiscount;
    }

    public double getAmountWithDiscount() {
        double amountWithDiscount = 0;

        for (Food food : foods) {
            amountWithDiscount += ((food.getAmount() * food.getPrice()) - (food.getAmount() * food.getPrice() * food.getDiscount()));
        }
        return amountWithDiscount;
    }

    public double getVegAmountWithoutDiscount() {
        double vegAmountWithoutDiscount = 0;

        for (Food food : foods) {
            if (food.isVegetarian()) {
                vegAmountWithoutDiscount += food.getAmount() * food.getPrice();
            }
        }
        return vegAmountWithoutDiscount;
    }
}