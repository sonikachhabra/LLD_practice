package main.java.Intro_To_OOP;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 500.0;
        bankAccount1.ownerName = "o1";
        System.out.println(bankAccount1.balance);

        bankAccount1.withdraw(10.0);
        bankAccount1.deposit(100.0);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.balance = 0.0;
        bankAccount2.ownerName = "o2";

        bankAccount2.withdraw(10.0);
        bankAccount2.deposit(100.0);


        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.balance = 50.0;
        bankAccount3.ownerName = "o3";

        bankAccount3.withdraw(100.0);
        bankAccount3.deposit(100.0);


        BankAccount bankAccount4 = new BankAccount();
        bankAccount4.balance = 500.0;
        bankAccount4.ownerName = "o4";

        bankAccount4.withdraw(-10.0);
        bankAccount4.deposit(-100.0);


    }
}
