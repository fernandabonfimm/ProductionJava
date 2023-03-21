package classes.food;

import java.time.LocalDate;

public class Food {
    private String name;
    private int quantity;
    private LocalDate expirationDate;

    public Food(String name, int quantity, LocalDate expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }
    
    public boolean isFoodExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }
    
    public boolean hasEnoughQuantity(int numPeople) {
        return quantity >= numPeople;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}