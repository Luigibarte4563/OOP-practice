public class mainBank {
    
    public static void main(String[]args){

        bank myBank = new bank();

        myBank.setAccountNumber("10102210414");
        myBank.setAccountHolder("Luigi");

        myBank.deposit(5000);
        myBank.withdraw(1000);

        System.out.println("your balance: PHP " + myBank.getBalance());
    }

}
