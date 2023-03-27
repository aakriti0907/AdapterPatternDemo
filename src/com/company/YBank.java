package com.company;

public class YBank {
    private final int accountNo;
    private float accountBalance;

    public YBank(int accountNo, float accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public int fetchAccountNumber(){
        return accountNo;
    }

    public float fetchAccountBalance(){
        return accountBalance;
    }
    public boolean transferMoney(int accountNo, float amount){
        if(accountBalance - amount >=0){
            System.out.println("Processing transaction of Rupees "+amount+" to Y bank account "+accountNo+"...");
            accountBalance = accountBalance - amount;
            return true;
        }
        return false;
    }
}

