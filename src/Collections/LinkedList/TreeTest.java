package Collections.LinkedList;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree(5);
        tree.add(3);
        tree.add(1);
        tree.add(4);
        tree.add(10);
        tree.add(7);

        tree.add(13);
        tree.add(6);
        tree.add(8);
        //tree.add(-190);

        tree.print();

        System.out.println();
        //tree.printLeftNodes();
        System.out.println();

        tree.printUnderRoot();
        System.out.println();
        System.out.println(tree.getSmallest());
        System.out.println(tree.getLargest());
        System.out.println();
        //tree.getAllLeftNodeValues(tree.getRoot());
        tree.printLeafs(tree.getRoot());
        System.out.println();
        tree.printNodesWithBothChildren(tree.getRoot());
        System.out.println();
        tree.printLeftNodes(tree.getRoot());
        System.out.println();
        tree.printRightView(tree.getRoot());
    }
}
