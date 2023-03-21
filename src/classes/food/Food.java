package classes.food;

import java.util.Date;

public class Food {
    private String name;
    private int quantity;
    private Date expirationDate;
    
    public Food(String name, int quantity, Date expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public void verifyExpirationDate() {
        Date today = new Date();
        if (today.after(expirationDate)) {
            System.out.println("O produto " + name + " passou da validade.");
        } else {
            System.out.println("O produto  " + name + " não passou da validade");
        }
    }

    public void verifyQuantity(int quantity) {
        if (quantity > 0) {
            System.out.println("O produto " + name + " ainda tem " + quantity + " unidades.");
        } else {
            System.out.println("O produto " + name + " não tem mais unidades.");
        }
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
