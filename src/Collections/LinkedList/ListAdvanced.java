package Collections.LinkedList;

public class ListAdvanced {
    private Node start;
    private Node end;
    public int length;

    public ListAdvanced(Node start) {
        this.start = start;
        this.end = this.start;
        this.length = 1;
    }

    public ListAdvanced(int number) {
        this(new Node(number));
    }

    public void add(int number) {
        Node temp = new Node(number);
        temp.setPrevious(end);
        end.setNext(temp);
        end = temp;
        this.length++;
    }


}
