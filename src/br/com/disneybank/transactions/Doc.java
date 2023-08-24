package br.com.disneybank.transactions;

import br.com.disneybank.account.Account;
import br.com.disneybank.bank.Branch;

import java.time.LocalDateTime;

public class Doc implements Transaction {

    private boolean docType;
    private double value;
    private Account account;
    private Branch branch;
    private LocalDateTime date;

}
