public class bank {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid deposite amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Invalid withdraw amount.");
        }
    }

    public double getBalance(){
        return balance;
    }


}
