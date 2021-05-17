package OOP.Room;

public class Position {
    private int x;
    private int y;
    private int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position() {
        this(0,0,0);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void move(int x) {
        move(x, 0, 0);
    }

    public void move(int x, int y) {
        move(x,y,0);
    }

    public void move(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPositions() {
        return new int[]{x,y,z};
    }
}
