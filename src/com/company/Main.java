package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new YBankAdapter(123456, 10000.00);
//        XBank bank = new XBank(123,123);
        System.out.println("Account number is: " + bank.getAccountNumber());
        System.out.println("Account balance is: " + bank.getBalance());
        if(bank.pay(984835, 100)){
            System.out.println("Payment successfully completed!");
        }
        else{
            System.out.println("Payment failed! Please try again.");
        }
        System.out.println("Remaining account balance is: " + bank.getBalance());
    }
}
