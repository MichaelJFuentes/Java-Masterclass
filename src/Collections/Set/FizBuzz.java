package Collections.Set;

public class FizBuzz {
    public static void main(String[] args) {
        fizBuzz();
        fizBuzzUpdate();
    }

    public static void fizBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }
            else {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    public static void fizBuzzUpdate() {
        for (int i = 0; i < 101; i++) {
            String msg = "";
            if (i % 3 == 0) {
                msg += "Fizz";
            }
            if (i % 5 == 0) {
                msg += "Buzz";
            }
            if (msg.isBlank()) {
                System.out.println(i);
            } else {
                System.out.println(msg);
            }
        }
    }
}
