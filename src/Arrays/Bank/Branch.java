package Arrays.Bank;

import OOP.VipCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    public static Scanner keyboard = new Scanner(System.in);
    private ArrayList<Customer> customers;
    private String name;

    public Branch(ArrayList<Customer> customers, String name) {
        this.customers = customers;
        this.name = name;
    }
    public Branch(String name) {
        this(new ArrayList<Customer>(), name);
    }

    public String getName() {
        return this.name;
    }


    // add new customer
    public void addNewCustomer(String name, double initAmt) {
        this.addNewCustomer(new Customer(name, initAmt));
    }

    public void addNewCustomer(Customer customer) {
        this.customers.add(customer);
    }

    // add transaction for customer
    public void addTransactionForCustomer() {
        String name = getCustomerName();
        int index = getCustomerIndex(name);
        if (index < 0) {
            System.out.println("Customer does not exist");
        } else {
            double amt = getTransactionAmount();
            customers.get(index).performTransaction(amt);
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void printCustomers() {
        for (Customer c :
                this.customers) {
            System.out.println(c.getName());
        }
    }

    private String getCustomerName() {
        System.out.print("Enter user name: ");
        return keyboard.nextLine();
    }

    private double getTransactionAmount() {
        System.out.print("Enter transaction Amount: ");
        double amt = keyboard.nextDouble();
        keyboard.nextLine();
        return amt;
    }

    private int getCustomerIndex(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
