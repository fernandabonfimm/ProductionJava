package classes.product;

import java.util.Date;

import classes.food.Food;

public class Product extends Food {
    private float price;

    public Product(String name, int quantity, Date expirationDate, float price) {
        super(name, quantity, expirationDate);

        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void calculateTotalPrice() {
        float totalPrice = getQuantity() * price;
        System.out.println("O preço total do produto " + getName() + " é de R$" + totalPrice);
    }

}
