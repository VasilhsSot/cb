package Inheritance;

public class Account {
    
//variables=====================================================================
    private String owner;
    private int iban;
    private double balance;
    private double interest;
    
//constructors==================================================================
    public Account(){}
    
    public Account (String owner, int iban, double balance, double interest){
        this.owner=owner;
        this.balance=balance;
        this.iban=iban;
        this.interest=interest;
    }

//setters & getters=============================================================

    public String getOwner() {
        return owner;
    }

    public int getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
}
