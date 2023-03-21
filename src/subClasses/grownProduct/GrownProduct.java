package subClasses.grownProduct;

import subClasses.foodSale.FoodSale;

public class GrownProduct {
    private FoodSale name;
    private double unitaryValue;

    public GrownProduct(FoodSale name, double unitaryValue) {
        this.name = name;
        this.unitaryValue = unitaryValue;
    }

    public FoodSale getName() {
        return name;
    }

    public void setName(FoodSale name) {
        this.name = name;
    }

    public double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }


}
