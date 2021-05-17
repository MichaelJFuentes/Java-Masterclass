package OOP;

public class FizzBuzz {

    public static void main(String[] args) {
        boolean fizz;
        boolean buzz;
        String msg;
        for (int i = 1; i <= 100; i++) {
            fizz = i % 3 == 0;
            buzz = i % 5 == 0;
            if (fizz && buzz) {
                msg = "FizzBuzz";
            } else if (fizz) {
                msg = "Fizz";
            } else if (buzz) {
                msg = "Buzz";
            } else {
                msg = String.valueOf(i);
            }
            System.out.println(msg);
        }
    }
}
