package main.java.Intro_To_OOP;

class BankAccount {
    double balance;
    String ownerName;

    void deposit(double amountToDeposit) {
        if(amountToDeposit > 0.0) {
            this.balance += amountToDeposit;
            System.out.println("Deposited " + amountToDeposit + " to " + ownerName);
        }else {
            System.out.println("Please enter a positive amount to deposit for " + this.ownerName);
        }
    }

    void withdraw(double amountToWithdraw) {
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