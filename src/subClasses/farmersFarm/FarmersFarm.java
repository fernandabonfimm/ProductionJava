package subClasses.farmersFarm;

import classes.farm.Farm;

public class FarmersFarm {
    private Farm name;
    private double acres;
    private double totalProduction;

    public FarmersFarm(Farm name, double acres) {
        this.name = name;
        this.acres = acres;
    }

    public double getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(double totalProduction) {
        this.totalProduction = totalProduction;
    }

    public Farm getName() {
        return name;
    }

    public void setName(Farm name) {
        this.name = name;
    }

    public double getAcres() {
        return acres;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }

}
