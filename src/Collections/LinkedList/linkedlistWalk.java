package Collections.LinkedList;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistWalk {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            integers.add(random.nextInt(100));
        }
        Iterator<Integer> iterator = integers.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();
        Iterator<Integer> iterator1 = integers.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + ",");
        }
        System.out.println();
    }
}
