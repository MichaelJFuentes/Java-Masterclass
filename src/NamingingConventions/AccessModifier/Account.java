package NamingingConventions.AccessModifier;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public double balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Amaount deposited");
        } else {
            System.out.println("Cannot deposit negative amounts");
        }
    }

    public void withdraw(int amount) {
        if (amount < 0 && amount < this.balance) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Witdraw occured");
        } else {
            System.out.println("Cannot withdraw negative balance");
        }
    }

    public void claculateBalance() {
        int balance = 0;
        for (int i = 0; i < this.transactions.size(); i++) {
            balance += this.transactions.get(i);
        }
        System.out.println("Balance calculated " + balance  );
    }
}
