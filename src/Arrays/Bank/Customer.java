package Arrays.Bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> customerTrans;

    public Customer(String name, double initalAmount) {
        this.name = name;
        this.customerTrans = new ArrayList();
        this.customerTrans.add(initalAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getCustomerTrans() {
        return customerTrans;
    }

    public void performTransaction(double amount) {
        this.customerTrans.add(amount);
    }

    public double getBalance() {
        double total = 0;
        for (Double customerTran : this.customerTrans) {
            total += customerTran;
        }
        return total;
    }
}
