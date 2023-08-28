package br.com.disneybank.clients;

import br.com.disneybank.account.Account;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String cpfCnpj;
    private String rg;
    private String email;
    private String phoneNumber;
    private List<Account> accounts;

    public Client(String name, String cpfCnpj, String rg, String email, String phoneNumber) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.rg = rg;
        this.email = email;
        this.phoneNumber = phoneNumber;
        accounts = new ArrayList<>();
    }

    public Account getClientAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println("O dono da conta é: " + name + "\n" + account);
        }
    }

    public void performTransaction(String senderAccountNumber, Client receiver, String receiverAccountNumber, double value) {
        Account senderAccount = getClientAccount(senderAccountNumber);
        Account receiverAccount = receiver.getClientAccount(receiverAccountNumber);

        if (senderAccount != null && receiverAccount != null && senderAccount.getBalance() >= value) {
            senderAccount.withdraw(value);
            receiverAccount.deposit(value);
            System.out.println("Transação realizada com sucesso.");
            System.out.println("Novo saldo: " + senderAccount.getBalance() + "\n");
        } else {
            System.out.println("Transação falhou. Verifique os detalhes da transação e os saldos das contas.\n");
        }
    }
}
