package br.com.disneybank.bank;

public class Branch {
    private String branchName;
    private String branchNumber;

    public Branch(String branchName, String branchNumber) {
        this.branchName = branchName;
        if (branchNumber.length() != 4) {
            throw new IllegalArgumentException("Branch number must have exactly 4 characters.");
        }
        this.branchNumber = branchNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchNumber() {
        return branchNumber;
    }
}
