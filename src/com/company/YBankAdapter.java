package com.company;

public class YBankAdapter implements Bank{
    YBank yBank;

    public YBankAdapter(int accountNumber, double amount){
        yBank = new YBank(accountNumber, (float) amount);
    }
    @Override
    public int getAccountNumber() {
        return yBank.fetchAccountNumber();
    }

    @Override
    public double getBalance() {
        return yBank.fetchAccountBalance();
    }

    @Override
    public boolean pay(int accountNumber, double amount) {
        return yBank.transferMoney(accountNumber, (float) amount);
    }

}

