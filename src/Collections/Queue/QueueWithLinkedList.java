package Collections.Queue;

import java.util.*;

public class QueueWithLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("Adding items to end of linked list");
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("How");
        linkedList.add("Things");
        linkedList.add("Going");
        printList(linkedList);

        System.out.println("Adding an element to index 2");
        linkedList.add(2, "I'm inserted into index 2" );
        printList(linkedList);

        System.out.println("Adding a collection to end of list");
        ArrayList<String> addList = new ArrayList<>();
        addList.add("Second");
        addList.add("Items");
        addList.add("Via" );
        addList.add("List");
        linkedList.addAll(addList   );
        printList(linkedList);

        System.out.println("Adding a HashSet");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hashSet Item One");
        hashSet.add("hashSet Item Two");
        hashSet.add("hashSet Item Three");
        linkedList.addAll(hashSet);
        printList(linkedList);

        System.out.println("Adding dequeue items");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("added first");
        arrayDeque.add("added second");
        arrayDeque.addFirst("added third in first position ");
        linkedList.addAll(arrayDeque);
        printList(linkedList);

        System.out.println("Added item at begging of list");
        linkedList.addFirst("Look at me");
        printList(linkedList);

        System.out.println("Peaking at first item");
        System.out.println(linkedList.peek());

        System.out.println("Looking at last item");
        System.out.println(linkedList.peekLast());

        System.out.println("look and remove first item from list");
        System.out.println(linkedList.poll());
        printList(linkedList);

        System.out.println("Removing last item in deque");
        System.out.println(linkedList.pollLast());
        printList(linkedList);

        System.out.println("Pop an element from list");
        System.out.println(linkedList.pop());
        printList(linkedList);

        System.out.println("remove a specific element from list");
        System.out.println(linkedList.remove(1));
        printList(linkedList);

        System.out.println("get a array from current deque");
//        String[] arrayFromDeque = new String[linkedList.size()];
//        linkedList.toArray(arrayFromDeque);
        Object[] arrayFromDeque = linkedList.toArray();
        String[] stringArray = Arrays.copyOf(arrayFromDeque, arrayFromDeque.length, String[].class);
        System.out.println("Unsorted");
        printArray(stringArray);

        // create a sorted copy of linked list deep copy
        LinkedList<String> copy = new LinkedList<>();
        copy.addAll(linkedList);
        Collections.copy(linkedList, copy);
        // print the copy before sorting
        System.out.println("Before sorting copy");
        printList(copy);
        // sort the copy
        copy.sort(String.CASE_INSENSITIVE_ORDER);
        // print the value after sorting
        System.out.println("After sorting copy");
        printList(copy);

        // does changing one list item affect the other
        copy.poll();
        System.out.println("OG");
        printList(linkedList);
        System.out.println("Copy");
        printList(copy);
        // does not affect the outcome

//        System.out.println("convert all letters to lower case");
//        convertToLowerCase(stringArray);
        // sort without using case sensitive ordering
        // affects the og order of list
//        Collections.sort(linkedList, String.CASE_INSENSITIVE_ORDER);
//        System.out.println("Sorted linked list in place");
        // convert to string
//        Object[] linkedListArray = linkedList.toArray();
//        // convert to string array
//        String[] stringsLinkedListArray = Arrays.copyOf(linkedListArray, linkedListArray.length,  String[].class);
//        String output = Arrays.toString(stringsLinkedListArray);
//        System.out.println(output);

        // checking to see if order of orginal list is compromised
        System.out.println("Orignal linked list after order");
        printList(linkedList);
//        System.out.println("sorted");
//        Arrays.sort(stringArray);
//        printArray(stringArray);

    }

    public static void printList(LinkedList<String> list) {
        System.out.printf("Size: %d%n", list.size());
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        try {
            for (String element : array) {
                System.out.println(element);
            }
        } catch (NullPointerException e ) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }
    }

    public static void convertToLowerCase(String[] array ){
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i].charAt(0))) {
                array[i] = array[i].toLowerCase();
            }
        }
    }

}
