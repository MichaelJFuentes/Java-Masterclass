package AbstractClassesAndInterfaces.AbstractChallenge;

public interface NodeList {
    ListAbstract getRoot();
    boolean addItem(ListAbstract item);
    boolean removeItem(ListAbstract item);
    void traverse(ListAbstract root);
}
