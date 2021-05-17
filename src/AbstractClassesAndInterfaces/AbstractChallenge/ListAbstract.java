package AbstractClassesAndInterfaces.AbstractChallenge;


import java.util.*;

public abstract class ListAbstract {
    protected ListAbstract rightLink = null;
    protected ListAbstract leftLink = null;

    protected Object current;

    public ListAbstract(Object current) {
        this.current = current;
    }

    abstract ListAbstract next();
    abstract ListAbstract setNext(ListAbstract item);
    abstract ListAbstract previous();
    abstract ListAbstract setPrevious(ListAbstract item);

    abstract int compareTo(ListAbstract item);

    public Object getCurrent() {
        return current;
    }

    public void setCurrent(Object current) {
        this.current = current;
    }
}
