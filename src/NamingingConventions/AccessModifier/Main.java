package NamingingConventions.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Account mikes = new Account("Mikes Account");
        mikes.deposit(100);
        mikes.deposit(200);
        mikes.deposit(50);
        mikes.claculateBalance();
        mikes.withdraw(-50);
        mikes.claculateBalance();
        System.out.println(mikes.getBalance());
        System.out.println(mikes.transactions);
    }
}
