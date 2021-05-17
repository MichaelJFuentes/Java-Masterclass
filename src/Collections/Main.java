package Collections;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("AMC", 8, 12);
        theater.getSeats();
        if (theater.reserveSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
