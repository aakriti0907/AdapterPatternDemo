package com.company;

public class XBank {
    private final int accountNo;
    private double balance;

    public XBank(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public double checkBalance(){
        return balance;
    }

    public boolean sendMoney(int accountNo, double amount){
        if(balance - amount >=0) {
            System.out.println("Sending "+amount+" to X Bank account "+accountNo+"...");
            balance = balance - amount;
            return true;
        }
        return false;
    }
}
