import br.com.disneybank.account.Account;
import br.com.disneybank.bank.Bank;
import br.com.disneybank.bank.Branch;
import br.com.disneybank.clients.Client;
import br.com.disneybank.clients.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Branch disneyBranch = new Branch("DisneyBranch", "1234");
        Branch santosBranch = new Branch("SantosBranch", "6969");

        List<Branch> branches = new ArrayList<>();

        branches.add(disneyBranch);
        branches.add(santosBranch);

        Bank bank = new Bank("DisneyBank", branches);
        System.out.println("O nome do banco é: " + bank.getBankName() + "\n");

        Client davi = new Client("Davi", "daviCpf", "daviRg", "daviEmail", "daviTelefone");
        Employee santos = new Employee("Santos", "santosCpf", "santosRg", "santosEmail", "santosTelefone", "Contabilidade", "Gerente");

        Account daviAccount = new Account("1111",'c',200.0,300);
        Account santosAccount = new Account("2222", 'p', 5000.0, 300);
        Account santosSalaryAccount = new Account("3333", 's', 2500.0, 0.0);

        davi.addAccount(daviAccount);

        santos.addAccount(santosAccount);
        santos.addAccount(santosSalaryAccount);

        bank.printBranches();
        davi.printAccounts();
        santos.printAccounts();

        santos.performTransaction("3333", santos, "2222", 2500.0);

        santos.performTransaction("2222", davi, "1111", 2500.0);

        davi.printAccounts();
        santos.printAccounts();
    }
}