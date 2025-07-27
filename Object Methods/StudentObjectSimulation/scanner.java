package StudentObjectSimulation;

import java.util.Scanner;

public class scanner {
    
    void takeUserInput(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name   : ");
        String firstName = scan.nextLine();

        System.out.print("Enter your last name    : ");
        String lastName = scan.nextLine();
        
        System.out.print("Enter your course       : ");
        String course = scan.nextLine();

        System.out.print("Enter your year level   : ");
        int year = scan.nextInt();

        System.out.print("Enter your section      : ");
        int section = scan.nextInt();

        System.out.print("Enter your midter Grade : ");
        float midtermGRD = scan.nextFloat();

        System.out.print("Enter you Final Grade   : ");
        float finalGRD = scan.nextFloat();

        System.out.println("---------------------------------");
    }
}
