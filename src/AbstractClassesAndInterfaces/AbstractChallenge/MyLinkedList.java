package AbstractClassesAndInterfaces.AbstractChallenge;

public class MyLinkedList implements NodeList{

    private ListAbstract root = null;

    public MyLinkedList(ListAbstract root) {
        this.root = root;
    }

    @Override
    public ListAbstract getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListAbstract item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListAbstract currentItem = this.root;
        while (currentItem != null) {
            int compare = currentItem.compareTo(item);
            if (compare < 0 ) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (compare > 0 ) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getCurrent() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListAbstract item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getCurrent() );

        }
        ListAbstract currentItem = this.root;
        while (currentItem != null) {
            int compare = currentItem.compareTo(item);
            if (compare == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (compare < 0) {
                currentItem = currentItem.next();

            }
        }
        return true;
    }

    @Override
    public void traverse(ListAbstract root) {
        if (root == null ) {
            System.out.println("List is empty ");
        } else {
            while (root != null) {
                System.out.println(root.getCurrent());
                root = root.next();
            }
        }
    }
}
