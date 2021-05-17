package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTheory {
    public static void main(String[] args) {
        String[] setArrayOne = {"Just", "a", "standard", "set", "one"};
        Set<String> setOne = new HashSet<>(Arrays.asList(setArrayOne));
        String[] setArrayTwo = {"Just", "one", "more", "set", "to", "consider"};
        Set<String> setTwo = new HashSet<>(Arrays.asList(setArrayTwo));
        // calculate the union of the sets
        Set<String> union = new HashSet<>(setOne);
        union.addAll(setTwo);
        printSet(union);

        // calculate the intersection of the sets
        Set<String> intersection = new HashSet<>(setOne);
        intersection.retainAll(setTwo);
        printSet(intersection);
        // calculate the relative of set one take set two
        Set<String> relativeOfOne = new HashSet<>(setOne);
        relativeOfOne.removeAll(setTwo);
        printSet(relativeOfOne);
        // calculate the relative of set two take set one
        Set<String> relativeTwo = new HashSet<>(setTwo);
        relativeTwo.removeAll(setOne);
        printSet(relativeTwo);

    }

    public static void printSet(Set<String> set) {
        for (String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
