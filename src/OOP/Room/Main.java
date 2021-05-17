package OOP.Room;

public class Main {
    public static void main(String[] args) {
        Person player = new Person();
        System.out.println(player);
        player.getPosition();

        player.setPosition(5,5,3);
        player.getPosition();

        Table table = new Table("desk", new Area(26,54, 30), true);
        System.out.println(table.getArea().calculateArea());


    }
}
