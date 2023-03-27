package com.company;

public class XBankAdapter implements Bank{
    XBank xBank;

    public XBankAdapter(int accountNumber, double amount){
        xBank = new XBank(accountNumber, amount);
    }
    @Override
    public int getAccountNumber() {
        return xBank.getAccountNo();
    }

    @Override
    public double getBalance() {
        return xBank.checkBalance();
    }

    @Override
    public boolean pay(int accountNumber, double amount) {
        return xBank.sendMoney(accountNumber, amount);
    }
}
