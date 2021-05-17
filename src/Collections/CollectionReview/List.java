package Collections.CollectionReview;
import java.util.*;
public class List {
    public static void main(String[] args) {
        // create a empty list
        ArrayList<String> myArrayList = new ArrayList<>();
        // add values to list
        myArrayList.add("Hello");
        myArrayList.add("world");
        myArrayList.add("My");
        myArrayList.add("Name");
        myArrayList.add("is"    );
        myArrayList.add("Michael");
        myArrayList.add("Remove me");
        // remove values from list
        myArrayList.remove("Remove me");
        // print list values
        for (String item :
                myArrayList) {
            System.out.println(item);
        }

        // get the index of name
        int name = myArrayList.indexOf("Michael");
        // print using index
        System.out.println(myArrayList.get(name));

        System.out.println("+++++++++++++++++++++++++++++++++++");
        LinkedList<Integer> linkedListInts = new LinkedList<>();
        // add value to linked list
        linkedListInts.add(1);
        linkedListInts.add(2);
        linkedListInts.add(3);
        linkedListInts.add(4);
        linkedListInts.remove(2);
        Iterator<Integer> integerIterator = linkedListInts.listIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        //System.out.println(linkedListInts.get(2));
        int first = linkedListInts.getFirst();

        System.out.println(first);
        System.out.println(linkedListInts.get(first));

        // map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "My");
        map.put(4, "Is");
        map.put(5, "michael");

        Set<Integer> keys = map.keySet();
        for (Integer key :
                keys) {
            System.out.println(key + map.get(key));
        }
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        System.out.println("Key: " + entry);

        System.out.println(map);
    }
}
