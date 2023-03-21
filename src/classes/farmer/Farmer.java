package classes.farmer;

import java.util.ArrayList;

import classes.farm.Farm;
import subClasses.farmersFarm.FarmersFarm;

public class Farmer {
    private String name;
    private int age;
    private ArrayList<FarmersFarm> farmers = new ArrayList<FarmersFarm>();

    public void addFarm(Farm name, double acres) {
        FarmersFarm farm = new FarmersFarm(name, acres);
        farmers.add(farm);
    }

    public void removeFarm(FarmersFarm farm) {
        farmers.remove(farm);
    }

    public double calculateTotalProduction () {
        double totalProduction = 0;
        for (FarmersFarm farm : farmers) {
            totalProduction += farm.getTotalProduction();
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

    public ArrayList<FarmersFarm> getFarmers() {
        return farmers;
    }

    public void setFarmers(ArrayList<FarmersFarm> farmers) {
        this.farmers = farmers;
    }

    public Farmer(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
