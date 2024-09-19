package com.deloitte.lab4.ex1;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    private static AtomicInteger accNumGenerator = new AtomicInteger(1000);
    private int accNum;
    private double balance;
    private Person person;

    public Account(Person person, double initialBalance) {
        this.accNum = accNumGenerator.getAndIncrement();
        this.balance = initialBalance;
        this.person = person;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayBalance() {
        System.out.println(person.getName() + "'s account balance: INR " + balance);
    }
}
