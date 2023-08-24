import br.com.disneybank.account.Account;
import br.com.disneybank.bank.Bank;
import br.com.disneybank.bank.Branch;
import br.com.disneybank.clients.Client;
import br.com.disneybank.clients.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("DisneyBank");

        System.out.println("O nome do banco é: " + bank.getBankName());

        Branch disneyBranch = new Branch("DisneyBranch", "1234");
        Branch daviBranch = new Branch("Davi", "6969");

        bank.addBranch(disneyBranch);
        bank.addBranch(daviBranch);

        Client davi = new Client();
        Employee santos = new Employee();

        Account daviAccount = new Account("1111",'c',0.0,300);
        Account santosAccount = new Account("2222", 'p', 0.0, 300);

        davi.setName("Davi");
        davi.setRg("daviRg");
        davi.setCpfCnpj("daviCpf");
        davi.setPhoneNumber("daviNumero");
        davi.setEmail("davi@unicap.br");

        santos.setName("Santos");
        santos.setRg("santosRg");
        santos.setCpfCnpj("santosCpf");]
        santos.setPhoneNumber("santosNumero");
        santos.setEmail("santos@unicap.br");
        santos.setSector("Contabilidade");
        santos.setPosition("Gerente");

        bank.printBranches();
    }
}