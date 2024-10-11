package com.methods.java;

public class BankAccount {

    // instance variables

    String accountNumber;
    String accountHolderName;
    double balnce;

    //methods

    public double deposit(double amount) {
        double depositMoney;
        return depositMoney = balnce + amount;
    }
    public double withDraw(double amount){
        double withDrawMoney;
        return  withDrawMoney = balnce-amount;


    }
    public void diplayInfo(){
        System.out.println("account number:"+accountNumber);
        System.out.println("account holder name:"+accountHolderName);
        System.out.println("balance:"+balnce);
    }

    public static void main(String[] args) {

        BankAccount bankAccount;
        bankAccount = new BankAccount();
        bankAccount.accountNumber ="2000514783f";
        bankAccount.accountHolderName="boddupallivasu";
        bankAccount.balnce=150000.34;
        System.out.println("the total amount:"+bankAccount.deposit(25000));
        System.out.println("after withdraw:"+bankAccount.withDraw(15000));
        bankAccount.diplayInfo();

    }
}
