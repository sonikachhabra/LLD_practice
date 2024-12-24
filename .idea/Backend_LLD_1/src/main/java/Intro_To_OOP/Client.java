package main.java.Intro_To_OOP;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setBalance(500.0);
        bankAccount1.setOwnerName("o1");

        bankAccount1.withdraw(10.0);
        bankAccount1.deposit(100.0);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setBalance(0.0);
        bankAccount2.setOwnerName("o2");

        bankAccount2.withdraw(10.0);
        bankAccount2.deposit(100.0);

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.setBalance(50.0);
        bankAccount3.setOwnerName("o3");

        bankAccount3.withdraw(100.0);
        bankAccount3.deposit(100.0);

        BankAccount bankAccount4 = new BankAccount();
        bankAccount4.setBalance(500.0);
        bankAccount4.setOwnerName("o4");

        bankAccount4.withdraw(-10.0);
        bankAccount4.deposit(-100.0);
    }
}
