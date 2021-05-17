package Collections.Set;

import java.util.*;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are squares " + squares.size() + " There are cubes " + cubes.size());

        // get the union of two sets
        Set<Integer> union = new HashSet<>();
        union.addAll(squares);
        union.addAll(cubes);

        System.out.println("Union size " + union.size());

        // get the intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);

        System.out.println("Intersection size: " + intersection.size());

        for (int i :
                intersection) {
            System.out.println(i + " : " + Math.sqrt(i) + " : " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "One day in the year of the fox";
        String[] wordsArray = sentence.split(" " );
        words.addAll(Arrays.asList(wordsArray));
        for(String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> devine = new HashSet<>();

        String[] natureWords = {"All", "nature", "is", "but", "art", "unknown", "to", "that"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        devine.addAll(Arrays.asList(divineWords));

        System.out.println("What is the result of nature take devin ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(devine);
        printSet(diff1);

        System.out.println("Divine - nature: ");
        Set<String> diff2 = new HashSet<>(devine);
        diff2.removeAll(nature);
        printSet(diff2);


        // how to get the symetric diff

        Set<String> u = new HashSet<>(nature);
        u.addAll(devine);
        Set<String> inter = new HashSet<>(nature);
        inter.retainAll(devine);
        System.out.println("Symmetric difference");
        u.removeAll(inter);
        printSet(u);

// contains all is one set a super set of another
        if (nature.containsAll(devine)) {
            System.out.println("Divine is a subset of nature");
        }
        if (nature.containsAll(inter)) {
            System.out.println("Intersection is subset of nature");
        }
        if (devine.containsAll(inter)) {
            System.out.println("Intersection is a subset of divine");
        }

    }

    public static void printSet(Set<String> set) {
        System.out.println("\t");
        for (String s :
                set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


}
