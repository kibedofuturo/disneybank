package br.com.disneybank.clients;

import br.com.disneybank.account.Account;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String cpfCnpj;
    private String rg;
    private String email;
    private  String phoneNumber;
    private List<Account> accounts;

    public Client() {
        accounts = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println("O dono da conta é: " + name + "\n" + account.toString());
        }
    }
}
