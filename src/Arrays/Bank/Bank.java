package Arrays.Bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
    }
    // method to add branch
    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    // get branch list
    public ArrayList<Branch> getBranch() {
        return this.branches;
    }
    // add customer to branch
    public void addCustomerToBranch(Branch branch, Customer customer) {
        this.branches.get(getBranchIndex(branch.getName())).addNewCustomer(customer);
    }
    // add transaction to branch

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

//    public void printBranchCustomers(String branchName) {
//        this.branches.get(getBranchIndex(branchName)).printCustomers();
//    }

    public void printBranchCustomers(String branchName, boolean printTransactions) {
        int branchId = checkIfVaildBranch(branchName);
        if ( branchId >= 0) {
            ArrayList<Customer> branchCustomers = this.branches.get(branchId).getCustomers();
            System.out.println("Customers");
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println(branchCustomers.get(i).getName());
                if (printTransactions) {
                    ArrayList<Double> customerTransactions = branchCustomers.get(i).getCustomerTrans();
                    for (int j = 0; j < customerTransactions.size(); j++) {
                        System.out.println(customerTransactions.get(i).doubleValue());
                    }
                }
            }
        }
    }



    private int checkIfVaildBranch(String branch) {
        if (branch != null) {
            for (int i = 0; i < this.branches.size(); i++) {
                Branch temp = this.branches.get(i);
                if (temp.getName().equals(branch)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int getBranchIndex(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
