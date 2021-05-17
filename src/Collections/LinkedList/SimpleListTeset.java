package Collections.LinkedList;

import java.util.ArrayList;

public class SimpleListTeset {
    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(5);
        simpleList.addInOrder(4);
        simpleList.addInOrder(20);
        simpleList.addInOrder(15);
        simpleList.addInOrder(-12);

        simpleList.print();

        System.out.println(simpleList.remove(3));
        simpleList.print();

        System.out.println();
        simpleList.printBackWords();

        System.out.println();
        ArrayList<Integer> arrayList = simpleList.integerArrayList();
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        System.out.println();

        //simpleList.print();
        System.out.println();
        simpleList.print();
        System.out.println(simpleList.contains(6));
        //Node returnNode = simpleList.getNode(21);
        //System.out.println(returnNode.getValue());

        System.out.println();

        simpleList.backWordsPrint();
    }
}
