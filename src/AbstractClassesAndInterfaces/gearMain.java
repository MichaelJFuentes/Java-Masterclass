package AbstractClassesAndInterfaces;

public class gearMain {
    public static void main(String[] args) {
        GearBox toyota = new GearBox(6);
//        GearBox.Gear first = toyota.new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));
        // using private gear
        toyota.addGear(1,5.3);
        toyota.addGear(2, 10.6);
        toyota.addGear(3, 15.9);
        toyota.opperateCluck(true);
        toyota.changeGear(1);
        toyota.opperateCluck(false);
        System.out.println(toyota.wheelSpeed(1000));
        toyota.changeGear(2);
        System.out.println(toyota.wheelSpeed(1000));
        toyota.opperateCluck(true);
        toyota.changeGear(2);
        System.out.println(toyota.wheelSpeed(1000));

    }
}
