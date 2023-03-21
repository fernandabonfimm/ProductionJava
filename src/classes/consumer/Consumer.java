package classes.consumer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import classes.food.Food;
import classes.product.Product;

public class Consumer {
    private String name;
    private LocalDate birthDate;
    private List<Food> foodsBought;

    public Consumer(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.foodsBought = new ArrayList<>();
    }

    public void addFoodBought(Food food) {
        this.foodsBought.add(food);
    }

    public void removeFoodBought(Food food) {
        this.foodsBought.remove(food);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Food food : this.foodsBought) {
            if (food instanceof Product) {
                Product product = (Product) food;
                totalPrice += product.calculateTotalPrice(0);
            }
        }
        return totalPrice;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
