package Collections.LinkedList;

public class Node {
    private Node previous;
    private Node next;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.previous != null) {
            return true;
        }
        return false;
    }
}
