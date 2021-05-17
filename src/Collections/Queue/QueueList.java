package Collections.Queue;

import java.util.LinkedList;

public class QueueList {
    private LinkedList<Node> list;

    public QueueList(Node item) {
        list = new LinkedList<>();
        this.list.add(item);
    }


}
