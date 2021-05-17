package Collections;

import java.awt.*;
import java.util.*;

public class Review {
    public static LinkedList<Integer> integers = new LinkedList<>();
    public static void main(String[] args) {
        linkeListStuff();
        printCollection(integers);
        System.out.println();
        queueBasics();
    }

    public static void linkeListStuff() {
        // add element to list
        integers.add(0);
        integers.add(2);
        integers.add(1);
        Collections.sort(integers);
    }

    // print a collection
    public static void printCollection(Collection<Integer> collection) {
        Iterator<Integer> integerIterator = collection.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }

    public static void queueBasics() {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(5);
        myQueue.add(4);
        priorityQueue(myQueue);

    }

    public static void printQueue(PriorityQueue<Integer> queue) {
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void priorityQueue(PriorityQueue<Integer> priorityQueue) {
        while (priorityQueue.size() > 0) {
            System.out.printf("%d ", priorityQueue.peek());
            priorityQueue.poll();
        }
    }
}
