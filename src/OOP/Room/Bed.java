package OOP.Room;

public class Bed {
    private String size;
    private int years;
    private int base;
    private BedSheets sheets;
    private Area area;

    public Bed(String size, int years, int base, BedSheets sheets) {
        this.size = size;
        this.years = years;
        this.base = base;
        this.sheets = sheets;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public BedSheets getSheets() {
        return sheets;
    }

    public void setSheets(BedSheets sheets) {
        this.sheets = sheets;
    }

    public void sleep() {
        System.out.println("Going to bed");
        sheets.setBedMade(false);
    }

    public void makeBed() {
        System.out.println("Bed made");
        sheets.setBedMade(true);
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setArea(double width, double length, double height ) {
        setArea(new Area(width, length, height));
    }




}
