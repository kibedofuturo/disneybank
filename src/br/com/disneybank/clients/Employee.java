package br.com.disneybank.clients;

import br.com.disneybank.account.Account;

public class Employee extends Client{
    private String sector;
    private String position;

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
