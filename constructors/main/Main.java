package main;

import java.util.Scanner;

import java.util.PropertyResourceBundle;

public class Main {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        String egine = "";
        String color = "";
        int horsePower;

        product p = new product();
        Product1 p1 = new Product1("Luigi", 0.1f);

        ///////////////////////////////////////////////////
        System.out.println("");
        
        System.out.print("Enter engine name : ");
        egine = s.nextLine();
        System.out.print("Enter car color   : ");
        color = s.nextLine();
        System.out.print("Enter horse Power : ");
        horsePower = s.nextInt();

        car c = new car(egine, color, horsePower);

    
    }
}
