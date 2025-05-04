package oop.lab;

public class CreditCard extends Card {
    public CreditCard(string cardNumber, String customerName){
        super(cardNumber,customerName);
    }

    @Override 
    public double getInterestRate(){
        return 15.00;
    }
}

