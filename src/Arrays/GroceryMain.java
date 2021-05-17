package Arrays;

import java.util.Scanner;

public class GroceryMain {
    public static Scanner keyboard = new Scanner(System.in);
    private static ArrayListGroceryList myList = new ArrayListGroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list"  );
        System.out.println("\t 3 - to modify an item in the list ");
        System.out.println("\t 4 - to remove an item from the list ");
        System.out.println("\t 5 - to search for an item in the list ");
        System.out.println("\t 6 - to quit the application ");
    }

    public static void addItem() {
        System.out.print("Please enter item");
        myList.addGroceryItem(keyboard.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        String itemNo = keyboard.nextLine();
        keyboard.nextLine();
        System.out.print("Enter the new item: ");
        String newItem = keyboard.nextLine();
        //myList.modifyList(newItem,itemNo);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemNo = keyboard.nextLine();
        keyboard.nextLine();
        myList.removeItem(itemNo);
    }

    public static void searchItem() {
        System.out.print("Item to search for"   );
        String serachItem = keyboard.nextLine();
        if (myList.findItem(serachItem) != null) {
            System.out.println("Found item");
        } else {
            System.out.println("not found ");
        }
    }
}
