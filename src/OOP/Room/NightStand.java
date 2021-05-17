package OOP.Room;

public class NightStand {
    private String color;
    private Area area;
    private int drawers;
    private boolean isOpen;

    public NightStand(String color, Area area, int drawers) {
        this.color = color;
        this.area = area;
        this.drawers = drawers;
    }

    public NightStand(String color, Area area) {
        this(color, area, 0);
    }

    public NightStand(Area area) {
        this("wood", area, 0);
    }

    public NightStand() {
        this("wood", new Area(1,1,1), 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getDrawers() {
        return drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    public void setOpen() {
        this.isOpen = true;
    }

    public void setClose() {
        this.isOpen = false;
    }

    public void setDrawerStatus(boolean status) {
        if (status) {
            setOpen();
        } else {
            setClose();
        }
    }
}
