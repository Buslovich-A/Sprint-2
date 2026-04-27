package service;
import model.Food;

public class ShoppingCart {
    Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    // Возвращает общую стоимость товаров в корзине без скидок
    public double getAmountWithoutDiscount() {
        double amountWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            amountWithoutDiscount = amountWithoutDiscount + (foods[i].getAmount() * foods[i].getPrice());
        }

        return amountWithoutDiscount;
    }

    // Возвращает общую стоимость товаров в корзине с учётом скидок
    public double getAmountWithDiscount() {
        double amountWithDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            amountWithDiscount = amountWithDiscount + ((foods[i].getAmount() * foods[i].getPrice()) - (foods[i].getAmount() * foods[i].getPrice() * foods[i].getDiscount()));
        }

        return amountWithDiscount;
    }

    // Возвращает общую стоимость вегетариантских продуктов без скидок
    public double getVegAmountWithoutDiscount() {
        double vegAmountWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                vegAmountWithoutDiscount = vegAmountWithoutDiscount + foods[i].getAmount() * foods[i].getPrice();
            }
        }

        return vegAmountWithoutDiscount;
    }
}