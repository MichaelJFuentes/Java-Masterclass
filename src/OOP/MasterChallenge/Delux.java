package OOP.MasterChallenge;

public class Delux extends BaseBurger {
    private String chips;
    private String drink;

    public Delux(String roll, String meat, double price, String chips, String drink) {
        super(roll,meat, price);
        this.chips = chips;
        this.drink = drink;
    }

}
