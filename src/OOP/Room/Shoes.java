package OOP.Room;

public class Shoes {
    private String color;
    private boolean isOld;
    private String type;
    private int steps;

    public Shoes(String color, boolean isOld, String type, int steps) {
        this.color = color;
        this.isOld = isOld;
        this.type = type;
        this.steps = steps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

}
