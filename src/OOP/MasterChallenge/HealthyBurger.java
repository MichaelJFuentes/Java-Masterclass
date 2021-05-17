package OOP.MasterChallenge;

public class HealthyBurger extends BaseBurger {
    private boolean chill;
    private boolean cheeses;

    public HealthyBurger(String meat, double price) {
        super("brown rye", meat, price);
    }

    public boolean isChill() {
        return chill;
    }

    public boolean isCheeses() {
        return cheeses;
    }

    public void setChill(boolean chill) {
        this.chill = chill;
    }

    public void setCheeses(boolean cheeses) {
        this.cheeses = cheeses;
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        if (chill) {
            super.extraCharge();
        }
        if (cheeses) {
            super.extraCharge();
        }
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }
}
