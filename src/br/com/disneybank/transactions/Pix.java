package br.com.disneybank.transactions;

import java.time.LocalDateTime;

public class Pix implements Transaction{
    private String specialKey;
    private double value;
    private LocalDateTime date;
}
