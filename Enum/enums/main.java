public class main {
    public static void main(String[]args){


        USCurrency coins[] = new USCurrency[4];

        coins[0] = USCurrency.PENNY;
        coins[1] = USCurrency.NICLE;
        coins[2] = USCurrency.DIME;
        coins[3] = USCurrency.QUARTER;

        float sum = 0;

        for(USCurrency coin : coins){
            System.out.println(coin.name);
        }


        
    } 
}
