package challenge;
import java.util.*;

public class mainting {

    public static String fName, LName, course;
    public static int year;
    public static char section;

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        studentInfo students[] = new studentInfo[2];

        for(int i = 0; i < students.length; i++){

            System.out.print("enter your F-name  : ");
            fName = s.nextLine();

            System.out.print("enter your L-name  : ");
            LName = s.nextLine();

            System.out.print("enter your year    : ");
            year = s.nextInt();
            s.nextLine();

            System.out.print("enter your course  : ");
            course = s.nextLine();;

            System.out.print("enter your section : ");
            section = s.nextLine().charAt(0);
            s.nextLine();

            System.out.println();

            students[i] = new studentInfo(fName, LName, year, course, section);
        }

        System.out.println("----Student information----");
        System.out.println();

        for(int o = 0; o < students.length; o++){
            students[o].display();
        }

        
    }    
}
