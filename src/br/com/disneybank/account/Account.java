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

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        if (accountType == 'p' || accountType == 'P') {
            return "Poupança";
        } else if (accountType == 'c' || accountType == 'C') {
            return "Corrente";
        } else if (accountType == 's' || accountType == 'S'){
            return "Salário";
        }
        else {
            return null;
        }
    }

    public void withdraw(double value) {
        if (value > 0 && balance >= value) {
            balance -= value;
        } else {
            System.out.println("Saque falhou. Verifique o valor do saque e o saldo da conta.");
        }
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        } else {
            System.out.println("Depósito falhou. Verifique o valor do depósito.");
        }
    }

    @Override
    public String toString() {
        return "O número da conta é: " + accountNumber + "\nO tipo da conta é: " + getAccountType() +
                "\nO valor disponível é: " + balance + "\nSeu cheque especial é: " + overdraft + "\n";
    }
}
