package OOP.Room;

public class BedSheets {
    private String type;
    private boolean bedMade;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void makeBed() {
        System.out.println("Bed made... called from sheets");
    }

    public void setBedMade(boolean state) {
        this.bedMade = state;
    }

    public boolean getBedMade() {
        return this.bedMade;
    }
}
