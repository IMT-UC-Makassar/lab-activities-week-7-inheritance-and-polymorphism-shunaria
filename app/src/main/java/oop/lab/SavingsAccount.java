package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    private static final double interest_rate = 0.15;

    public SavingsAccount(String accountNumber , String accountHolder , double balance){
        super(accountNumber,accountNumber,balance);
    }

    @Override
    public void calculateInterest(){
        double interest = balance * interest_rate;
        deposit(interest);
    }

    @Override
    public void transferFunds(double ammount , String targetAccount){
        withdraw(ammount);
    }

    @Override
    public void payBills(double ammount){
        withdraw(ammount);
    }
    
}