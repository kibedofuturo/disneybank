package br.com.disneybank.transactions;

import br.com.disneybank.account.Account;
import br.com.disneybank.bank.Branch;

import java.time.LocalDateTime;

public class Ted implements Transaction{
    private Account account;
    private Branch branch;
    private boolean tedType;
    private double value;
    private LocalDateTime date;
}
