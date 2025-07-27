package main;

import java.util.Scanner;

public class car {

    String egine;
    String color;
    int horsePower;

    Scanner s = new Scanner(System.in);

    car(String egine, String color, int horsePower){

        this.egine = egine;
        this.color = color;
        this.horsePower = horsePower;

        System.out.println(egine + " " + color + " " + horsePower);
    }

}
