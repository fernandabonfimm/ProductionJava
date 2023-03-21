package classes.main.Program;

import classes.farm.Farm;
import classes.farmer.Farmer;
import classes.supermarket.Supermarket;
import subClasses.clients.Clients;
import subClasses.foodSale.FoodSale;

public class Program {
    private Farm farm;
    private Supermarket supermarket;
    private Clients clients;
    private Farmer farmer;

    public static void main(String[] args) {

        Farmer Barbara = new Farmer("Barbara", 76);
        Farmer Fernanda = new Farmer("Fernanda", 88);

        Farm SadFarm = new Farm("SadFarm", 100);
        Farm HappyFarm = new Farm("HappyFarm", 200);

        Barbara.addFarm(SadFarm, SadFarm.getAcres());
        Fernanda.addFarm(HappyFarm, HappyFarm.getAcres());

        System.out.println("Total faturado da fazenda da Barbara: " + Barbara.calculateTotalProduction());
        System.out.println("Total faturado da fazenda da Fernanda: " + Fernanda.calculateTotalProduction());

        Clients[] clients = new Clients[3];

        clients[0] = new Clients("João", "123.456.789-00");
        clients[1] = new Clients("Maria", "987.654.321-00");
        clients[2] = new Clients("José", "123.987.456-00");
        clients[3] = new Clients("Ana", "456.123.789-00");

        FoodSale[] foods = new FoodSale[5];

        foods[0] = new FoodSale("banana", 2.50);
        foods[1] = new FoodSale("maçã", 3.00);
        foods[2] = new FoodSale("laranja", 2.00);
        foods[3] = new FoodSale("uva", 4.00);
        foods[4] = new FoodSale("arroz", 20.00);
        foods[5] = new FoodSale("feijão", 15.00);

        Supermarket Supermarket = new Supermarket("Tonin", foods[0], clients[1]);

        SadFarm.produceFoodSale(foods[0], 100);
        HappyFarm.produceFoodSale(foods[1], 200);

        Supermarket.buyFoodSale(SadFarm.sellFoodSale(foods[0], 50), null);
        Supermarket.buyFoodSale(HappyFarm.sellFoodSale(foods[1], 100), null);

        for (int i = 0; i < clients.length; i++) {
            Supermarket.addClient(clients[i].getName(), clients[i].getCpf());
            for (int j = 0; j < foods.length; j++) {
                Supermarket.addFoodSale(foods[j].getName(), foods[j].getPrice());
            }
            Supermarket.removeClient(clients[i]);
        }

    }
}
