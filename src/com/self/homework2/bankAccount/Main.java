package com.self.homework2.bankAccount;

public class Main {
    /*
    Create a console application from the following requirements:
    A bank account from where someone has the option to withdraw and deposit money
    Write information to the console each time someone makes an operation on that account
    Take into consideration any validations that have to be done since this is a debit account,
    so user can’t withdraw more than he has into account. Display this information to inform the user about why the
    operation failed.
     */
    public static void main(String[] args) {
        Service service = new Service();
        BankAccount client = new BankAccount("Alban Ionut", 300);
        service.withdraw(200, client);
        service.deposit(600, client);

    }
}
