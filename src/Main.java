import br.com.disneybank.bank.Bank;
import br.com.disneybank.bank.Branch;
import br.com.disneybank.clients.Client;
import br.com.disneybank.clients.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /*
       Bank disneyBank = new Bank("DisneyBank");
       Employee employee = new Employee();

       employee.setName("João Santos");
       employee.setEmail("santosjv@unicap.com");
       employee.setRg("0123456");
       employee.setCpfCnpj("012345678910");
       employee.setPhoneNumber("40028922");
       employee.setPosition("gerente");
       employee.setSector("Contabilidade");

        System.out.println("nome do banco: " + disneyBank.getBankName());

        System.out.println("nome do cliente " + employee.getName() + ": " + employee.getName());
        System.out.println("Cpf do cliente " + employee.getName() + ": " + employee.getCpfCnpj());
        System.out.println("Identidade do cliente " + employee.getName() + ": " + employee.getRg());
        System.out.println("Número para contato do cliente " + employee.getName() + ": " + employee.getPhoneNumber() + "\n");

        System.out.println("O cliente " + employee.getName() + " trabalha no setor de " + employee.getSector().toLowerCase() +
                " e tem o cargo de " + employee.getPosition().toLowerCase() + "\n");
        */

        Bank bank = new Bank("DisneyBank");

        System.out.println("O nome do banco é: " + bank.getBankName());

        Branch disneyBranch = new Branch("DisneyBranch", "1234");

        bank.addBranch(disneyBranch);
        bank.getBranches();
    }
}