package classes.supermarket;

import java.util.ArrayList;
import java.util.List;

import classes.consumer.Consumer;
import classes.food.Food;

public class Supermarket {
    private String name;
    private List<Food> foodsForSale;
    private List<Consumer> clients;

    public Supermarket(String name) {
        this.name = name;
        this.foodsForSale = new ArrayList<Food>();
        this.clients = new ArrayList<Consumer>();
    }

    public void addFoodForSale(Food food) {
        foodsForSale.add(food);
    }

    public void removeFoodForSale(Food food) {
        foodsForSale.remove(food);
    }

    public void addClient(Consumer consumer) {
        clients.add(consumer);
    }

    public void removeClient(Consumer consumer) {
        clients.remove(consumer);
    }

    public double calculateTotalProfit() {
        double totalProfit = 0.0;
        for (Consumer consumer : clients) {
            totalProfit += consumer.calculateTotalPrice();
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
