package Collections.TreeBasics;

public class NodeTest {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.insert(2);
        root.insert(1);
        root.insert(4);
        root.insert(8);
        root.insert(7);
        root.insert(10);
        root.insert(13);

        System.out.println(root.contains(12));
        //root.printInOrder();
    }
}
