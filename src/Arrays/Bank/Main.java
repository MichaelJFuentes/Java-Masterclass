package Arrays.Bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customerZeroBranchZero = new Customer("Mike", 2300);
        customerZeroBranchZero.performTransaction(700);
        ArrayList<Double> customerZeroBranchZeroTrans = customerZeroBranchZero.getCustomerTrans();
        for (double i :
                customerZeroBranchZeroTrans) {
            System.out.println(i);
        }
        System.out.println(customerZeroBranchZero.getBalance());

        // testing branch details
        Branch branchZero = new Branch("chase");
        branchZero.addNewCustomer(customerZeroBranchZero);
        branchZero.printCustomers();
        branchZero.addNewCustomer("ed",1000);
        branchZero.addTransactionForCustomer();
        System.out.println(customerZeroBranchZero.getBalance());
        branchZero.printCustomers();

    }
}
