package oop.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public int getNumber(){
        return number;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public String getHolder(){
        return holder;
    }
     public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {

        if (amount >= 0.0 && amount <= balance) {
            balance -= amount + 5.0;
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f",
                number, holder, balance);
    }


}
