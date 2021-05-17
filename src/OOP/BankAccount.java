package OOP;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(1,0.0, "default name", "default email", -1);
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        setAccountNumber(accountNumber);
        setBalance(balance);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            return;
        } else {
            balance += amount;
        }
    }

    public void withDraw (int amount) {
        if (amount > balance) {
            System.out.println("Lack of funds");
        } else {
            balance -= amount;
        }
        System.out.println("New balance = " + balance);
    }
}
