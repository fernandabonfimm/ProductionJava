package classes.farmer;

import java.util.ArrayList;
import java.util.List;

import classes.farm.Farm;

public class Farmer {
    private String name;
    private int age;
    private List<Farm> farms;
    private double totalHectaresCultivated;

    public Farmer(String name, int age) {
        this.name = name;
        this.age = age;
        this.farms = new ArrayList<Farm>();
        this.totalHectaresCultivated = 0.0;
    }

    public void addFarm(Farm farm) {
        farms.add(farm);
        totalHectaresCultivated += farm.getSizeInHectares();
    }

    public void removeFarm(Farm farm) {
        farms.remove(farm);
        totalHectaresCultivated -= farm.getSizeInHectares();
    }

    public double calculateTotalProduction() {
        double totalProduction = 0.0;
        for (Farm farm : farms) {
            totalProduction += farm.calculateTotalPrice();
        }
        return totalProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Farm> getFarms() {
        return farms;
    }

    public void setFarms(List<Farm> farms) {
        this.farms = farms;
    }

    public double getTotalHectaresCultivated() {
        return totalHectaresCultivated;
    }

    public void setTotalHectaresCultivated(double totalHectaresCultivated) {
        this.totalHectaresCultivated = totalHectaresCultivated;
    }

}
