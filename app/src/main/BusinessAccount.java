package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService , LoanService {
    
    public BusinessAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber,accountHolder,balance);
        this.loanStatus = "none";
    }

    @Override 
    public void applyForLoan (double ammount){
        loanStatus =  "pending";
    }

    @Override
    public String checkLoanStatus(){
        return loanStatus;
    }

    @Override
    public void calculateInterest(){
        double interest = balance * 0.0225;
        deposit(interest);
    }

    @Override
    public void transferFunds(double ammount ,string targetAccount){;
    withdraw(ammount);
    }

    @Override
    public void payBills(double ammount){
    withdraw(ammount);
    }
}
