package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String accountNumber , String accountHolder , double balance){
        super(accountNumber,accountHolder,balance);
    }

    @Override
    public void payBills (double ammount){
        withdraw(ammount);
    }

    @Override
    public void transferFunds(double ammount , String targetAccount){
        withdraw(account);
    }

    @Override
    public void calculateInterest(){

    }
}
