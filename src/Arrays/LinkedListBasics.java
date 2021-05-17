package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListBasics {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Customer customer = new Customer("Mike", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(intList.get(i));
//        }
//
//        intList.add(1,2);
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(intList.get(i));
//        }

        System.out.println();

        ListIterator<Integer> integerListIterator = intList.listIterator();
        System.out.println("1 - Previous" +
                "2 - next\n" +
                "3");
        boolean flag = true;
        while (flag) {
            System.out.print("Enter choice: ");
            int userInput = keyboard.nextInt();
            keyboard.next();
            switch (userInput) {
                case 1:
                    if (integerListIterator.hasPrevious()) {
                        System.out.println(integerListIterator.previous());
                    } else {
                        System.out.println("No previous item");
                    }
                    break;
                case 2:
                    if (integerListIterator.hasNext()) {
                        System.out.println(integerListIterator.next());
                    } else {
                        System.out.println("No next item");
                    }
                    break;
                case 3:
                    flag = false;
                default:
                    System.out.println("input not recognized");
            }

        }
        System.out.println("existing out of loop ");

//        LinkedList<Integer> basic = new LinkedList<Integer>();
//        basic.addAll(intList);
//        basic.add(1,34);
//        basic.remove(1  );
//        for (int i = 0; i < basic.size(); i++) {
//            System.out.println(basic.get(i));
//        }
    }
}
