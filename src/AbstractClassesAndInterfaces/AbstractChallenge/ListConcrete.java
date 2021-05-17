package AbstractClassesAndInterfaces.AbstractChallenge;

import java.lang.reflect.Array;
import java.util.List;

public class ListConcrete extends ListAbstract{

    public ListConcrete(Object current) {
        super(current);
    }

    @Override
    ListAbstract next() {
        return this.rightLink;
    }

    @Override
    ListAbstract setNext(ListAbstract item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListAbstract previous() {
        return this.leftLink;
    }

    @Override
    ListAbstract setPrevious(ListAbstract item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListAbstract item) {
        if (item != null) {
            return ((String) super.getCurrent()).compareTo((String) item.getCurrent());
        } else {
            return -1;
        }
    }
}
