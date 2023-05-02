package codingPracticeProblem3;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void depositMoney(Account account, int amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, int amount) {
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
