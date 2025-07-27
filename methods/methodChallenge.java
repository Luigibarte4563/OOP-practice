public class methodChallenge {
    public static void main(String[]args){

        int numbers[] = {1, 2, 5};

        int result = summation(numbers);

        System.out.println(result);

    }

    static int summation(int numbers[]){
        
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            sum = sum + number;
        }

        return sum;

    }
}
