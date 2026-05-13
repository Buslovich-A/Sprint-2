import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {

    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, RED);
        Food greenApples = new Apple(8, 60, GREEN);

        Food[] foods = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.getAmountWithoutDiscount());
        System.out.println(cart.getAmountWithDiscount());
        System.out.println(cart.getVegAmountWithoutDiscount());
    }
}