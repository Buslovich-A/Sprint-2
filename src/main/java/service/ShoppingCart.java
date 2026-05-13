package service;
import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getAmountWithoutDiscount() {
        double amountWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            amountWithoutDiscount += (foods[i].getAmount() * foods[i].getPrice());
        }

        return amountWithoutDiscount;
    }

    public double getAmountWithDiscount() {
        double amountWithDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            amountWithDiscount += ((foods[i].getAmount() * foods[i].getPrice()) - (foods[i].getAmount() * foods[i].getPrice() * foods[i].getDiscount()));
        }

        return amountWithDiscount;
    }

    public double getVegAmountWithoutDiscount() {
        double vegAmountWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                vegAmountWithoutDiscount += foods[i].getAmount() * foods[i].getPrice();
            }
        }

        return vegAmountWithoutDiscount;
    }
}