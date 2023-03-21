package classes.product;

import classes.food.Food;

import java.time.LocalDate;

public class Product extends Food {
    private double unityPrice;

    public Product(String name, int quantity, LocalDate expirationDate, double unityPrice) {
        super(name, quantity, expirationDate);
        this.unityPrice = unityPrice;
    }

    public double calculateTotalPrice(int quantity) {
        return unityPrice * quantity;
    }

    public double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }

}
