package challengStudentInfo;

import java.util.*;


public class studentInput {
    
    public static int size = 0;
    public static String fName, LName, course;
    public static int year;
    public static char section;
    
    void input(){

        Scanner s = new Scanner(System.in);
        ArrayList<StudentInfo> SInfo = new ArrayList<StudentInfo>();

        System.out.print("Enter a student to register : ");
        size = s.nextInt();
        System.out.println();

        s.nextLine();

        for(int i = 0; i < size; i++){

            
            System.out.println("Student number --- " + (i + 1));

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

            SInfo.add(new StudentInfo((i + 1), fName, LName, year, course, section));

        }

        System.out.print("you want to remove your info?(y/n) : ");
        String remove = s.nextLine();
        s.nextLine();

        if(remove.equalsIgnoreCase("y")){
            System.out.print("what index do you like to remove : ");
            int index = s.nextInt();
            s.nextLine();

            SInfo.remove(index);
        }

        System.out.print("you want to clear all the data? (y/n) : ");
        String clear = s.nextLine().trim();
        
        if(clear.equalsIgnoreCase("y")){
            SInfo.clear();
            System.out.println("theres no output here....");
        }else{
            System.out.println("----Student information----");
            System.out.println();

            for(int o = 0; o < SInfo.size(); o++){
                StudentInfo J = SInfo.get(o);
                J.display();
            }
        }

    }
}
