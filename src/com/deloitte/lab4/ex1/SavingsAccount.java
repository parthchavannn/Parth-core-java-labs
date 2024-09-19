package com.deloitte.lab4.ex1;

public class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(Person person, double initialBalance) {
        super(person, initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if ((getBalance() - amount) >= minimumBalance) {
            return super.withdraw(amount);
        }
        System.out.println("Withdrawal denied: Minimum balance of INR " + minimumBalance + " must be maintained.");
        return false;
    }
}
