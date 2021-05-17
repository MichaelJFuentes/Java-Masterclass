package OOP.Room;

public class Computer {
    private Area area;
    private String type;
    private boolean isOn;
    private int displayNumber;
    private int ports;

    public Computer(Area area, String type, boolean isOn, int displayNumber, int ports) {
        this.area = area;
        this.type = type;
        this.isOn = isOn;
        this.displayNumber = displayNumber;
        this.ports = ports;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(int displayNumber) {
        this.displayNumber = displayNumber;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }
}
