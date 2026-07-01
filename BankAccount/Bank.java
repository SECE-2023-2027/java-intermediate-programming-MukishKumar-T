package BankAccount;

class Bank {
    private String accountNo;    
    private String accountHolderName;
    private double balance;

    public Bank(String accountNo, String accountHolderName, double balance){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance > 0.0 ? balance : 0.0;
    }

    public void deposit(double amount){
        if(balance < 0.0) System.out.println("Invalid Deposit Amount");
        else balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance) System.out.println("Insufficient Funds");
        else balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }
}
