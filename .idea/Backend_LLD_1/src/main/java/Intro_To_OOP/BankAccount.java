package main.java.Intro_To_OOP;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private double balance;
    private String ownerName;
    List<String> transactionHistory;

    public BankAccount() {
        this.balance = 0.0;
        this.ownerName = "";
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount(double balance, String ownerName) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amountToDeposit) {
        if(amountToDeposit > 0.0) {
            this.balance += amountToDeposit;
            transactionHistory.add("Deposited $" + amountToDeposit + " to " + ownerName);
        }else {
            System.out.println("Please enter a positive amount to deposit for " + this.ownerName);
        }
    }

    public void withdraw(double amountToWithdraw) {
        if(amountToWithdraw > 0.0) {
            if(amountToWithdraw <= this.balance) {
                this.balance -= amountToWithdraw;
                transactionHistory.add("Withdrawn $" + amountToWithdraw + " from " + ownerName);
            }else {
                System.out.println("Insufficient balance " + this.ownerName + " to withdraw");
            }
        }else {
            System.out.println("Please enter a positive amount to withdraw " + this.ownerName);
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History: " + this.transactionHistory);
    }
}