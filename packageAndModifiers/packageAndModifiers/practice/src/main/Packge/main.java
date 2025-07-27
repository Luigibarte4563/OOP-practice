package main.Packge;

import mathematics.*;
import java.util.Scanner;

public class main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        arithmetic math = new arithmetic();
        Strings printer = new Strings();
        constant cons = new constant();

        cons.pi = 500;
        System.out.println(cons.pi);

        printer.print("hello");

        System.out.print("enter num1       : ");
        int num1 = scan.nextInt();

        System.out.print("enter num2       : ");
        int num2 = scan.nextInt();

        System.out.print("enter operator   : ");
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+':
                int sum = math.add(num1, num2);
                System.out.println("result " + sum);
            break;

            case '-':
                int sub = math.sub(num1, num2);
                System.out.println("result : " + sub);
            break;    

            case '*':
                int prod = math.prod(num1, num2);
                System.out.println("result : " + prod);
            break;    

            case '/':
                int divide = math.divide(num1, num2);
                System.out.println("result : " + divide);
            break;    
        }
    }    
}
