import java.util.Scanner;

public class calcWithSca {

    static int num1;
    static int num2;
    
    static char operator;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("calculator");
            System.out.println("-------------------------");
            System.out.println("");

            System.out.print("Enter the first num : ");
            num1 = scan.nextInt();
            System.out.println("");

            System.out.print("Enter the operator  : ");
            operator = scan.next().charAt(0);
            System.out.println("");

            System.out.print("Enter the second num: ");
            num2 = scan.nextInt();
            System.out.println("");

            switch (operator) {

                case '+':
                    add(num1, num2);
                    break;

                case '-':
                    subract(num1, num2);
                    break;

                case '/':
                    division(num1, num2);
                    break;

                case 'x':
                    multiply(num1, num2);
                    break;
            }

            System.out.println("you want to continue? y/n: ");
            String startAgain = scan.nextLine();
            System.out.println("");
            
            if(startAgain == "y"){
                continue;
            }else{
                break;
            }
        }

    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void subract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void division(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
