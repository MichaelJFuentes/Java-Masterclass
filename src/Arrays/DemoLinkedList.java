package Arrays;

import java.util.*;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();
//        placesToVist.add("Houston");
//        placesToVist.add("Fort worth");
//        placesToVist.add("Dallas");
//        placesToVist.add("Austin");


        printPlacesToVist(placesToVist);
//
//        placesToVist.add(1,"College Station");
//        printPlacesToVist(placesToVist);
//
//        placesToVist.remove(1);
//        printPlacesToVist(placesToVist);
        ArrayList<String> placesToAdd = new ArrayList<String>();
        placesToAdd.add("Los Angles");
        placesToAdd.add("New York");
        placesToAdd.add("London");
        placesToAdd.add("Huntsville");
        placesToAdd.add("LivingStone");

        for (int i = 0; i < placesToAdd.size(); i++) {
            addInOrder(placesToVist, placesToAdd.get(i).toString());
        }

        printPlacesToVist(placesToVist);
        vist(placesToVist);

    }

    public static void printPlacesToVist(LinkedList<String> linkedList) {
        // what is a itorator goes thur all items
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("++++++++++++++++++++++++++++++");
    }

    // add things in order
    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int returnValue = listIterator.next().compareTo(newCity);
            if (returnValue == 0) {
                System.out.println("City is already in the list" );
                return false;
            } else if (returnValue > 0) {

                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if (returnValue < 0) {

            }
        }
        listIterator.add(newCity);
        return true;
    }

    private static void vist(LinkedList cites) {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cites.listIterator();

        if (cites.isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = keyboard.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of list reached");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("At the start of list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                case 4:
                    quit = true;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - next\n" +
                "2 - previous\n" +
                "3 - print menu\n" +
                "4 - quit");
    }
}
