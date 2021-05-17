package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Normal car", 4);
        Jeep jeep = new Jeep();
        FourRunner fourRunner = new FourRunner();

        System.out.println(car.getName());
        System.out.println();
        System.out.println(jeep.getName());
        System.out.println();
        System.out.println(fourRunner.getName());
    }
}

class Car {
    private String name;
    private int cylinders;
    private int wheels = 4;
    private boolean engine = true;
    private int speed = 0;

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        System.out.println("From Car");
        return name;
    }

    public int getCylinders() {
        System.out.println("From Car");
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Engine is on");
    }
    public void accelerate(int speed) {
        if (speed < 0) {
            return;
        } else {
            this.speed += speed;
        }
    }

    public void brake(int speed) {
        if (speed < 0) {
            return;
        }
        this.speed -= speed;
    }
}

class FourRunner extends Car {
    public FourRunner() {
        super("4runner", 4);
    }

    public String getName() {
        System.out.println("from 4runner");
        return super.getName();
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 6);
    }

    public String getName() {
        System.out.println("from Jeep");
        return super.getName();
    }
}

