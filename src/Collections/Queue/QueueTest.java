package Collections.Queue;

import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        Object[] ints = priorityQueue.toArray();



    }
}
