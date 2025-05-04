package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber , String accountHolder  , double balance ){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double ammount) {
        balance += ammount;
    }

    public void withdraw(double ammount) {
        if (  balance < ammount) {
            throw new IllegalArgumentException ("Insufficient funds");
        }

        balance -= ammount;
    }

    public double getBalance(){
        return balance;
    }

    public abstract void calculateInterest();
    
    }

