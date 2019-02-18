package com.self.homework2.bankAccount;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        BankAccount client = new BankAccount("Alban Ionut", 300);
        service.withdraw(200, client);
        service.deposit(600, client);

    }
}
