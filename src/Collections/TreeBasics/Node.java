package Collections.TreeBasics;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    // add value to tree
    public void insert(int value) {
        if (value <= this.value) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    // check if tree contains a certain value
    public boolean contains(int value) {
        // check if current node is equal to value
        if (this.value == value) {
            return true;
        }
        // check if current node is less than value
        else if (value < this.value) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        }
        // check if current node is greater in value
        else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

}
