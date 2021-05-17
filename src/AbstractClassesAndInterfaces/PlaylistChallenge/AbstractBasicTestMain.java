package AbstractClassesAndInterfaces.PlaylistChallenge;

import AbstractClassesAndInterfaces.AbstractionBasics;

public class AbstractBasicTestMain {
    public static void main(String[] args) {
        AbstractionBasics dog;
        dog = new AbstractBasicSubClass("dog");
        System.out.println(dog.getName());
        dog.breathe();
        dog.eat();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
    }
}
