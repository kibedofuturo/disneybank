package br.com.disneybank.account;

public class Account {
    private String accountNumber;
    private char accountType;
    private double balance;
    private double overdraft;

    public Account(String accountNumber, char accountType, double balance, double overdraft) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.overdraft = overdraft;
    }
}
