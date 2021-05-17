package OOP.MasterChallenge;

public class Main {
    public static void main(String[] args) {
        BaseBurger base = new BaseBurger("white", "beef", 4.00);
        HealthyBurger healthyBurger = new HealthyBurger("chicken", 5.00);
        Delux delux = new Delux("Italian", "steak", 6.50, "wedges", "water"    );
        System.out.println(base.getBasePrice());
        base.setCarrot(true);
        base.setPickles(true);
        base.setTomato(true);
        base.setLettuce(true);
        base.calculatePrice();
        System.out.println(base.getPrice());

        System.out.println();
        System.out.println(healthyBurger.getBasePrice());
        healthyBurger.setCarrot(true);
        healthyBurger.setLettuce(true);
        healthyBurger.setPickles(true);
        healthyBurger.setTomato(true);
        healthyBurger.setCheeses(true);
        healthyBurger.setChill(true);
        healthyBurger.calculatePrice();
        System.out.println(healthyBurger.getPrice());


    }
}
