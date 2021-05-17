package OOP.Room;

public class Phone {
    private String name;
    private int powerState;

    public Phone(String name, int powerState) {
        this.name = name;
        this.powerState = powerState;
    }

    public Phone() {
        this("Smart Phone", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerState() {
        return powerState;
    }

    public void setPowerState(int powerState) {
        this.powerState = powerState;
    }

    public void displayText() {
        System.out.println("Hello world");
    }
}
