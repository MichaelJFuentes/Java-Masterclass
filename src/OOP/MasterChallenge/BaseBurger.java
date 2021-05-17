package OOP.MasterChallenge;

public class BaseBurger {
    private String roll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean pickles;
    private String name;
    private double price;
    private int extraCount;
    private double basePrice;

    public BaseBurger(String roll, String meat, double price) {
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.basePrice = price;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }

    public String getRoll() {
        return roll;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isPickles() {
        return pickles;
    }



    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void calculatePrice() {
        if (lettuce) {
            extraCharge();
        }
        if (tomato) {
            extraCharge();
        }
        if (carrot) {
            extraCharge();
        }
        if (pickles) {
            extraCharge();
        }
    }

    public void extraCharge() {
        this.price += .25;
        extraCount++;
    }

    public double getPrice() {
        return price;
    }
}
