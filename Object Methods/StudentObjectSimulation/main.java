package StudentObjectSimulation;

public class main{
    public static void main(String[]args){

        scanner takeScanner = new scanner();

        takeScanner.takeUserInput();
        String firstName = takeScanner.firstName;

        studentProfile s = new studentProfile(firstName, lastName,course, year, section ,midtermGRD, finalGRD);

        s.introduce();
        System.out.println("");

        s.evaluateGrade();
    }

}