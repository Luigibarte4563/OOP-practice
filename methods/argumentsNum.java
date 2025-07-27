public class argumentsNum {
    public static void main(String[]args){

        addition(1, 2);

        int subract = sub(2, 1);

        System.out.println(subract);


        int times = product(10, 2);

        System.out.println(times);

        System.out.println(isLegalAge(18));

    }

    static void addition(int num1, int num2){
        
        System.out.println(num1 + num2);

    }

    static int sub(int num3, int num4){

        return num3 - num4;
    }

    static int product(int num5, int num6){
        return num5 * num6;
    }

    static boolean isLegalAge(int age){

        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
