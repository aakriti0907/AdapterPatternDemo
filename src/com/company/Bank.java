package com.company;

public interface Bank {
    int getAccountNumber();
    double getBalance();
    boolean pay(int accountNumber, double amount);

}
