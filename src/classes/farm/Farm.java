package classes.farm;

import java.util.ArrayList;
import java.util.List;

import classes.product.Product;

public class Farm {
    private String name;
    private double sizeInHectares;
    private List<Product> cultivatedProducts;
    private List<String> employees;

    public Farm(String name, double sizeInHectares) {
        this.name = name;
        this.sizeInHectares = sizeInHectares;
        this.cultivatedProducts = new ArrayList<Product>();
        this.employees = new ArrayList<String>();
    }

    public void addCultivatedProduct(Product product) {
        cultivatedProducts.add(product);
    }

    public void addEmployee(String employee) {
        employees.add(employee);
    }

    public void removeCultivatedProduct(Product product) {
        cultivatedProducts.remove(product);
    }

    public void removeEmployee(String employee) {
        employees.remove(employee);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : cultivatedProducts) {
            totalPrice += product.calculateTotalPrice(product.getQuantity());
        }
        return totalPrice;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeInHectares() {
        return sizeInHectares;
    }

    public void setSizeInHectares(double sizeInHectares) {
        this.sizeInHectares = sizeInHectares;
    }

    public List<Product> getCultivatedProducts() {
        return cultivatedProducts;
    }

    public void setCultivatedProducts(List<Product> cultivatedProducts) {
        this.cultivatedProducts = cultivatedProducts;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

 
}
