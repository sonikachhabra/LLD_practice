package main.java.Intro_To_OOP;

class BankAccount {
    private double balance;
    private String ownerName;

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
            System.out.println("Deposited " + amountToDeposit + " to " + ownerName);
        }else {
            System.out.println("Please enter a positive amount to deposit for " + this.ownerName);
        }
    }

    public void withdraw(double amountToWithdraw) {
        if(amountToWithdraw > 0.0) {
            if(amountToWithdraw <= this.balance) {
                this.balance -= amountToWithdraw;
                System.out.println("Withdrawn " + amountToWithdraw + " to " + ownerName);
            }else {
                System.out.println("Insufficient balance " + this.ownerName);
            }
        }else {
            System.out.println("Please enter a positive amount to withdraw " + this.ownerName);
        }
    }
}