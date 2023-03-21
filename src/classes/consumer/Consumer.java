package classes.consumer;

import java.util.ArrayList;
import java.util.Date;

import subClasses.purchasedFood.PurchasedFood;

public class Consumer {
    private String name;
    private Date birthDate;
    private ArrayList<PurchasedFood> purchasedFood = new ArrayList<PurchasedFood>();
    
    public Consumer(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void addPurchasedFood(PurchasedFood food) {
        purchasedFood.add(food);
    }

    public void removePurchasedFood(PurchasedFood food) {
        purchasedFood.remove(food);
    }

    public double calculateTotalSpent() {
        double totalSpent = 0;
        for (PurchasedFood food : purchasedFood) {
            totalSpent += food.getPrice();
        }
        return totalSpent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<PurchasedFood> getPurchasedFood() {
        return purchasedFood;
    }
}
