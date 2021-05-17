package OOP;

public class WallTest {
    public static void main(String[] args) {
        Wall wall = new Wall(-1.5,5);
        System.out.println("Area: " + wall.getArea());
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
    }
}
