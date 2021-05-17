package AbstractClassesAndInterfaces;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumbers = 0;
    private boolean cluchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void opperateCluck(boolean in) {
        this.cluchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < gears.size() && this.cluchIsIn) {
            this.gearNumbers = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind");
            this.gearNumbers = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(cluchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(gearNumbers).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}