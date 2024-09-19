package com.deloitte.lab4.ex1;

public class Lab4Ex1 {
    public static void main(String[] args) {
        Person smith = new Person("Smith");
        Person kathy = new Person("Kathy");

        Account smithAccount = new SavingsAccount(smith, 2000);
        Account kathyAccount = new CurrentAccount(kathy, 3000, 1000);

        // Deposit and withdraw operations
        smithAccount.deposit(2000);
        smithAccount.withdraw(2000); 
        kathyAccount.withdraw(2000); 

        // Display updated balances
        smithAccount.displayBalance();
        kathyAccount.displayBalance();
    }
}
