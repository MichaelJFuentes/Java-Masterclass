package RandomThings.JavaTwo;

import java.util.*;

public class MapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        printMap(hashMap);

        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] ints = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            arrayList.add(ints[i]);
        }
        treeSet.addAll(arrayList);
        Iterator<Integer> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        traversTree(treeSet);

        simpleLoop(2);
        System.out.println(anagrams("anagram", "margana"));

    }

    public static void printMap(HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("%s %d%n", entry.getKey(), entry.getValue());
        }
    }

    public static void traversTree(TreeSet<Integer> tree) {
        while (!tree.isEmpty()) {
            System.out.println(tree.pollFirst());
            System.out.println(tree.pollLast());
            System.out.println();
        }
    }

    public static void simpleLoop(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d%n", n , i, n*i);
        }
    }

    public static boolean anagrams(String one, String two) {
//        one = one.toLowerCase();
//        two = two.toLowerCase();
        char[] oneChars = one.toLowerCase().toCharArray();
        char[] twoChars = two.toLowerCase().toCharArray();
        Arrays.sort(oneChars);
        Arrays.sort(twoChars);
        return Arrays.compare(oneChars, twoChars) == 0;
//        for (int i = 0; i < oneChars.length; i++) {
//            if (oneChars[i] != twoChars[i]) {
//                return false;
//            }
//        }
//        return true;
    }

}
