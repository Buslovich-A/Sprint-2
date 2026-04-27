package model;

public abstract class Food implements Discountable {
    protected int amount;  // количество продукта в килограммах
    protected double price; // цена за килограмм
    protected boolean isVegetarian; // вегетарианский ли продукт

    // Возвращает количество продукта
    public int getAmount() {
        return amount;
    }

    // Возвращает цену за килограмм
    public double getPrice() {
        return price;
    }

    // Возвращает признак вегетарианского продукта
    public boolean isVegetarian() {
        return isVegetarian;
    }

}