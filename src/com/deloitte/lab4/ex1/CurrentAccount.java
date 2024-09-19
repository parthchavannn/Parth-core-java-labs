package com.deloitte.lab4.ex1;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person person, double initialBalance, double overdraftLimit) {
        super(person, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((getBalance() - amount) >= -overdraftLimit) {
            return super.withdraw(amount);
        }
        System.out.println("Withdrawal denied: Overdraft limit of INR " + overdraftLimit + " reached.");
        return false;
    }
}
