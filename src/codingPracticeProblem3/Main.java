package codingPracticeProblem3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account firstAccount = new Account("Ramesh", "C0011", 10000);
        Account secondAccount = new Account("Suresh", "C0121", 15000);
        Account thirdAccount = new Account("Rajesh", "C0222", 20000);

        bank.addAccount(firstAccount);
        bank.addAccount(secondAccount);
        bank.addAccount(thirdAccount);

        ArrayList<Account> accounts = bank.getAccounts();
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into First Account:");
        bank.depositMoney(firstAccount, 1000);
        System.out.println(firstAccount.getAccountInfo());
        System.out.println("No transaction in the Second Account:");
        System.out.println(secondAccount.getAccountInfo());
        System.out.println("After withdrawing 5000 from Third Account:");
        bank.withdrawMoney(thirdAccount, 5000);
        System.out.println(thirdAccount.getAccountInfo());
    }
}
