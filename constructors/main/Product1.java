package main;

public class Product1 {
    
    String name;
    float price;

    Product1(String name, float price){
        this.name = name;
        this.price = price;

        System.out.println(name + price + " Created" );
    }
}
