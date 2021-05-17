package AbstractClassesAndInterfaces.PlaylistChallenge;

public class Bat extends AbstractBasicSubClass implements CanFly{
    public Bat() {
        super("Bat");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }

    @Override
    public void eat() {
        System.out.println("Bat is eating blood");
    }

    @Override
    public void breathe() {
        System.out.println("Bat is breathing deeply");
    }
}
