package AbstractClassesAndInterfaces.PlaylistChallenge;

import AbstractClassesAndInterfaces.AbstractionBasics;

public class AbstractBasicSubClass extends AbstractionBasics {
    public AbstractBasicSubClass(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }
}
