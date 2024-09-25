package com.deloitte.lab04.ex01;

import java.util.Scanner;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }
}

class Account {
    private static long nextAccNum = 1000;
    private long accNum;
    protected double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = nextAccNum++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Minimum balance of INR 500 must be maintained.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public Person getAccHolder() {
        return accHolder;
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Savings Account requires a minimum balance of INR 500.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
        super(accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Overdraft limit reached.");
        }
    }
}

public class Lab4Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person smith = new Person("Smith", 30);
        Account smithAcc = new SavingsAccount(smith, 2000);
        
        Person kathy = new Person("Kathy", 28);
        Account kathyAcc = new CurrentAccount(kathy, 3000, 1000);
        
        smithAcc.deposit(2000);
        
        kathyAcc.withdraw(2000);

        System.out.println("Smith's Account Balance: " + smithAcc.getBalance());
        System.out.println("Kathy's Account Balance: " + kathyAcc.getBalance());

        scanner.close();
    }
}
