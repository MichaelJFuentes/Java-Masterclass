package Arrays.Challenge;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static Phone phone = new Phone();
    public static void main(String[] args) {
        boolean flag = true;
        printActions();
        while (flag) {
            int userInput = getUserInput();
            switch (userInput) {
                case 0:
                    printContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    isContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    printActions();
                    break;
                case 6:
                    flag = false;
                    break;
                case 7:
                    queryContacts();
                    break;
            }
        }
    }


    // print method
    public static void printContacts() {
        phone.printContacts();
    }
    // add contact
    public static void addContact() {
        String name = nameUserInput();
        int number = numberUserInput();
        if (phone.addContact(name, number)) {
            System.out.println("Successfully added");
        } else {
            System.out.println("Error adding contact");
        }

    }
    // remove contact
    public static void removeContact() {
        if (phone.removeContact(nameUserInput())) {
            System.out.println("Contact removed");
        } else {
            System.out.println("Error removing contact");
        }
    }
    // modify contact
    public static void modifyContact() {
        String oldName = nameUserInput();
        if(phone.isContact(oldName)) {
            System.out.println("Enter new name: ");
            String newName = keyboard.nextLine();
            System.out.println("Enter new phone number: ");
            int newPhone = keyboard.nextInt();
            keyboard.nextLine();
            phone.modifyContact(oldName, Contact.createContact(newName, newPhone));
            System.out.println("Contact successfully modified ");
        } else {
            System.out.println("Error modifying contact");
        }
    }
    // if contact
    public static void isContact() {
        if (phone.isContact(nameUserInput())) {
            System.out.println("Name found in contacts");
        } else {
            System.out.println("Name not found in contacts");
        }
    }
    // print available actions
    public static void printActions() {
        System.out.println("0 - List Contacts\n" +
                "1- Add contact\n" +
                "2 - Remove contact\n" +
                "3 - Is contact\n" +
                "4- modify contact\n" +
                "5 - print options\n" +
                "6 - quit\n" +
                "7 - query contacts");
    }

    public static int getUserInput() {
        System.out.print("Enter your choice: ");
        int userInput = keyboard.nextInt();
        keyboard.nextLine();
        return userInput;
    }

    public static String nameUserInput() {
        System.out.print("Enter name: ");
        return keyboard.nextLine();
    }

    public static int numberUserInput() {
        System.out.print("Enter phone number: ");
        int phone = keyboard.nextInt();
        keyboard.nextLine();
        return phone;
    }

    public static boolean queryContacts() {
        String name = nameUserInput();
        if (phone.queryContacts(name) == -1) {
            System.out.println("Contact not found");
            return false;
        }
        System.out.println("Name: " + name + " --> Phone: " + phone.queryContacts(name));
        return true;
    }
}
