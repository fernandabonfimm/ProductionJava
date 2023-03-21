package classes.supermarket;

import java.util.ArrayList;

import subClasses.clients.Clients;
import subClasses.foodSale.FoodSale;

public class Supermarket {
    private String name;
    private ArrayList<FoodSale> foodSales = new ArrayList<FoodSale>();
    private ArrayList<Clients> clients = new ArrayList<Clients>();

    public Supermarket(String string, FoodSale foodSale, Clients clients) {
        this.name = string;
        this.foodSales.add(foodSale);
        this.clients.add(clients);
    }

    public void buyFoodSale(FoodSale foodSale, Clients client) {
        foodSales.remove(foodSale);
        clients.add(client);
    }

    public void sellFoodSale(FoodSale foodSale, int price){
        foodSales.add(foodSale);
        foodSale.setPrice(price);
    }

    public void addFoodSale(String name, double price) {
        FoodSale foodSale = new FoodSale(name, price);
        foodSales.add(foodSale);
    }

    public void removeFoodSale(FoodSale foodSale) {
        foodSales.remove(foodSale);
    }

    public void addClient(String name) {
        Clients client = new Clients(name);
        clients.add(client);
    }

    public void removeClient(Clients client) {
        clients.remove(client);
    }

    public void calculateTotalProfit() {
        double totalProfit = 0;
        for (FoodSale foodSale : foodSales) {
            totalProfit += foodSale.getPrice();
        }
        System.out.println("Lucro total do supermercado: " + totalProfit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FoodSale> getFoodSales() {
        return foodSales;
    }

    public void setFoodSales(ArrayList<FoodSale> foodSales) {
        this.foodSales = foodSales;
    }

    public ArrayList<Clients> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Clients> clients) {
        this.clients = clients;
    }
}
