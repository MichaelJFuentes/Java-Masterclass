package OOP.Room;

public class Area {
    private double width;
    private double length;
    private double height;

    public Area(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Area(double width, double length) {
        this(width, length, 1);
    }

    public Area() {
        this(0,0,0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return (this.length * this.width) * this.height;
    }
}
