package br.com.disneybank.clients;

import br.com.disneybank.account.Account;

public class Employee extends Client{
    private String sector;
    private String position;

    public Employee(String name, String cpfCnpj, String rg, String email, String phoneNumber, String sector, String position) {
        super(name, cpfCnpj, rg, email, phoneNumber);
        this.sector = sector;
        this.position = position;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
