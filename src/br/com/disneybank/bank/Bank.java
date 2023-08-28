package br.com.disneybank.bank;
import java.util.List;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private List<Branch> branches;

    public Bank(String bankName, List<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public String getBankName() {
        return bankName;
    }

    public void printBranches() {
        for (Branch branch : branches) {
            System.out.println(branch.toString());
        }
    }
}
