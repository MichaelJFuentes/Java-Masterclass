package Collections.BuildInTree;

import com.sun.source.tree.BinaryTree;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        TreeMap<Integer, String> myTree = new TreeMap<>();
        myTree.put(0, "Zero index");
        myTree.put(1, "One index");
        myTree.put(2, "Two index");
        myTree.put(3, "Three index");
        myTree.put(-12, "negative 12");
        System.out.println("ceil value");
        Map.Entry<Integer, String> mapEntry = myTree.ceilingEntry(-1);
        System.out.printf("%d %s%n", mapEntry.getKey(), mapEntry.getValue());
        System.out.println("ceil key");

        System.out.println("First item in tree");
        System.out.println(myTree.firstKey());

        System.out.println("Last item in tree");
        System.out.println(myTree.lastKey());

        System.out.println("print all values in list key value pairs ");
        printTreeMap(myTree);
        System.out.println();


        System.out.println("______________________________________");
        String sentence = "Just some words in no order with repeating words testing the order of trees and in no";
        String[] sentenceSplit = sentence.split(" ");

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(sentenceSplit));

        System.out.println(treeSet);
        System.out.println("Using hash set index key and value of word");
        System.out.println("__________________________");



    }

    // print the values in tree in order lowest to highest
    public static void printTreeMap(TreeMap<Integer, String> treeMap) {
        if (treeMap == null) {
            return;
        }
        for (Map.Entry<Integer, String> entry : treeMap.entrySet())  {
            System.out.printf("%d %s%n", entry.getKey(), entry.getValue());
        }
    }
}
