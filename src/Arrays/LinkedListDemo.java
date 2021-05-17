package Arrays;

import FlowControl.SwitchBasics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();
        addInOrder(placesToVist, "Houston");
        addInOrder(placesToVist, "Fort Worth");
        addInOrder(placesToVist, "Austin");
        addInOrder(placesToVist, "New York");

        printList(placesToVist);


    }

    private static void printList(LinkedList<String> myLinkedList) {
        Iterator<String> i = myLinkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visting " + i.next());
        }
        System.out.println("All done");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String city) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(city);
            if (comparison == 0) {
                System.out.println(city  + " already included in list");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(city);
                return true;
            } else if (comparison < 0) {
                ;// move to next city
            }

        }

        stringListIterator.add(city);
        return true;
    }

    public static void vist(LinkedList cities) {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities on the list ");
            return;
        } else {
            System.out.println("Now visting " + listIterator.next());
        }
        while (!quit) {
            int action = keyboard.nextInt();
            keyboard.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday Over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visting " + listIterator.next() );
                    } else {
                        System.out.println("End of list reached");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("now visting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Actions to take");
        System.out.println("0 - to quite" +
                "1 - go to next city" +
                "2 - go to previous city" +
                "3 - menu options");
    }
}
