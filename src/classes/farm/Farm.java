package classes.farm;

import java.util.ArrayList;

import subClasses.employees.Employees;
import subClasses.foodSale.FoodSale;
import subClasses.grownProduct.GrownProduct;

public class Farm {
    private String name;
    private double acres;
    ArrayList<GrownProduct> products = new ArrayList<GrownProduct>();
    ArrayList<Employees> employees = new ArrayList<Employees>();

    public Farm(String name, double acres) {
        this.name = name;
        this.acres = acres;
    }

    public void produceFoodSale(FoodSale name, double unitaryValue) {
        GrownProduct product = new GrownProduct(name, unitaryValue);
        products.add(product);
    }

    public void addEmployees(Employees employee) {
        employees.add(employee);
    }

    public void addProducts(GrownProduct product) {
        products.add(product);
    }

    public void removeProduct(GrownProduct product) {
        products.remove(product);
    }

    public void removeEmployee(Employees employee) {
        employees.remove(employee);
    }

    public double calculateTotalProductionValue() {
        double totalProductionValue = 0;
        for (GrownProduct product : products) {
            totalProductionValue += product.getUnitaryValue();
        }
        return totalProductionValue;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcres() {
        return acres;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }

    public ArrayList<GrownProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<GrownProduct> products) {
        this.products = products;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

	public FoodSale sellFoodSale(FoodSale foodSale, int i) {
		return null;
	}



    

  

}
