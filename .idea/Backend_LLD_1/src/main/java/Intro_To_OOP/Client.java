package main.java.Intro_To_OOP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(500.0, "o1");

        bankAccount1.withdraw(10.0);
        bankAccount1.deposit(100.0);
        bankAccount1.printTransactionHistory();

        BankAccount bankAccount2 = new BankAccount();

        bankAccount2.withdraw(10.0);
        bankAccount2.deposit(100.0);
        bankAccount2.printTransactionHistory();

        BankAccount bankAccount3 = new BankAccount(50.0, "o3");

        bankAccount3.withdraw(100.0);
        bankAccount3.deposit(100.0);
        bankAccount3.printTransactionHistory();

        BankAccount bankAccount4 = new BankAccount(500.0, "o4");

        bankAccount4.withdraw(-10.0);
        bankAccount4.deposit(-100.0);
        bankAccount4.printTransactionHistory();
    }
}
