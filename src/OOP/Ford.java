package OOP;

class Ford extends Car {
    public Ford() {
        super("Jeep", 6);
    }

    public String getName() {
        System.out.println("from Jeep");
        return super.getName();
    }
}

