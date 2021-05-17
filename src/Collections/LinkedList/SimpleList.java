package Collections.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {
    private Node Start;
    private Node current;
    public int length;

    public SimpleList(Node start) {
        Start = start;
        this.current = this.Start;
        this.length = 1;
    }

    public SimpleList(int number) {
        this(new Node(number));
    }

    // add to list
    public void add(int number) {
        Node temp = new Node(number);
        temp.setPrevious(this.current);
        this.current.setNext(temp);
        this.current = temp;
        length++;
    }

    // print values
//    public void print() {
//        Node active = this.Start;
//        while (active.hasNext()) {
//            System.out.println(active.getValue());
//            active = active.getNext();
//        }
//        System.out.println(active.getValue());
//    }
// using recursion
    private void print(Node active) {
        System.out.println(active.getValue());
        if (active.hasNext()) {
            this.print(active.getNext());
        }
    }
    public void print() {
        this.print(this.Start);
    }

    // contains
//    public boolean contains(int value) {
//        Node active = this.Start;
//        while (active.hasNext()) {
//            if (value == active.getValue()) {
//                return true;
//            }
//            active = active.getNext();
//        }
//        if (active.getValue() == value) {
//            return true;
//        }
//        return false;
//    }

    // contains using recursion
    private boolean contains(Node active, int seek) {
        if (active.getValue() == seek) {
            return true;
        } else if (active.hasNext()) {
            return this.contains(active.getNext(),seek);
        } else {
            return false;
        }
    }

    public boolean contains(int number) {
        return this.contains(this.Start, number);
    }


    public void push(int value) {
        Node temp = new Node(value);
        Start.setPrevious(temp);
        temp.setNext(Start);
        Start = temp;
        length++;
    }

    public void addInOrder(int number ){
        Node temp = new Node(number);
        Node active = this.Start;
        while (true) {
            if (temp.getValue() < active.getValue()) {
                if (!active.hasPrevious()) {
                    active.setPrevious(temp);
                    temp.setNext(active);
                    Start = temp;
                } else {
                    active.getPrevious().setNext(temp);
                    temp.setPrevious(active.getPrevious());
                    temp.setNext(active);
                    active.setPrevious(temp);
                }
                break;
            } else {
                if (active.getNext() == null) {
                    temp.setPrevious(active);
                    active.setNext(temp);
                    current = temp;
                    break;
                } else {
                    active = active.getNext();
                }
            }
        }
    }
// add using recursion
//    public void insert(int number) {
//        this.insert(this.Start, new Node(number));
//    }
//
//    private void insert(Node active, Node add) {
//        if (active.getValue() < add.getValue()) {
//            if (active.hasNext()) {
//                this.insert(active.getNext(), add);
//            } else {
//                active.setNext(add);
//                add.setPrevious(active);
//            }
//        } else {
//            if (active.hasPrevious()) {
//                this.insert(active.getPrevious(), add);
//            } else {
//
//            }
//        }
//    }

    // remove item
    public boolean remove(int value) {
        Node active = Start;
        while (active.hasNext()) {
            if (active.getValue() == value) {
                // link previous to current one way
                active.getPrevious().setNext(active.getNext());
                // link next to previous
                active.getNext().setPrevious(active.getPrevious());
                this.length--;
                return true;
            }
            active = active.getNext();
        }
        if (active.getValue() == value) {
            active.getPrevious().setNext(null);
            current = active.getPrevious();
            //active.getNext().setPrevious(active.getPrevious());
            return true;
        }
        return false;
    }

    public void printBackWords() {
        Node active = this.current;
        while (active.hasPrevious()) {
            System.out.println(active.getValue());
            active = active.getPrevious();
        }
        System.out.println(active.getValue());
    }

    // print back-words using recursion
    private void backWordsPrint(Node active) {
        System.out.println(active.getValue());
        if (active.hasPrevious()) {
            this.backWordsPrint(active.getPrevious());
        }
    }

    public void backWordsPrint() {
        this.backWordsPrint(this.current);
    }

    public ArrayList<Integer> integerArrayList() {
        Node active = this.Start;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (active.hasNext()) {
            arrayList.add(active.getValue());
            active = active.getNext();
        }
        arrayList.add(active.getValue());
        return arrayList;
    }

    public Node getNode(int value) {
        Node active = this.Start;
        while (active.hasNext()) {
            if (active.getValue() == value) {
                return active;
            }
            active = active.getNext();
        }
        if (active.getValue() == value) {
            return active;
        }
        return null;
    }
//
//    public Node getNode(int value ) {
//        Node active = this.Start;
//        do{
//            if (active.getValue() == value) {
//                return active;
//            }
//            active = active.getNext();
//        } while (active.hasNext());
//        return null;
//    }

}
