package classes.supermarket;

import java.util.ArrayList;
import java.util.List;

import classes.consumer.Consumer;
import classes.food.Food;
import classes.product.Product;

public class Supermarket {
    private String name;
    private List<Food> foodsForSale;
    private List<Consumer> clients;
    private List<Food> foodsBought;

    public Supermarket(String name) {
        this.name = name;
        this.foodsForSale = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.foodsBought = new ArrayList<>();
    }

    public void addFoodForSale(Food food) {
        this.foodsForSale.add(food);
    }

    public void addClient(Consumer consumer) {
        this.clients.add(consumer);
    }

    public void addFoodBought(Food food) {
        this.foodsBought.add(food);
    }

    public double calculateTotalProfit() {
        double totalProfit = 0;
        for (Food food : this.foodsBought) {
            if (food instanceof Product) {
                Product product = (Product) food;
                totalProfit -= product.calculateTotalPrice(product.getQuantity());
            }
        }
    
        for (Food food : this.foodsForSale) {
            if (food instanceof Product) {
                Product product = (Product) food;
                totalProfit += product.calculateTotalPrice(product.getQuantity());
            }
        }
        return totalProfit;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoodsForSale() {
        return foodsForSale;
    }

    public void setFoodsForSale(List<Food> foodsForSale) {
        this.foodsForSale = foodsForSale;
    }

    public List<Consumer> getClients() {
        return clients;
    }

    public void setClients(List<Consumer> clients) {
        this.clients = clients;
    }

}
