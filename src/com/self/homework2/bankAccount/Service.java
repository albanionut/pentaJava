package com.self.homework2.bankAccount;

public class Service {
    public Service() {
    }

    public static void withdraw(double amount, BankAccount auxAccount) {
        System.out.println("Name: " + auxAccount.getName());
        System.out.println("Balance: " + auxAccount.getBalance());

        if (amount > auxAccount.getBalance()) {
            System.out.println("The amount you want to withdraw is bigger then your current balance: " + auxAccount.getBalance());
        } else {
            auxAccount.setBalance(auxAccount.getBalance() - amount);
            System.out.println("The withdraw is complete, your current balance is " + auxAccount.getBalance());
        }
        System.out.println();
    }

    public static void deposit(double amount, BankAccount auxAccount) {
        System.out.println("Name: " + auxAccount.getName());
        System.out.println("Balance: " + auxAccount.getBalance());

        auxAccount.setBalance(amount + auxAccount.getBalance());
        System.out.println("Deposit complete ,your current balance is " + auxAccount.getBalance());
        System.out.println();
    }
}
