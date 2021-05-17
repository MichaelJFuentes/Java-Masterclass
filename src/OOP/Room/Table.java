package OOP.Room;

public class Table {
    private String type;
    private Area area;
    private boolean isClean;

    public Table(String type, Area area, boolean isClean) {
        this.type = type;
        this.area = area;
        this.isClean = isClean;
    }

    public Table(Area area) {
        this("Wood", area, true);
    }

    public Table() {
        this("Wood", new Area(3,5), true);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void cleanTable() {
        this.isClean = true;

        System.out.println("Table cleaned");
    }
}
