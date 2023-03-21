package classes.main.program;

import java.time.LocalDate;

import classes.farm.Farm;
import classes.farmer.Farmer;
import classes.food.Food;
import classes.product.Product;
import classes.supermarket.Supermarket;
import classes.consumer.Consumer;

public class Program {
    public static void main(String[] args) {
        //Datas de expiração
        LocalDate expirationDate1 = LocalDate.of(2023, 6, 30);
        LocalDate expirationDate2 = LocalDate.of(2023, 9, 30);
        LocalDate expirationDate3 = LocalDate.of(2023, 12, 31);


        // Criando Fazendeiros e Fazendas
        Farmer farmer1 = new Farmer("Barbara", 40);
        Farmer farmer2 = new Farmer("Fernanda", 18);

        Farm farm1 = new Farm("SadFarm", 100);
        Farm farm2 = new Farm("HappyFarm", 50);

        farmer1.addFarm(farm1);
        farmer2.addFarm(farm2);


        // Criando produtos e alimentos a serem vendidos
        Food food1 = new Food("Arroz", 100, expirationDate1);
        Product product = new Product(food1.getName(), food1.getQuantity(), food1.getExpirationDate(), 10.0);
        farm1.addCultivatedProduct(product);
        
        Food food2 = new Food("Feijão", 100, expirationDate2);
        Product product2 = new Product(food2.getName(), food2.getQuantity(), food2.getExpirationDate(), 10.0);
        farm1.addCultivatedProduct(product2);

        Food food3 = new Food("Macarrão", 100, expirationDate3);
        Product product3 = new Product(food3.getName(), food3.getQuantity(), food3.getExpirationDate(), 10.0);
        farm2.addCultivatedProduct(product3);

        Food food4 = new Food("Farinha", 100, expirationDate1);
        Product product4 = new Product(food4.getName(), food4.getQuantity(), food4.getExpirationDate(), 10.0);
        farm2.addCultivatedProduct(product4);

        // Criando supermercado
        Supermarket supermarket = new Supermarket("Tonin SuperAtacados");
        supermarket.addFoodForSale(food1);
        supermarket.addFoodForSale(food2);
        supermarket.addFoodForSale(food3);
        supermarket.addFoodForSale(food4);
        
        // Criando consumidores
        Consumer consumer1 = new Consumer("Elisa", LocalDate.of(2000, 1, 1));
        Consumer consumer2 = new Consumer("Letícia", LocalDate.of(1990, 12, 31));
        Consumer consumer3 = new Consumer("Higor", LocalDate.of(1985, 7, 15));
        
        // Adicionando consumidores à lista do supermercado
        supermarket.addClient(consumer1);
        supermarket.addClient(consumer2);
        supermarket.addClient(consumer3);
        
        // Simulando a compra de alimentos pelos consumidores
        consumer1.addFoodBought(food1);
        consumer1.addFoodBought(food3);
        
        consumer2.addFoodBought(food1);
        consumer2.addFoodBought(food2);
        
        consumer3.addFoodBought(food2);
        consumer3.addFoodBought(food3);
        
        // Exibindo o lucro total do supermercado
        double totalProfit = supermarket.calculateTotalProfit();
        System.out.println("Lucro total do supermercado: " + totalProfit);
    }
}
