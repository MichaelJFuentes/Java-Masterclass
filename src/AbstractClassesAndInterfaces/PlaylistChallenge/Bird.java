package AbstractClassesAndInterfaces.PlaylistChallenge;

import AbstractClassesAndInterfaces.AbstractionBasics;

public class Bird extends AbstractBasicSubClass implements CanFly{
    public Bird() {
        super("bird");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird is peaking seeds");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathing from their tiny nose");
    }
}
