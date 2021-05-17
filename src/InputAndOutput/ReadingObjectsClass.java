package InputAndOutput;

public class ReadingObjectsClass {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public ReadingObjectsClass(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "ReadingObjectsClass{" +
                "accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String writeToFile() {
        String str = this.accountNumber + " " + this.firstName + " " +
                this.lastName + " " + this.balance;
        return str;
    }
}
