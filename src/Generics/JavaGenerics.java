package Generics;

import java.util.ArrayList;

public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();          //specific type does not have to be declared
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("string"); // will lead to type error at run time, will compile fine

        printDouble(items);
    }

    public static void printDouble(ArrayList<Integer> n) {
        for (Integer integer : n) {
            System.out.println(integer * 2);         // need to cast to specific type
        }
    }

}
