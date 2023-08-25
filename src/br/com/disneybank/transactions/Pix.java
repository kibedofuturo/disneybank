package br.com.disneybank.transactions;

import br.com.disneybank.clients.Client;

import java.time.LocalDateTime;

public class Pix implements Transaction{
    private String specialKey;
    private double value;
    private LocalDateTime date;
    private Client client;

    @Override
    public void performTransaction() {

    }
}
