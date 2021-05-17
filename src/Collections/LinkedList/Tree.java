package Collections.LinkedList;

public class Tree {
    private Node root;
    public int size;

    public Tree(Node root) {
        this.root = root;
    }

    public Tree(int number) {
        this(new Node(number));
    }

    public Node getRoot() {
        return this.root;
    }

    // add number to tree
    private void add(Node active, Node toAdd) {
        if (active.getValue() < toAdd.getValue()) {
            if (active.hasNext()) {
                this.add(active.getNext(), toAdd);
            } else {
                active.setNext(toAdd);
            }
        } else {
            if (active.hasPrevious()) {
                this.add(active.getPrevious(), toAdd);
            } else {
                active.setPrevious(toAdd);
            }
        }
    }

    public void add(int value) {
        this.add(this.root, new Node(value));
    }
    // print tree
    private void print(Node active) {
        if (active.hasPrevious()) {
            this.print(active.getPrevious());
        }
        System.out.println(active.getValue());
        if (active.hasNext()) {
            this.print(active.getNext());
        }
    }

    // public print without a param
    public void print() {
        this.print(this.root);
    }

    // print left nodes

    // private values under root
    public void printUnderRoot() {
        if (this.root.hasPrevious()) {
            this.print(this.root.getPrevious());
        } else {
            System.out.println("No values under root");
        }
    }
    // print values above root
    public void printOverRoot() {
        if (this.root.hasNext()) {
            this.print(this.root.getNext());
        } else {
            System.out.println("No values above root");
        }
    }

    // print smallest in tree
    public int getSmallest() {
        Node active = this.root;
        int smallest = this.root.getValue();
        while (active.hasPrevious()) {
            active = active.getPrevious();
        }
        smallest = active.getValue();
        return smallest;
    }
    // print largest in tree
    public int getLargest() {
        Node active = this.root;
        while (active.hasNext()) {
            active = active.getNext();
        }
        return active.getValue();
    }

    // get all left node values
    public void getAllLeftNodeValues(Node active) {
        if (active.hasPrevious()) {
            System.out.println(active.getValue());
            this.getAllLeftNodeValues(active.getPrevious());
        }
        if (active.hasNext()) {
            this.getAllLeftNodeValues(active.getNext());
        }
    }
    // needs improvement

    public void printLeafs(Node active) {
        if (active.hasPrevious()) {
            this.printLeafs(active.getPrevious());
        }
        if (active.hasNext()) {
            this.printLeafs(active.getNext());
        }
        if (active.getPrevious() == null && active.getNext() == null) {
            System.out.println(active.getValue());
        }
    }

    // print nodes with both children
    public void printNodesWithBothChildren(Node active) {
        if (active.hasNext() && active.hasPrevious()) {
            System.out.println(active.getValue());
            this.printNodesWithBothChildren(active.getPrevious());
            this.printNodesWithBothChildren(active.getNext());
        }
    }

    // get left nodes
//    public void printLeftNodes(Node active) {
//        if (active.hasPrevious()) {
//            this.printLeftNodes(active.getPrevious());
//        }
//        System.out.println(active.getValue());
//        if (active.hasNext()) {
//            this.printLeftNodes(active.getNext());
//        }
//    }

    public void printLeftNodes(Node active) {
        if (active.hasPrevious()) {
            System.out.println(active.getValue());
            this.printLeftNodes(active.getPrevious());
        }
        if (active.hasNext()) {
            this.printLeftNodes(active.getNext());
        }
    }

    public void printRightView(Node active) {
        System.out.println(active.getValue());
        if (active.hasNext()) {
            this.printRightView(active.getNext());
        }
    }
    // remove item from tree

    //get list from tree

    //
}
