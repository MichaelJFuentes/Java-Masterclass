package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPersonalClass <T extends Object> {
    private Set<T> setList;
    private final String className;

    public SetPersonalClass(String className) {
        this.className = className;
        this.setList = new HashSet<>();
    }

    public boolean addToSet(T itemToAdd) {
        if (itemToAdd == null) {
            System.out.println("Item passed can not be null");
            return false;
        } else if (this.setList.contains(itemToAdd)) {
            System.out.println("The set already contains " + itemToAdd);
            return false;
        } else {
            System.out.println(itemToAdd + " was added to list");
            return this.setList.add(itemToAdd);
        }
    }
    // how are items compared using the .equal notation, so memeory location does not matter
    public boolean removeFromSet(T itemToRemove) {
        if (this.setList.contains(itemToRemove)) {
            System.out.println(itemToRemove + " was removed from the list");
            return this.setList.remove(itemToRemove);

        } else {
            if (itemToRemove == null) {
                System.out.println("Item can not be null");
                return false;
            }
            System.out.println(itemToRemove + " was not found in list");
            return false;
        }
    }

    // add things in order?
    // return a copy of set
    public Set<T> getSetList() {
        return new HashSet<>(this.setList);
    }

    // get iterator of list
    public Iterator<T> getIterator() {
        return this.setList.iterator();
    }
    // print values with or without hash
    public void printValues(boolean includeHash) {
        for (T item : this.setList) {
            if(includeHash) {
                System.out.println(item + " --> " + item.hashCode());
            } else {
                System.out.println(item);
            }
        }
    }

    // print values in set
    public void printValues() {
        printValues(false);
    }

    public long sumOfSet() {
        long sum = 0;
        for (T item :
                this.setList) {
            sum += item.hashCode(); 
        }
       return sum;
    }

}
